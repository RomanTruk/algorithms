package leetcode;

import java.util.Stack;

public class SecondMinimumNodeInBinaryTree {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;

        int min = root.val;
        long secondMin = Long.MAX_VALUE;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (node.val > min && node.val < secondMin) {
                secondMin = node.val;
            }

            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }

        return secondMin != Long.MAX_VALUE ? (int) secondMin : -1;
    }
}
