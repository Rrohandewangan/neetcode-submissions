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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
         TreeNode curr = root;
         int cnt = 0, ans = -1;

         while(true) {
            if(curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                if(st.isEmpty()) {
                    break;
                } else {
                    curr = st.pop();
                    cnt++;

                    if(cnt == k) ans = curr.val;
                    curr = curr.right;
                }
            }
         }
        return ans;
    }
}
