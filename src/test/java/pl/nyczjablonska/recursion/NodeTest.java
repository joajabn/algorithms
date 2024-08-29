package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    @Test
    public void testDfs3Nodes() {
        // given
        Node leftNode = new Node(null, null, 2);
        Node rightNode = new Node(null, null, 3);
        Node root = new Node(leftNode, rightNode, 1);

        //when
        Node.dfs(root);

        //expected output
        String expectedOutput = """
                Value -> 1
                Value -> 2
                Value -> 3
                """;

        // Verify output
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testDfs7Nodes() {
        //given
        Node leftNode = new Node(
                new Node(null, null, 4),
                new Node(null, null, 5),
                2);
        Node rightNode = new Node
                (new Node(null, null, 6),
                new Node(null, null, 7),
                3);
        Node root = new Node(leftNode, rightNode, 1);

        //when
        Node.dfs(root);

        //expected output
        String expectedOutput = """
                Value -> 1
                Value -> 2
                Value -> 4
                Value -> 5
                Value -> 3
                Value -> 6
                Value -> 7
                """;

        //then
        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    public void testDfs6Nodes() {
        //given
        Node leftNode = new Node(
                new Node(null, null, 4),
                new Node(null, null, 5),
                2);
        Node rightNode = new Node
                (new Node(null, null, 6), null, 3);
        Node root = new Node(leftNode, rightNode, 1);

        //when
        Node.dfs(root);

        //expected output
        String expectedOutput = """
                Value -> 1
                Value -> 2
                Value -> 4
                Value -> 5
                Value -> 3
                Value -> 6
                """;

        //then
        assertEquals(expectedOutput, outContent.toString());
    }

    /**
     *                  0
     *               /     \
     *             /        \
     *           /           \
     *         /              \
     *       1   ___________>  2
     *     /                 /  \
     *    3                 5    6
     *   / \               / \
     *  7  8 <-------------   -- 9
     *
     *
     **/
    @Test
    public void testDfsNodes() {
        //given
        var node9 = new Node(null, null, 9);
        var node8 = new Node(null, null, 8);
        var node7 = new Node(null, null, 7);
        var node6 = new Node(null, null, 6);
        var node5 = new Node(node8, node9, 5);
        var node3 = new Node(node7, node8, 3);
        var node2 = new Node(node5, node6, 2);
        var node1 = new Node(node3, node2, 1);
        Node root = new Node(node1, node2,  0);

        //when
        Node.dfs(root);

        //excepted output
        String expectedOutput = """
                Value -> 0
                Value -> 1
                Value -> 3
                Value -> 7
                Value -> 8
                Value -> 2
                Value -> 5
                Value -> 9
                Value -> 6
                """;

        //then
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testCalculateTreeHeight3() {
        //given
        Node leftNode = new Node(
                new Node(null, null, 4),
                new Node(null, null, 5),
                2);
        Node rightNode = new Node
                (new Node(null, null, 6), null, 3);
        Node root = new Node(leftNode, rightNode, 1);

        //when
        int actual = Node.calculateTreeHeight(root);

        //then
        assertEquals(3, actual);
    }

    @Test
    public void testCalculateTreeHeight5() {
        //given
        var node9 = new Node(null, null, 9);
        var node8 = new Node(null, null, 8);
        var node7 = new Node(null, null, 7);
        var node6 = new Node(null, null, 6);
        var node5 = new Node(node8, node9, 5);
        var node3 = new Node(node7, node8, 3);
        var node2 = new Node(node5, node6, 2);
        var node1 = new Node(node3, node2, 1);
        Node root = new Node(node1, node2,  0);

        //when
        int actual = Node.calculateTreeHeight(root);

        //then
        assertEquals(5, actual);
    }

}