package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalTwo {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (root != null && !q.isEmpty()) {
            int count = q.size();
            List<Integer> row = new LinkedList<>();
            for (int i = 0; i < count; i++) {
                TreeNode node = q.poll();
                row.add(node.val);

                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            result.addFirst(row);
        }

        return result;
    }
}
