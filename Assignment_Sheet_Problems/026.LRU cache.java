class LRUCache {
    class Node
{
    int key,value;
    Node(int k,int v)
    {
        this.key=k;
        this.value=v;
    }
}
    int capacity;
    Map<Integer,Node>map=new HashMap<>();
    Deque<Node>q=new LinkedList<>();
    public LRUCache(int capacity) {
        this.capacity=capacity;
        
    }
    
    public int get(int key) {
        if(map.get(key)==null)
        {
            return -1;
        }
        Node temp=map.get(key);
        q.remove(temp);
        q.addFirst(temp);
        return map.get(key).value;
        
    }
    
    public void put(int key, int value) {
        if(map.get(key)!=null)
        {
            Node temp=map.get(key);
            temp.value=value;
            q.remove(temp);
            q.addFirst(temp);
        }
        else
        {
            
            if(q.size()==capacity)
            {
                Node node=q.removeLast();
                map.remove(node.key);
                
            }
            // System.out.println(q.size());
            Node node=new Node(key,value);
            map.put(key,node);
            q.addFirst(node);
        }
        
    }
}

