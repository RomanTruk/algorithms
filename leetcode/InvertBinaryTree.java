package leetcode;

import java.util.Stack;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();

            TreeNode temp = currentNode.left;
            currentNode.left = currentNode.right;
            currentNode.right = temp;

            if (currentNode.left != null) {
                stack.add(currentNode.left);
            }

            if (currentNode.right != null) {
                stack.add(currentNode.right);
            }
        }

        return root;
    }
}
