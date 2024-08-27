package pl.nyczjablonska.recursion;

public class Node {
    private Node leftNode;
    private Node rightNode;
    private int value;

    public Node(Node leftNode, Node rightNode, int value) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.value = value;
    }

    public static void dfs(Node node){
        if(node == null){
            return;
        }
        System.out.println("Value -> " + node.value);
        dfs(node.leftNode);
        dfs(node.rightNode);
    }
}
