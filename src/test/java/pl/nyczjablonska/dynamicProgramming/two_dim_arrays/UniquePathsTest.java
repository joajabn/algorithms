package pl.nyczjablonska.dynamicProgramming.two_dim_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {
    private UniquePaths uniquePaths = new UniquePaths();
    @Test
    public void shouldReturn28(){
        int m = 3;
        int n = 7;
        int actual = uniquePaths.uniquePaths(m, n);
        assertEquals(28, actual);
    }
    @Test
    public void shouldReturn3(){
        int m = 3;
        int n = 2;
        int actual = uniquePaths.uniquePaths(m, n);
        assertEquals(3, actual);
    }

}