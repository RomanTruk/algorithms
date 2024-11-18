package interview;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class CycledDirectGraphCheck {
    private static class Node {
        private List<Node> children;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        private boolean isCycledGraph() {
            Stack<Node> stack = new Stack<>();
            Set<Node> visited = new HashSet<>();

            stack.push(this);

            while (!stack.isEmpty()) {
                Node current = stack.pop();
                visited.add(current);

                if (current.children != null) {
                    for (Node child : current.children) {
                        if (visited.contains(child)) {
                            return true;
                        }
                        stack.push(child);
                    }
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node child1 = new Node(2);
        Node child2 = new Node(3);
        Node grandchild1 = new Node(4);
        Node grandchild2 = new Node(5);

        child1.children = List.of(grandchild1, grandchild2);
        grandchild2.children = List.of(child1);
        root.children = List.of(child1, child2);

        System.out.println("Graph is cycled: " + root.isCycledGraph());
    }
}
