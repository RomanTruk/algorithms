package interview;

import java.util.List;
import java.util.Stack;

public class SumOfGraphDepthFirstTraversal {
    private static class Node {

        private List<Node> children;
        private int value;

        private int sum() {
            int total = 0;
            Stack<Node> stack = new Stack<>();

            stack.push(this);

            while (!stack.isEmpty()) {
                Node current = stack.pop();
                total += current.value;

                if (current.children != null) {
                    for (Node child : current.children) {
                        stack.push(child);
                    }
                }
            }

            return total;
        }
    }

    public static void main(String[] args) {
        Node root = new Node();
        root.value = 1;

        Node child1 = new Node();
        child1.value = 2;

        Node child2 = new Node();
        child2.value = 3;

        Node grandchild1 = new Node();
        grandchild1.value = 4;

        Node grandchild2 = new Node();
        grandchild2.value = 5;

        child1.children = List.of(grandchild1, grandchild2);

        root.children = List.of(child1, child2);

        System.out.println("Total Sum: " + root.sum());
    }
}
