
//METHOD 1===> RECURSION
import java.util.*;
public class Main
{
    static Stack<Integer>stack=new Stack<>();
    static void insert(int x)
    {
        if(stack.isEmpty())
        {
            stack.push(x);
        }
        else{
            int a=stack.pop();
            insert(x);
            stack.push(a);
        }
    }
    static void reverse()
    {
        if(stack.size()>0)
        {
            int x=stack.pop();
            reverse();
            insert(x);
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        stack.push(sc.nextInt());
	    }
	    reverse();
	    for(int i:stack)
	    {
	        System.out.print(i+" ");
	    }
	   // stack.stream().forEach(s->System.out.println(stack));
	}
}
// ==================================================================================
// METHOD 2=> USING LINKED LIST
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
class Stack
{
    Node top;
    void push(int data)
    {
        if(top==null)
        {
            top=new Node(data);
        }
        else
        {
            Node nn=new Node(data);
            nn.next=top;
            top=nn;
        }
    }
    void reverse()
    {
        Node prev=null,curr=top,next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //update head to point to last node
        top=prev;
    }
    void display()
    {
        Node temp=top;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class Main
{
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    Stack stack=new Stack();
	    while(n-->0)
	    {
	        stack.push(sc.nextInt());
	    }
	    stack.display();
	    stack.reverse();
	    stack.display();
	}
}

