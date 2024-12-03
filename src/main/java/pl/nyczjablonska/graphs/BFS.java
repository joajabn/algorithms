package pl.nyczjablonska.graphs;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class BFS {
    /**
     * 0
     * /     \
     * /        \
     * /           \
     * /              \
     * 1                2
     * /   \            /  \
     * 3     4         5      6
     * / \   /  \     / \     / \
     * 7  8  9   10  11  12  13  14
     **/
    public static Node tree() {
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

    /**
     * 0
     * /     \
     * /        \
     * /           \
     * /              \
     * 1   ___________>  2
     * /                 /  \
     * 3                 5    6
     * / \               / \
     * 7  8 <-------------   -- 9
     **/
    public static Node graph() {
        var node9 = new Node(null, null, 9);
        var node8 = new Node(null, null, 8);
        var node7 = new Node(null, null, 7);
        var node6 = new Node(null, null, 6);
        var node5 = new Node(node8, node9, 5);
        var node3 = new Node(node7, node8, 3);
        var node2 = new Node(node5, node6, 2);
        var node1 = new Node(node3, node2, 1);
        return new Node(node1, node2, 0);
    }

    /**
     * (4)
     * 1 ------,
     * (9) |       | (4)
     * |       |
     * |  (1)  |   (9)
     * 2 ----- 3 ----- 4
     * |       |       |
     * |       | (2)   | (2)
     * |       |       |
     * '-----  5 ----- 0
     * (10)         (3)
     */
    public static int[][] notDirectedGraph() {
        int n = 6;
        int[][] graph = new int[n][n];
        graph[0][4] = 2;
        graph[0][5] = 3;
        graph[1][2] = 9;
        graph[1][3] = 0;
        graph[1][4] = 9;
        graph[2][1] = 9;
        graph[2][3] = 1;
        graph[2][5] = 10;
        graph[3][1] = 4;
        graph[3][2] = 1;
        graph[3][4] = 0;
        graph[3][5] = 2;
        graph[4][0] = 2;
        graph[4][1] = 9;
        graph[4][3] = 0;
        graph[5][0] = 3;
        graph[5][2] = 10;
        graph[5][3] = 2;
        graph[1][3] = 4;
        return graph;
    }

    /**
     * (10)
     * 0 ----------> 4
     * | \            ^
     * (5)  |  \  (45)     |  (25)
     * |   \_______,  |
     * v           \  |
     * 1 --> 2 -----> 3
     * (20)   (1)
     */
    public static int[][] directedGraph() {
        int n = 5;
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = 0;
            }
        }
        graph[0][1] = 5;
        graph[0][3] = 45;
        graph[0][4] = 10;
        graph[1][2] = 20;
        graph[2][3] = 1;
        return graph;
    }


    static void printElements(Node root, Set<Node> alreadyPrinted) {
        Queue<Node> queue = new ArrayDeque<>();
        //offer
        System.out.println(root.value());
        alreadyPrinted.add(root);
        queue.offer(root.left());
        queue.offer(root.right());
        while (!queue.isEmpty()) {
            Node polled = queue.poll();
            if (!alreadyPrinted.contains(polled)) {
                System.out.println(polled.value());
                alreadyPrinted.add(polled);
                if (polled.left() != null && !alreadyPrinted.contains(polled.left())) {
                    queue.offer(polled.left());
                }
                if (polled.right() != null && !alreadyPrinted.contains(polled.right())) {
                    queue.offer(polled.right());
                }
            }
        }
    }

    static void printElements(int[][] matrix, Set<Integer> alreadyPrinted, int startingVertex) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(startingVertex);
        while (!queue.isEmpty()) {
            Integer polled = queue.poll();
            System.out.println(polled);
            alreadyPrinted.add(polled);
            startingVertex = polled;
            for (int x = 0, y = startingVertex; x < rows; x++) {
                if (matrix[x][y] != 0 && !alreadyPrinted.contains(x) && !queue.contains(x)) {
                    queue.offer(x);
                }
            }
        }

    }

    public static void main(String[] args) {
//        Set<Node> alreadyPrinted = new HashSet<>();
//        printElements(tree(), alreadyPrinted);
//        System.out.println("-------------");
//        alreadyPrinted.clear();
//        printElements(graph(), alreadyPrinted);

        //#2 with matrix
        int[][] matrix = {{1, 1, 1, 0, 0, 0, 0},
                {1, 1, 0, 1, 1, 0, 0},
                {1, 0, 1, 0, 0, 1, 1},
                {0, 1, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 1}};
        Set<Integer> alreadyPrintedElement = new HashSet<>();
        printElements(notDirectedGraph(), alreadyPrintedElement, 0);
    }
}
