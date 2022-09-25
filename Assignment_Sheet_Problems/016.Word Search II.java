class Solution {
    List<String>ans=new ArrayList<>();
    private static Node root;
    Solution()
    {
        root=new Node();
    }
    class Node
    {
        Node[]link=new Node[26];
        int count;
        String word;
        Node(){}
        boolean containsKey(char ch)
        {
            return link[ch-'a']!=null;
        }
        void put(char ch,Node node)
        {
            link[ch-'a']=node;
        }
        Node get(char ch)
        {
            return link[ch-'a'];
        }
    }
    public void insert(String s)
    {
        Node node=root;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!node.containsKey(ch))
                node.put(ch,new Node());
            node=node.get(ch);
                
        }
        node.word=s;
        node.count+=1;
    }
    static void solve(char [][]board,int i,int j,int r,int c,List<String>ans,Node node)
    {
        char ch=board[i][j];
        if(board[i][j]=='$'||node.get(ch)==null)
            return;
        node=node.get(ch);
            if(node.count>0)
            {
                ans.add(node.word);
                node.count-=1;
            }
        ch=board[i][j];
        board[i][j]='$';
        if(i>0)
            solve(board,i-1,j,r,c,ans,node);
        if(i<r-1)
            solve(board,i+1,j,r,c,ans,node);
        if(j>0)
            solve(board,i,j-1,r,c,ans,node);
        if(j<c-1)
            solve(board,i,j+1,r,c,ans,node);
        board[i][j]=ch;
    }
    public List<String> findWords(char[][] board, String[] words) {
        for(String word:words)
        {
            insert(word);
        }
        int m=board.length,n=board[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                solve(board,i,j,m,n,ans,root);
            }
        }
        return ans;
        
    }
}
