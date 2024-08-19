package pl.nyczjablonska.sorting;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    private final SelectionSort sort = new SelectionSort();

    @Test
    public void shouldReturnSortedArray(){
        //given
        int[] array = generateArray(100);

        //when
        int[] sortedArray = sort.sort(array);

        //then
        checkIfSorted(sortedArray);
    }

    public int[] generateArray(int length){
        var random = new Random();
        var intStream = random.ints(-100, 100);
        return intStream.limit(length).toArray();
    }

    public void checkIfSorted(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            assertTrue(array[i] <= array[i + 1]);
        }
    }

}