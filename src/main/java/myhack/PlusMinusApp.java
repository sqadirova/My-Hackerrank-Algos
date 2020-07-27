package myhack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PlusMinusApp {
    static void plusMinus(int[] arr) {
        List<Integer> result = IntStream.range(0, arr.length).boxed().filter(a -> a > 0).map(x -> x / arr.length).collect(Collectors.toList());

//        List<Integer> result = Arrays.stream(arr).filter(a -> a > 0).boxed()
//                .map(x -> x / arr.length).collect(Collectors.toList());

        System.out.println(result);

    }

    public static void main(String[] args) {
        int[] array={-4, 3, -9, 0, 4, 1};
        plusMinus(array);
        //RESULT
//        0.500000
//        0.333333
//        0.166667
    }
}
