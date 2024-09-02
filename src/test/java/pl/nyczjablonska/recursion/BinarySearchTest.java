package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    public void testBinarySearch(){
        //given
        int[] sortedArray = {1, 3, 5, 8, 11, 15, 17, 25, 29, 34, 38};
        int numberToFind = 34;
        int firstIndex = 0;
        int lastIndex = sortedArray.length - 1;

        //when
        int actual = BinarySearch.search(sortedArray, firstIndex, lastIndex, numberToFind);

        //then
        assertEquals(9, actual);
    }


}