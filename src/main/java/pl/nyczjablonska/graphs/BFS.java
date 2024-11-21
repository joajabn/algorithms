package pl.nyczjablonska.graphs;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {
    /**
     *                  0
     *               /     \
     *             /        \
     *           /           \
     *         /              \
     *       1                2
     *     /   \            /  \
     *    3     4         5      6
     *   / \   /  \     / \     / \
     *  7  8  9   10  11  12  13  14
     *
     *
     **/
    public static Node tree(){
        var node14 = new Node(null, null, 14);
        var node13 = new Node(null, null, 13);
        var node12 = new Node(null, null, 12);
        var node11 = new Node(null, null, 11);
        var node10 = new Node(null, null, 10);
        var node9 = new Node(null, null, 9);
        var node8 = new Node(null, null, 8);
        var node7 = new Node(null, null, 7);
        var node6 = new Node(node13, node14, 6);
        var node5 = new Node(node11, node12, 5);
        var node4 = new Node(node9, node10, 4);
        var node3 = new Node(node7, node8, 3);
        var node2 = new Node(node5, node6, 2);
        var node1 = new Node(node3, node4, 1);
        return new Node(node1, node2, 0);
    }

    static void printElements(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        //offer
        System.out.println(root.value());
        queue.offer(root.left());
        queue.offer(root.right());
        while(!queue.isEmpty()){
            Node polled = queue.poll();
            System.out.println(polled.value());
            if(polled.left() != null){
                queue.offer(polled.left());
            }
            if(polled.right() != null){
                queue.offer(polled.right());
            }
        }
    }

    public static void main(String[] args) {
        printElements(tree());
    }
}
