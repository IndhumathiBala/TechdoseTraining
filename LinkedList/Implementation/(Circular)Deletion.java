import java.util.*;
class LinkedList
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
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
            nn.next=head;
            
        }
        else{
            nn.next=head;
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            nn.next=head;
            temp.next=nn;
            head=nn;
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp.next!=head)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
     public void deleteAtEnd()
     {
         Node temp=head,prev=null;
         while(temp.next!=head)
         {
             prev=temp;
             temp=temp.next;
         }
         prev.next=head;
     }
    public void deleteAtBeg()
    {
        if(head==null)return;
        Node temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=head.next;
        head=head.next;
    }
    public void deleteAtPos(int pos)
    {
        if(pos==1)deleteAtBeg();
        else
        {
            Node prev=null,temp=head;
            for(int i=1;i<pos;i++)
            {
                prev=temp;
                temp=temp.next;
            }
            prev.next=temp.next;
        }
    }
}
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        list.insertAtBeg(1);
        list.insertAtBeg(2);
        list.insertAtBeg(3);
        list.insertAtBeg(4);
        list.insertAtBeg(5);
        list.insertAtBeg(6);
        list.display();
        list.deleteAtBeg();
        list.display();
        list.deleteAtEnd();
        list.display();
        list.deleteAtPos(2);
        list.deleteAtPos(3);
        list.display();
    }
}
