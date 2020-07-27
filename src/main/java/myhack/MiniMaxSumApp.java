package myhack;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MiniMaxSumApp {
    static void miniMaxSum(int[] arr) {
        long min = Arrays.stream(arr).mapToLong(f -> f).min().getAsLong();
        long max = Arrays.stream(arr).mapToLong(f -> f).max().getAsLong();
        long sum = Arrays.stream(arr).mapToLong(f -> f).sum();

        //min_sum=sum-max
        //max_sum=sum-min
        System.out.printf("%d %d",sum-max,sum-min);
    }


    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        miniMaxSum(array);
    }
}
