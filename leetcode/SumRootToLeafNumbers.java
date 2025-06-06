package leetcode;

public class SumRootToLeafNumbers {
    int sum = 0;

    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode node, int num) {
        if (node == null) {
            return;
        }

        num = num * 10 + node.val;

        if (node.left == null && node.right == null) {
            sum += num;
        }

        dfs(node.left, num);
        dfs(node.right, num);
    }
}
