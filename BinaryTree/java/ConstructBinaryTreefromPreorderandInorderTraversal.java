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
    int preOrderIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int len = inorder.length;
        Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        preOrderIndex = 0;

        for(int i = 0;i < len ; i++){
            hashMap.put(inorder[i],i);
        }

        return constructTree(0,len - 1,preorder,hashMap);
    }

    private TreeNode constructTree(int start,int end,int[] preorder,Map<Integer,Integer> hashMap){
        if(start > end)return null;

        TreeNode node = new TreeNode(preorder[preOrderIndex]);
        int inOrderIndex = hashMap.get(preorder[preOrderIndex++]);

        node.left = constructTree(start,inOrderIndex-1,preorder,hashMap);
        node.right = constructTree(inOrderIndex +1,end,preorder,hashMap);

        return node;
    }
}