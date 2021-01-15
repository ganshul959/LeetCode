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
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return null;
        }
        ListNode prev = head;
        while( prev.next != null){
            ListNode curr = prev.next;
            prev.next = curr.next;
            curr.next = head;
            head = curr;
        }
        return head;
    }
}