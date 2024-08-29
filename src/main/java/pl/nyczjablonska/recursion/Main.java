package pl.nyczjablonska.recursion;

public class Main {
    public static void main(String[] args) {
        Node node = new Node(
                new Node(
                        new Node(null, null, 4),
                        new Node(null, null, 5),
                        2),
                new Node(new Node(null, null, 6),
                        new Node(null, null, 7),
                        3),
                1);
        node.dfs(node);
    }
}
