/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // Edge Cases Null Pointer Exception
        if(headA == null || headB == null){
            return null;
        }

        //Assign nodes to respective heads & check if tails are different.If that so both will never intersect
        ListNode nodeA = headA;
        ListNode nodeB = headB;

        while(nodeA.next != null){
            nodeA = nodeA.next;
        }
        while(nodeB.next != null){
            nodeB = nodeB.next;
        }

        // Checking if tail are different and return null
        if(nodeA != nodeB){
            return null;
        }

        /*
        Assigning nodes to respective head and traverse it to tail
        and then resassign to crossed head as whole cycle length  will get equal.
        (Commutative Property of Addition  a+b = b+a)
        */
        nodeA = headA;
        nodeB = headB;
        // Will iterate  till both node intersect
        while(nodeA != nodeB){
            if(nodeA.next !=null){  // it will traverse to tail and then assign it to cross head
                nodeA = nodeA.next;
            }else{
                // if we try to do nodeA.next  = headB as it should be to join
                // head but it will make it cyclic and break the rule so we need to jump to one position
                nodeA = headB;
            }

            if(nodeB.next !=null){
                nodeB = nodeB.next;
            }else{
                nodeB = headA;
            }
        }
        return nodeA;

    }
}