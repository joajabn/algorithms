package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private final int[] sortedArray = {2, 3, 5, 8, 11, 15, 17, 25, 29, 34, 38};
    private final int firstIndex = 0;
    private final int lastIndex = sortedArray.length - 1;
    @Test
    public void testBinarySearchRightExists(){
        //given
        int numberToFind = 34;

        //when
        int actual = BinarySearch.search(sortedArray, firstIndex, lastIndex, numberToFind);

        //then
        assertEquals(9, actual);
    }
    @Test
    public void testBinarySearchLeftExists(){
        //given
        int numberToFind = 5;

        //when
        int actual = BinarySearch.search(sortedArray, firstIndex, lastIndex, numberToFind);

        //then
        assertEquals(2, actual);
    }
    @Test
    public void testBinarySearchMiddleExists(){
        //given
        int numberToFind = 15;

        //when
        int actual = BinarySearch.search(sortedArray, firstIndex, lastIndex, numberToFind);

        //then
        assertEquals(5, actual);
    }
    @Test
    public void testBinarySearchLeftDoesNotExist(){
        //given
        int numberToFind = 1;

        //when
        int actual = BinarySearch.search(sortedArray, firstIndex, lastIndex, numberToFind);

        //then
        assertEquals(-1, actual);
    }
    @Test
    public void testBinarySearchRightDoesNotExist(){
        //given
        int numberToFind = 40;

        //when
        int actual = BinarySearch.search(sortedArray, firstIndex, lastIndex, numberToFind);

        //then
        assertEquals(-1, actual);
    }
    @Test
    public void testBinarySearchMiddleDoesNotExist(){
        //given
        int numberToFind = 14;

        //when
        int actual = BinarySearch.search(sortedArray, firstIndex, lastIndex, numberToFind);

        //then
        assertEquals(-1, actual);
    }
}