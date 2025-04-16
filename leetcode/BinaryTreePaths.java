package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, String.valueOf(root.val)));

        while (!stack.isEmpty()) {
            Pair current = stack.pop();
            TreeNode node = current.key();
            String path = current.value();

            if (node.left == null && node.right == null) {
                result.add(path);
            }

            if (node.right != null) {
                stack.push(new Pair(node.right, path + "->" + node.right.val));
            }

            if (node.left != null) {
                stack.push(new Pair(node.left, path + "->" + node.left.val));
            }
        }

        return result;
    }

    record Pair(TreeNode key, String value) {
    }
}
