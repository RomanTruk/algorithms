package interview;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class CycledUndirectGraphCheck {
    private static class Node {
        private List<Node> children;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        private boolean isCycledGraph() {
            Stack<NodePair> stack = new Stack<>();
            Set<Node> visited = new HashSet<>();

            stack.push(new NodePair(this, null));

            while (!stack.isEmpty()) {
                NodePair currentPair = stack.pop();
                Node current = currentPair.node;
                Node parent = currentPair.parent;

                if (visited.contains(current)) {
                    return true;
                }

                visited.add(current);

                if (current.children != null) {
                    for (Node child : current.children) {
                        if (child != parent) {
                            stack.push(new NodePair(child, current));
                        }
                    }
                }
            }

            return false;
        }
    }

    private static class NodePair {
        Node node;
        Node parent;

        public NodePair(Node node, Node parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node child1 = new Node(2);
        Node child2 = new Node(3);
        Node grandchild1 = new Node(4);

        root.children = List.of(child1, child2);
        child1.children = List.of(root, grandchild1);
        grandchild1.children = List.of(child1);
//        grandchild1.children = List.of(child1, root); // cycled

        System.out.println("Graph is cycled: " + root.isCycledGraph());
    }
}
