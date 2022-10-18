class MyStack {
    Stack<Integer> s;
    Integer minEle;
    MyStack() { 
        s = new Stack<Integer>(); 
        
    }
    void getMin()
    {
        if (s.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println(minEle);
    }
    void peek()
    {
        if (s.isEmpty()) {
            System.out.println("Stack is empty ");
            return;
        }
 
        Integer t = s.peek(); 
        if (t < minEle)
            System.out.println(minEle);
        else
            System.out.println(t);
    }
    void pop()
    {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Integer t = s.pop();
        if (t < minEle) {
            System.out.println(minEle);
            minEle = 2 * minEle - t;
        }
 
        else
            System.out.println(t);
    }
    void push(Integer x)
    {
        if (s.isEmpty()) {
            minEle = x;
            s.push(x);
            return;
        }
        if (x < minEle) {
            s.push(2 * x - minEle);
            minEle = x;
        }
        else
            s.push(x);
    }
}
 
