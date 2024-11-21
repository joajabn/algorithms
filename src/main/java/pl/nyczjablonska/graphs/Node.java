package pl.nyczjablonska.graphs;

public record Node(
        Node left,
        Node right,
        int value
) {
}
