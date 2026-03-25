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
    public ListNode findnthnode(ListNode temp,int val)
    {
        int count=1;
        while(temp!=null){
            if(count==val){
                return temp;
            }
            count++;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        ListNode temp=head;
        int len=1;
        ListNode tail=head;
        while(tail.next!=null){
        tail=tail.next;
        len++;
         
        }
        if(k%len==0){
       return head;
        }
      k=k%len;
      tail.next=head;
      int val=len-k;
    ListNode newnode=findnthnode(head,val);
    head=newnode.next;
    newnode.next=null;
      return head;
    }
}