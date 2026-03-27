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
    public ListNode mergeNodes(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode res=head;
        ListNode temp=head.next;
        int sum=0;
        while(temp!=null ){
         if(temp.val!=0){
            sum=sum+temp.val;
         }
        else{
            res=res.next;
            res.val=sum;
            sum=0;
        }
              temp=temp.next;
        }
        res.next=null;
       return head.next;
    }
}