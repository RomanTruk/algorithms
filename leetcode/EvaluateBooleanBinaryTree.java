package leetcode;

public class EvaluateBooleanBinaryTree {
    public boolean evaluateTree(TreeNode root) {
        return helper(root);
    }

    private boolean helper(TreeNode root) {
        if (root.val == 0 || root.val == 1) {
            return root.val == 1;
        } else if (root.val == 2) {
            return helper(root.left) || helper(root.right);
        } else if (root.val == 3) {
            return helper(root.left) && helper(root.right);
        }

        return false;
    }
}
