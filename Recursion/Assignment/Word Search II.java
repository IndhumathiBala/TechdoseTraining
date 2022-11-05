class Solution {
    List<String>res=new ArrayList<>();
    Solution()
    {
        root=new Node();
    }
    static Node root;
    class Node
    {
        Node []link=new Node[26];
        int count=0;
        String word;
        Node()
        {
            
        }
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
            {
                node.put(ch,new Node());
            }
            node=node.get(ch);
        }
        node.count++;
        node.word=s;
    }
    public void solve(char [][]board,int i,int j,int m,int n,Node node)
    {
        char ch=board[i][j];
        if(board[i][j]=='$' || node.get(ch)==null)
        {
            return ;
        }
        node=node.get(ch);
        if(node.count>0 )
        {
            res.add(node.word);
            node.count--;
        }
        board[i][j]='$';
        if(i>0)
            solve(board,i-1,j,m,n,node);
        if(i<m-1)
            solve(board,i+1,j,m,n,node);
        if(j>0)
            solve(board,i,j-1,m,n,node);
        if(j<n-1)
            solve(board,i,j+1,m,n,node);
        board[i][j]=ch;
    }
    public List<String> findWords(char[][] board, String[] words)     {
        int m=board.length,n=board[0].length;
        for(String w:words)
        {
            insert(w);
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                solve(board,i,j,m,n,root);
            }
        }
        return res;
    }
}
