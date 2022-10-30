class LRUCache {
    class Node
    {
        Node prev,next;
        int key,val;
        Node(int k,int v)
        {
            this.key=k;
            this.val=v;
        }
        Node(){}
    }
    int capacity,count;
    Map<Integer,Node>map;
    Node head,tail;
    Deque<Node>q=new LinkedList<>();
    public LRUCache(int capacity) {
        this.capacity=capacity;
        count=0;
        map=new HashMap<>();
        head=new Node();
        tail=new Node();
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        Node temp=map.get(key);
        if(temp==null)
            return -1;
        else
        {
            remove(temp);
            add(temp);
            return temp.val;
        }
        
    }
    
    public void put(int key, int value) {
        Node temp=map.get(key);
        if(temp==null)
        {
            Node nn=new Node(key,value);
            map.put(key,nn);
            add(nn);
            count++;
        }
        else
        {
            temp.val=value;
            remove(temp);
            add(temp);
        }
        if(count>capacity)
        {
            Node del=tail.prev;
            remove(del);
            map.remove(del.key);
            count--;
        }
    }
    public void add(Node nn)
    {
        nn.next=head.next;
        nn.prev=head;
        head.next=nn;
        nn.next.prev=nn;
    }
    public void remove(Node nn)
    {
        nn.prev.next=nn.next;
        nn.next.prev=nn.prev;
    }
}

