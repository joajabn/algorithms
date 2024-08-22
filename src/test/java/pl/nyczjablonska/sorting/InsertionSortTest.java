package pl.nyczjablonska.sorting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    private final InsertionSort sort = new InsertionSort();

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