package pl.nyczjablonska.graphs;

import java.util.Arrays;

public class PrimsMST {
    private static final int MAX_VALUE = Integer.MAX_VALUE;

    public static void primMST(int[][] graph) {
        int vertices = graph.length;
        int[] parent = new int[vertices];
        int[] key = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(key, MAX_VALUE);
        Arrays.fill(visited, false);

        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < vertices - 1; count++) {
            int minKey = minKey(key, visited, vertices);
            visited[minKey] = true;

            for (int v = 0; v < vertices; v++) {
                if (graph[minKey][v] != 0 && !visited[v] && graph[minKey][v] < key[v]) {
                    parent[v] = minKey;
                    key[v] = graph[minKey][v];
                }
            }
        }

        printMST(parent, graph);
    }

    private static int minKey(int[] key, boolean[] visited, int vertices) {
        int min = MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < vertices; v++) {
            if (!visited[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    private static void printMST(int[] parent, int[][] graph) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < parent.length; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    public static void main(String[] args) {
/*        3
     (1) -----(2)
    / |\       |
  2/  | \      |
  /   |  \5    |
(0)  8|   \   7|
  \   |    \   |
  6\  |     \  |
    \ |      \ |
     (3)------(4)
            9
* */
        int[][] graph = new int[][] {
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 }
        };

        primMST(graph);
    }
}
