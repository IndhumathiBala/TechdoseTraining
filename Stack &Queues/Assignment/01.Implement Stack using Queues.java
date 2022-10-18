class MyStack {
    LinkedList<Integer> q;
    public MyStack() {
        q=new LinkedList<>(); 
    }
    
    public void push(int x) {
      
        q.add(x);
        int size=q.size();
        int i=0;
        while(!q.isEmpty() && i<size-1)
        {
            q.add(q.poll());
            i++;
        }
    }
    
    public int pop() {
        if(!q.isEmpty())
            return q.poll();
        return -1;
    }
    
    public int top() {
        if(!q.isEmpty())
            return q.peek();
        return -1;
        
    }
    
    public boolean empty() {
        return q.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
