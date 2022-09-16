/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l4=new ListNode(0);
        ListNode l3=l4;
        int carry=0;
        while(l1!=null &&l2!=null)
        {
            int data=l1.val+l2.val+carry;
            carry=data/10;
            l3.next=new ListNode(data%10);
            l3=l3.next;
            l2=l2.next;
            l1=l1.next;
        }
        while(l1!=null)
        {
            int data=l1.val+carry;
            carry=data/10;
            l3.next=new ListNode(data%10);
            l3=l3.next;
            l1=l1.next;
        }
        
        while(l2!=null)
        {
            int data=l2.val+carry;
            carry=data/10;
            l3.next=new ListNode(data%10);
            l3=l3.next;
            l2=l2.next;
        }
        if(carry==1)
        {
            l3.next=new ListNode(carry);
        }
        return l4.next;
    }
}
