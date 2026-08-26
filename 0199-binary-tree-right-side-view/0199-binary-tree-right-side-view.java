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
    List<Integer> res = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        solve(root, 0);
        return res;
    }

    void solve(TreeNode node, int level) {
        if (node == null) return;

        if (level == res.size()) res.add(node.val);

        solve(node.right, level + 1);
        solve(node.left, level + 1);
    }
}