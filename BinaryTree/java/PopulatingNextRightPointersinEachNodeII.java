/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        final Queue<Node> queue = new LinkedList<Node>();

        if(root == null)return null;

        queue.add(root);
        while(!queue.isEmpty()){
            int level_size = queue.size();

            for(int i = 0; i < level_size; i++){
                final Node node = queue.poll();
                if(i != level_size-1)
                    node.next = queue.peek();
                if(node.left != null)queue.add(node.left);
                if(node.right != null)queue.add(node.right);


            }
        }
        return root;
    }
}