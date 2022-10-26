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
    public void insertAtEnd(int data)
    {
        Node nn=new Node(data);
        Node temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=nn;
        nn.next=head;
    }
    public void insertAtPos(int pos,int data)
    {
       Node temp=head;
       if(pos==1)insertAtBeg(data);
       else
       {
           Node nn=new Node(data);
           for(int i=1;i<pos-1;i++)
           {
               temp=temp.next;
           }
           nn.next=temp.next;
           temp.next=nn;
       }
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
}
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        list.insertAtBeg(1);
        list.insertAtBeg(2);
        list.insertAtBeg(3);
        list.insertAtEnd(4);
        list.display();
        list.insertAtPos(2,5);
        list.insertAtPos(2,6);
        
        list.display();
    }
}
