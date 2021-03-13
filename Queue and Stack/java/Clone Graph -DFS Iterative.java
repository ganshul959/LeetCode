/*
Given a reference of a node in a connected undirected graph.
Return a deep copy (clone) of the graph.
Each node in the graph contains a val (int) and a list (List[Node]) of its neighbors.

class Node {
    public int val;
    public List<Node> neighbors;
}
*/
class Solution {
    public Node cloneGraph(Node root) {
        if (root == null) return null;

        // use a stack to help DFS
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        // use a map to save cloned nodes
        Map<Node, Node> map = new HashMap<Node, Node>();

        // clone the root
        map.put(root, new Node(root.val));

        while (!stack.isEmpty()) {
            Node node = stack.pop();

            // handle the neighbors
            for (Node neighbor : node.neighbors) {
                if (!map.containsKey(neighbor)) {
                    // clone the neighbor
                    map.put(neighbor, new Node(neighbor.val));
                    // add it to the next level
                    stack.push(neighbor);
                }

                // copy the neighbor
                map.get(node).neighbors.add(map.get(neighbor));
            }
        }

        return map.get(root);
    }
}