package pl.nyczjablonska.recursion;

import java.util.Random;

public class RandomArrayGenerator {
    public static int[] generateArray(int length){
        var random = new Random();
        var intStream = random.ints(0, 100);
        return intStream.limit(length).toArray();
    }
}
