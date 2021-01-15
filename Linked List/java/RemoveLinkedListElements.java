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
    public ListNode removeElements(ListNode head, int val) {

        if(head == null){
            return null;
        }

        ListNode dummy = new ListNode(-1, head);  // A dummy node to whose point before head
        ListNode first = dummy;
        ListNode second = dummy;

        second = second.next;  // Make it a forward node
        while(second != null){
            if(second.val == val){
                first.next = second.next;  // If found, remove that node
            }else{
                first = first.next;
            }
            second = second.next;
        }
        return dummy.next; // returning head it also helps from null pointer exception as well
    }
}