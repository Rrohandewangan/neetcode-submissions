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
    public int findgoodNodes(TreeNode root, int maxVal) {
        if(root == null) return 0;
        
        int cnt = 0;

        if(root.val >= maxVal) {
            cnt++;
        }

        maxVal = Math.max(maxVal, root.val);

        cnt += findgoodNodes(root.left, maxVal);
        cnt += findgoodNodes(root.right, maxVal);

        return cnt;
    }
    public int goodNodes(TreeNode root) {
       return findgoodNodes(root, Integer.MIN_VALUE);
    }
}
