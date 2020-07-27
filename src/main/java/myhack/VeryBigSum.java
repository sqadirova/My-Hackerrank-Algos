package myhack;

import java.util.Arrays;

public class VeryBigSum {
    static long aVeryBigSum(long[] ar) {
        long sum = Arrays.stream(ar).sum();
        return sum;
    }

    public static void main(String[] args) {
        long[] array={1000000001,1000000002,1000000003,1000000004,1000000005};
        System.out.println(aVeryBigSum(array));
    }
}
