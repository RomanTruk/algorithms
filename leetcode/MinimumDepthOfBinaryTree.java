package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 1));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            TreeNode node = current.treeNode();
            int depth = current.depth();

            if (node.left == null && node.right == null) {
                return depth;
            }

            if (node.left != null) {
                queue.offer(new Pair(node.left, depth + 1));
            }

            if (node.right != null) {
                queue.offer(new Pair(node.right, depth + 1));
            }
        }

        return 0;

    }

    private record Pair(TreeNode treeNode, int depth) {
    }
}

