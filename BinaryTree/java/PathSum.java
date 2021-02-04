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
    boolean result = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {

        checkSum(root,targetSum,0);
        return result;
    }

    private void checkSum(TreeNode node,int targetSum, int cal){
        if(node == null){
            return;
        }

        if(node.left == null && node.right == null){
            cal = cal + node.val;
            if(targetSum == cal){
                result = true;
            }
            return;
        }

        checkSum(node.left,targetSum,cal + node.val);
        checkSum(node.right,targetSum,cal + node.val);
    }
}