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
first/second half list(reverse linked list) and then compare value to 1st half and
second half value of linked list
Break and reverse first/second half
 */

class Solution {
    public boolean isPalindrome(ListNode head) {
        // Checking Edge cases
        if(head == null || head.next == null){
            return true;
        }

        ListNode fast = head;
        // New list nodes for reversing 2nd half linked list
        ListNode temp = null ,newHead = null;
        // Two pointer ( slow and fast technique) and iterate tail of the list
        while(fast != null && fast.next != null){
            fast = fast.next.next;

            // Reverse 1st half linked list
            temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        // here head is slow pointer and reached mid of the list
        // if list length is odd, move head over one to start the second half of the list
        if(fast != null){
            head =  head.next;
        }

        // check for palindromicity
        while(head != null){
            if(head.val != newHead.val){
                return false;
            }
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }
}