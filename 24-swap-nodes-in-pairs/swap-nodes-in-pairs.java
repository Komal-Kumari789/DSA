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
    public ListNode swapPairs(ListNode head) {
        ListNode n1=new ListNode(0);
        n1.next=head;
        ListNode prev =n1;
        while (prev.next!=null && prev.next.next!=null){
            ListNode f=prev.next;
            ListNode s=f.next;
            f.next=s.next;
            s.next=f;
            prev.next=s;
            prev=f;
        }
        return n1.next;
    }
}