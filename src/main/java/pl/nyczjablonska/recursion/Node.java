package pl.nyczjablonska.recursion;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Node {
    private final Node leftNode;
    private final Node rightNode;
    private final int value;

    public Node(Node leftNode, Node rightNode, int value) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.value = value;
    }

    public static void dfs(Node node) {
        Set<Node> nodeSet = new HashSet<>();
        dfsRecursive(node, nodeSet);
    }

    private static void dfsRecursive(Node node, Set<Node> nodeSet) {
        if (node == null) {
            return;
        }
        if (!nodeSet.contains(node)) {
            nodeSet.add(node);
            System.out.println("Value -> " + node.value);
            dfsRecursive(node.leftNode, nodeSet);
            dfsRecursive(node.rightNode, nodeSet);
        }
    }

    public static int calculateTreeHeight(Node node) {
        Set<Node> nodeSet = new HashSet<>();
        return maxHeight(node, nodeSet);
    }

    private static int maxHeight(Node node, Set<Node> nodeSet) {
        if (node == null) {
            return 0;
        }
        if (!nodeSet.contains(node)) {
            nodeSet.add(node);
            int leftHeight = maxHeight(node.leftNode, nodeSet);
            int rightHeight = maxHeight(node.rightNode, nodeSet);
            return Math.max(leftHeight, rightHeight) + 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return value == node.value && Objects.equals(leftNode, node.leftNode) && Objects.equals(rightNode, node.rightNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftNode, rightNode, value);
    }
}
