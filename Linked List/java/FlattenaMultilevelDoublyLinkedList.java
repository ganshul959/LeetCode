/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null){
            return null;
        }

        Node curr = head;
        while(curr != null){
            if(curr.child != null){
                Node nextNode = curr.next;
                Node childNode = flatten(curr.child);

                curr.child = null;
                curr.next = childNode;
                childNode.prev = curr;

                while(curr.next != null){
                    curr = curr.next;
                }
                curr.next = nextNode;
                if(nextNode != null){
                    nextNode.prev = curr;
                }
            }
            curr =curr.next;
        }
        return head;
    }
}