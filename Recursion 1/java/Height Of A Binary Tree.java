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
    int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        checkDepth(root,1);
        return maxDepth;
    }
    private void checkDepth(TreeNode root,int d){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            maxDepth = Math.max(maxDepth, d);
        }
        checkDepth(root.left, d+1);
        checkDepth(root.right, d+1);
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left,right) + 1;    // Here the last evaluated return value will be assigned to either current left or right variable
                                            // and the 1st time return(which will be sumed up of previous left or right) will be return to main
                                            //maxdepth method
    }
}