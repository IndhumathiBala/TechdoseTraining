import java.util.*;
class LinkedList
{
	Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    LinkedList()
    {
        head=null;
    }
    public void insertAtBegin(int data)
    {
        Node nn=new Node(data);
        if(head==null)
        {
            head=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
    }
    public void deleteAtEnd()
    {
        Node temp=head,prev=null;
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }
    public void deleteAtBegin()
    {
       head=head.next;
    }
    public void deleteAtPos(int pos)
    {
        Node temp=head,prev=null;
        if(pos==1)deleteAtBegin();
        else{
            for(int i=1;i<pos;i++)
            {
                prev=temp;
                temp=temp.next;
            }
            prev.next=temp.next;
        }
    }
    public void display()
    {
        Node temp=head;
        System.out.println("The elements in the linked list are");
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("\n");
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    LinkedList list=new LinkedList();
	    for(int i=0;i<5;i++)
	    {
	        list.insertAtBegin(i);
	    }
	    int n=0;
	    do{
	        System.out.println("0.Exit \n1.deleteAtBeginning \n"+"2.deleteAtEnd\n3.deleteAtPos");
	        n=sc.nextInt();
	        int pos=0;
	        switch(n)
	        {
	            case 1:
	                list.deleteAtBegin();
	                list.display();
	                break;
	            case 2:
	                list.deleteAtEnd();
	                list.display();
	                break;
	            case 3:
	                pos=sc.nextInt();
	                list.deleteAtPos(pos);
	                list.display();
	                break;
	                
	            default :
	                return;
	        }
	    }
	    while(n!=0);
	}
}
