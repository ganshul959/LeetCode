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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        ListNode behind = dummy;

        for(int i = 1 ; i <= k ; i++){
            first = first.next;
        }
        behind = first;
        while(first != null){
            first = first.next;
            second = second.next;
        }
        int temp = behind.val;
        behind.val = second.val;
        second.val = temp;

        return head;
    }
}