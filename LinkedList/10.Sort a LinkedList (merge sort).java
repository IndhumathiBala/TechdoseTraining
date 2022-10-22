/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        if(head==null || head.next==null)
        return head;
        Node mid=getMid(head);
        Node nextOfMid=mid.next;
        mid.next=null;
        Node left=mergeSort(head);
        Node right=mergeSort(nextOfMid);
        Node sorted=merge(left,right);
        return sorted;
    }
    static Node getMid(Node head)
    {
        Node slow=head,fast=head;
        if(head==null)
        return head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
    static Node merge(Node left,Node right)
    {
        Node res=null;
        if(left==null)return right;
        if(right==null)return left;
        if(left.data<=right.data)
        {
            res=left;
            res.next=merge(left.next,right);
        }
        else
        {
            res=right;
            res.next=merge(left,right.next);
        }
        
        return res;
    }
}
