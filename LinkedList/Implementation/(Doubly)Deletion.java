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
    public void deleteAtBeg()
    {
       head.next.prev=null;
       head=head.next;
    }
    public void deleteAtEnd()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.prev.next=null;
    }
    public void deleteAtPos(int pos)
    {
        Node temp=head;
        if(pos==1)deleteAtBeg();
        else
        {
        for(int i=1;i<pos;i++)
        {
            temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
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
        list.insertAtBeg(3);
        list.insertAtBeg(1);
        list.insertAtBeg(7);
        list.display();
        System.out.println();
        list.deleteAtBeg();
        list.display();
        System.out.println();
        list.deleteAtEnd();
        list.display();
        System.out.println();
        list.deleteAtPos(2);
        list.display();
        
    }
}
