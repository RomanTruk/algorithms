package leetcode;

import java.util.Stack;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode prev = null;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();

            if (prev != null && current.val <= prev.val) {
                return false;
            }
            prev = current;

            current = current.right;
        }

        return true;
    }
}
