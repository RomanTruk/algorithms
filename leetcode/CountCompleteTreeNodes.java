package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int count = 1;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null) {
                    q.offer(curr.left);
                    count++;
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                    count++;
                }
            }
        }

        return count;
    }

    // recurvion
//    public int countNodes(TreeNode root) {
//        return root != null ? 1 + countNodes(root.left) + countNodes(root.right) : 0;
//    }
}
