package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        boolean isLeftToRight = true;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int count = q.size();
            LinkedList<Integer> row = new LinkedList<>();
            for (int i = 0; i < count; i++) {
                TreeNode node = q.poll();

                if (isLeftToRight) {
                    row.addLast(node.val);
                } else {
                    row.addFirst(node.val);
                }

                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            result.add(row);
            isLeftToRight = !isLeftToRight;
        }

        return result;
    }
}
