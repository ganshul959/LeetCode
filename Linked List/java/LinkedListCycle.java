* Definition for singly-linked list.
        * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        if(head == null || head.next == null){
            return false;
        }
        ListNode slowNode = head;
        ListNode fastNode = head;
        int idx = 1;
        while(fastNode.next != null){
            fastNode = fastNode.next;
            if(idx%2 == 0){
                slowNode = slowNode.next;
            }
            idx++;
            if(slowNode == fastNode){
                return true;
            }

        }
        return false;
    }
}