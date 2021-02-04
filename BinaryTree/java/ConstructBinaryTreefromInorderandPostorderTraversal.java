/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int postOrderIndex ;
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        int len = inorder.length;
        Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        postOrderIndex = len -1;
        for(int i = 0 ; i < len;i++){
            hashMap.put(inorder[i],i);
        }

        return constructTree(0 ,len-1,postorder,hashMap);

    }
    private TreeNode constructTree(int start , int end ,int[] postorder,Map<Integer,Integer> hashMap){
        if(start > end)return null;

        TreeNode node = new TreeNode(postorder[postOrderIndex]);
        int inOrderIndex = hashMap.get(postorder[postOrderIndex--]);

        node.right = constructTree(inOrderIndex + 1 ,end,postorder,hashMap);
        node.left = constructTree(start, inOrderIndex -1,postorder,hashMap);

        return node;
    }
}