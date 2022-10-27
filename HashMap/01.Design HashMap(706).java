class MyHashMap {
    int []arr;
    public MyHashMap() {
        arr=new int[1000001];
        Arrays.fill(arr,-1);
    }
    
    public void put(int key, int value) {
        arr[key]=value;
    }
    
    public int get(int key) {
        return arr[key];
    }
    
    public void remove(int key) {
        arr[key]=-1;
    }
}
// ============================================================
// linked list
class MyHashMap {
    Node []node;
    public MyHashMap() {
        node=new Node[10001];
    }
    
    public void put(int key, int value) {
        int i=index(key);
          if(node[i]==null)
          {
                node[i]=new Node(-1,-1);
          }
        Node prev=find(node[i],key);
        if(prev.next==null)
        {
            prev.next=new Node(key,value);
        }
        else
        {
            prev.next.v=value;
        }
    }
    
    public int get(int key) {
        int i=index(key);
        if(node[i]==null)
            return -1;
        Node p=find(node[i],key);
        if(p.next!=null)
            return p.next.v;
        return -1;
        
    }
    
    public void remove(int key) {
        int index=index(key);
        if(node[index]!=null)
        {
        Node p=find(node[index],key);
        if(p.next!=null)
        {
            p.next=p.next.next;
        }
        }
        
    }
    public Node find(Node p,int val)
    {
        Node prev=null;
            for(; p!=null && p.k!=val;)
            {
                prev=p;
               p=p.next;
            }
        return  prev;
    }
    public int index(int val)
    {
        return val%node.length;
    }
    class Node
    {
        int k,v;
        Node next;
        Node(int key,int value)
        {
            this.k=key;
            this.v=value;
        }
    }
}


