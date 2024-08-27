package pl.nyczjablonska.sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    private final MergeSort sort = new MergeSort();

    public static Stream<int[]> provideArrays() {
        return Stream.of(
                generateArray(100),
                generateArray(1000),
                generateArray(5000),
                generateArray(10_000),
                generateArray(100_000)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArrays")
    public void shouldReturnSortedArray(int[] array){
        //given
        long startTime = System.nanoTime();

        //when
        int[] sortedArray = sort.sort(array);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Test duration: " + duration + "ns");

        //then
        checkIfSorted(sortedArray);
    }

    @Test
    public void shouldMergeSortedArrays(){
        //given
        int[] leftArray = {2, 5, 8, 10, 15, 19, 23, 27};
        int[] rightArray = {0, 1, 4, 6, 9, 13, 17, 20};

        //when
        int[] sortedArray = sort.merge(leftArray, rightArray);

        //then
        checkIfSorted(sortedArray);
    }

    public static int[] generateArray(int length){
        var random = new Random();
        var intStream = random.ints(-10000, 10000);
        return intStream.limit(length).toArray();
    }

    public void checkIfSorted(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            assertTrue(array[i] <= array[i + 1]);
        }
    }

}