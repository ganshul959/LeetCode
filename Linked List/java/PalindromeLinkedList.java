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

/*
Here our goal is to complete in O(n) time and O(1) space complexity.
1. So we can't use extra array/List to store all(n) elements but we can
use extra one or two(finite) no of ListNode to cater O(1)mspace complexity.
2. while time complexity we have to do it in one iteration O(n) so we will
be using two pointer technique.(Slow and fast two pointer technique.
Approach --> So our approah will be to go to the mid of list and reverse the
second half list(reverse linked list) and then compare value to 1st half and
second half value of linked list
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null){
            slow =slow.next;
        }

        slow = reverse(slow);
        fast = head;

        while(slow != null){
            if(slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        if(head == null){
            return null;
        }

        ListNode prev = head;
        while(prev.next != null){
            ListNode curr = prev.next;
            prev.next = curr.next;
            curr.next = head;
            head  = curr;
        }
        return head;
    }
}