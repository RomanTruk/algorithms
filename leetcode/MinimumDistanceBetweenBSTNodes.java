package leetcode;

public class MinimumDistanceBetweenBSTNodes {
    TreeNode prev = null;
    int result = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return result;
    }

    private void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);

        if (prev != null) {
            result = Math.min(result, root.val - prev.val);
        }

        prev = root;
        inOrder(root.right);
    }
}
