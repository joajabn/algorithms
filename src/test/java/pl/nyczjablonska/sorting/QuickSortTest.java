package pl.nyczjablonska.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pl.nyczjablonska.sorting.MergeSortTest.checkIfSorted;

class QuickSortTest {
    private final QuickSort sort = new QuickSort();
    @Test
    public void shouldSortArray(){
        //given
        int[] array = {-887, -784, -784, -830,};

        //when
        int[] actual = sort.sort(array, 0, array.length - 1);

        //then
        int[] expected = {-887, -830, -784, -784};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void shouldReturnSortedArray(){
        //given
        long startTime = System.nanoTime();
        int[] array = new int[]{
                440, -335, -830, 595, -100, 431,
                -693, -574, -195, 361, -179, 952, -887, -747, 369, -396, 991, 450, 221, 403, -706, -435, -17, 263, 652,
                -366, -222, 307, 736, -784, 624, 178, 397, 613, 437, -744, 60, -103, -325, -767, -187, 535, 535, -331,
                201, 118, 432, 461, 366, 102, -521, -721, -632, 981, -585, 484, -63, -847, -341, -37, 181, 504, 454, 71,
                92, -693, 163, -397, 724, -31, 393, -602, 907, -392, 138, -751, 710, 198, -999, -826, 769, -355, -154,
                -958, -780, -819, -952, -5
        };

        //when
        int[] sortedArray = sort.sort(array, 0, array.length - 1);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Test duration: " + duration + "ns");

        //then
        checkIfSorted(sortedArray);
    }
}