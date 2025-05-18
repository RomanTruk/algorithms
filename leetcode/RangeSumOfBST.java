package leetcode;

import java.util.Stack;

public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (node.val >= low && node.val <= high) {
                sum += node.val;
            }

            if (node.val > low && node.left != null) {
                stack.push(node.left);
            }

            if (node.val < high && node.right != null) {
                stack.push(node.right);
            }
        }

        return sum;
    }
}
