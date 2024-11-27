package pl.nyczjablonska.graphs;

import java.util.*;

public class ContactList {
    public static List<Node> binaryTree3LevelsAsList(){
        var node6 = new Node(null, null, 6);
        var node5 = new Node(null, null, 5);
        var node4 = new Node(null, null, 4);
        var node3 = new Node(null, null, 3);
        var node2 = new Node(node5, node6, 2);
        var node1 = new Node(node3, node4, 1);
        Node root = new Node(node1, node2, 0);
        return List.of(root, node1, node2, node3, node4, node5, node6);
    }

    /**
     *            0
     *          /
     *        1
     *
     *        2
     *         \
     *          3
     *
     **/
    public static List<Node> fourVertexesTwoEdgesAsList(){
        var node3 = new Node(null, null, 3);
        var node2 = new Node(node3, null, 2);
        var node1 = new Node(null, null, 1);
        Node node0 = new Node(node1, null, 0);
        return List.of(node0, node1, node2, node3);
    }
    static boolean canCall(Node from, Node to){
        int searched = to.value();
        Queue<Node> queue = new ArrayDeque<>();
        Set<Integer> alreadySearched = new HashSet<>();
        if(from.left() != null){
            queue.offer(from.left());
        }
        if(from.right() != null){
            queue.offer(from.right());
        }
        while(!queue.isEmpty()){
            Node polled = queue.poll();
            if(!alreadySearched.contains(polled.value())) {
                if (polled.value() == searched) {
                    return true;
                }
                alreadySearched.add(polled.value());
                if(polled.left() != null){
                    queue.offer(polled.left());
                }
                if(polled.right() != null){
                    queue.offer(polled.right());
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node to = new Node(null, null, 8);
        System.out.println(canCall(fourVertexesTwoEdgesAsList().get(0), fourVertexesTwoEdgesAsList().get(1)));
        System.out.println(canCall(fourVertexesTwoEdgesAsList().get(0), fourVertexesTwoEdgesAsList().get(2)));
    }
}
