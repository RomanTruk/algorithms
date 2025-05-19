package leetcode;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.add(root.val);

        dfs(root, result);

        return result;
    }

    private void dfs(Node node, List<Integer> result) {
        for (Node n : node.children) {
            result.add(n.val);
            dfs(n, result);
        }
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
