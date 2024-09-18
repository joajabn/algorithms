package pl.nyczjablonska.sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pl.nyczjablonska.sorting.MergeSortTest.checkIfSorted;
import static pl.nyczjablonska.sorting.MergeSortTest.generateArray;

class QuickSortTest {
    private final QuickSort sort = new QuickSort();
    @Test
    public void shouldSortArray(){
        //given
        int[] array = {10, 13, 9, 16, 12, 25};

        //when
        int[] actual = sort.sort(array, 0, array.length - 1);

        //then
        int[] expected = {9, 10, 12, 13, 16, 25};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    public static Stream<int[]> provideArrays() {
        return Stream.of(
                generateArray(100),
                generateArray(200),
                generateArray(300)
//                generateArray(10_000),
//                generateArray(100_000)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArrays")
    public void shouldReturnSortedArray(int[] array){
        //given
        long startTime = System.nanoTime();

        //when
        int[] sortedArray = sort.sort(array, 0, array.length - 1);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Test duration: " + duration + "ns");

        //then
        checkIfSorted(sortedArray);
    }
}