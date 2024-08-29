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
        String expectedOutput = "Value -> 1" + System.lineSeparator() +
                "Value -> 2" + System.lineSeparator() +
                "Value -> 3" + System.lineSeparator();

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
        String expectedOutput = "Value -> 1" + System.lineSeparator() +
                "Value -> 2" + System.lineSeparator() +
                "Value -> 4" + System.lineSeparator() +
                "Value -> 5" + System.lineSeparator() +
                "Value -> 3" + System.lineSeparator() +
                "Value -> 6" + System.lineSeparator() +
                "Value -> 7" + System.lineSeparator();

        //then
        assertEquals(expectedOutput, outContent.toString());

    }



}