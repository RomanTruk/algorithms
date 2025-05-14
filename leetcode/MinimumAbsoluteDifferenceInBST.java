package leetcode;

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
public class MinimumAbsoluteDifferenceInBST {
    private Integer prev = null;
    private int diff = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        findMinDifference(root);
        return diff;
    }

    private void findMinDifference(TreeNode node) {
        if (node == null) return;

        findMinDifference(node.left);

        if (prev != null) {
            diff = Math.min(diff, node.val - prev);
        }
        prev = node.val;

        findMinDifference(node.right);
    }
}
