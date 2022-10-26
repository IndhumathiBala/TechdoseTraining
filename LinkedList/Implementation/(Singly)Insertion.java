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
    public void insertAtEnd(int data)
    {
        Node temp=head;
        Node nn=new Node(data);
        nn.next=null;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=nn;
    }
    public void insertAtBegin(int data)
    {
        Node nn=new Node(data);
        nn.next=null;
        if(head==null)
        {
            head=nn;
        }
        else
        {
           nn.next=head;
           head=nn;
        }
    }
    public void insertAtPos(int data,int pos)
    {
        Node temp=head;
        if(pos==1)insertAtBegin(data);
        else{
            Node nn=new Node(data);
            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            nn.next=temp.next;
            temp.next=nn;
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
	    int n=0;
	    do{
	        System.out.println("0.Exit \n1.insertAtBeginning \n"+"2.insertAtEnd\n3.InsertAtPos");
	        n=sc.nextInt();
	        int data=0,pos=0;
	        switch(n)
	        {
	            case 1:
	                data=sc.nextInt();
	                list.insertAtBegin(data);
	                list.display();
	                break;
	            case 2:
	                data=sc.nextInt();
	                list.insertAtEnd(data);
	                list.display();
	                break;
	            case 3:
	                System.out.println("Enter the data");
	                data=sc.nextInt();
	                System.out.println("Enter position");
	                pos=sc.nextInt();
	                list.insertAtPos(data,pos);
	                list.display();
	                break;
	                
	            default :
	                return;
	        }
	    }
	    while(n!=0);
	}
}
