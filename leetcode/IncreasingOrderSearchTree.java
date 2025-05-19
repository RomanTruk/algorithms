package leetcode;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }

        List<TreeNode> result = new ArrayList<>();

        inOrder(root, result);

        return tree(result, 0);
    }

    private void inOrder(TreeNode node, List<TreeNode> result) {
        if (node == null)
            return;

        inOrder(node.left, result);
        result.add(node);
        inOrder(node.right, result);
    }

    private TreeNode tree(List<TreeNode> result, int i) {
        if (i == result.size()) {
            return null;
        }

        TreeNode root = result.get(i);
        root.left = null;
        root.right = tree(result, i + 1);

        return root;
    }
}
