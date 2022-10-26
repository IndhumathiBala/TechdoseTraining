import java.util.*;
class LinkedList
{
	Node head;
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
            prev=null;next=null;
        }
    }
    LinkedList()
    {
        head=null;
    }
    public void insertAtBeg(int data)
    {
        Node nn=new Node(data);
        if(head==null)
        {
            head=nn;
        }
        else
        {
            nn.next=head;
            head.prev=nn;
            head=nn;
        }
        
    }
    public void insertAtEnd(int data)
    {
        Node nn=new Node(data);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=nn;
        nn.prev=temp;
    }
    public void insertAtPos(int pos,int data)
    {
        if(pos==1)
        {
            insertAtBeg(data);
        }
        else{
            Node nn=new Node(data);
            Node temp=head;
            int i=1;
            while(i<pos-1)
            {
                temp=temp.next;
                i++;
            }
            nn.prev=temp;
            nn.next=temp.next;
            temp.next=nn;
            
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
    }
}
public class Main
{
    public static void main(String []args)
    {
        LinkedList list=new LinkedList();
        list.insertAtBeg(5);
        list.insertAtBeg(6);
        list.display();
        System.out.println();
        list.insertAtEnd(4);
        list.insertAtEnd(7);
        list.display();
        System.out.println();
        list.insertAtPos(2,8);
        list.insertAtPos(3,9);
        list.display();
    }
}
