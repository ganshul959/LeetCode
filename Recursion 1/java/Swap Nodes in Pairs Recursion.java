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
        swap(head);
        return head;
    }

    private void swap(ListNode node){
        if(node == null || node.next == null)return;

        int temp = node.val;
        node.val = node.next.val;
        node.next.val = temp;
        swap(node.next.next);

    }
}