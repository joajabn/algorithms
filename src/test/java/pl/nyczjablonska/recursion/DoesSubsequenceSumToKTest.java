package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoesSubsequenceSumToKTest {
    @Test
    public void shouldReturnTrue() {
        //given
        int[] arr = {1, 2, 3, 4, 2};
        int k = 4;

        //when
        boolean actual = DoesSubsequenceSumToK.doesCount(arr, k);

        //then
        assertTrue(actual);
    }
    @Test
    public void shouldReturnFalse() {
        //given
        int[] arr = {1, 2, 5};
        int k = 10;

        //when
        boolean actual = DoesSubsequenceSumToK.doesCount(arr, k);

        //then
        assertFalse(actual);
    }
}