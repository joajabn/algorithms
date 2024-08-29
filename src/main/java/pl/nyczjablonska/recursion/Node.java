package pl.nyczjablonska.recursion;

import java.util.HashSet;
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

    public static void dfs(Node node){
        Set<Node> nodeSet = new HashSet<>();
        dfsRecursive(node, nodeSet);
    }

    private static void dfsRecursive(Node node, Set<Node> nodeSet) {
        if(node == null){
            return;
        }
        if (!nodeSet.contains(node)) {
            nodeSet.add(node);
            System.out.println("Value -> " + node.value);
            dfsRecursive(node.leftNode, nodeSet);
            dfsRecursive(node.rightNode, nodeSet);
        }
    }
}
