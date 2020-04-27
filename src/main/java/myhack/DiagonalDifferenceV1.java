package myhack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DiagonalDifferenceV1 {

    //version1
    private static int differenceOfDiagonals(List<List<Integer>> data) {
        int sumOfDiagonal1 = IntStream.range(0, data.size()).map(i -> data.get(i).get(i)).sum();
        int sumOfDiagonal2 = IntStream.range(0, data.size()).map(i -> data.get(i).get(data.size() - 1 - i)).sum();
        return Math.abs(sumOfDiagonal1-sumOfDiagonal2);
    }

    //version2
    private static int differenceOfDiagonals2(List<List<Integer>> data) {
        int result = IntStream.range(0, data.size())
                .map(i-> (data.get(i).get(i)-data.get(i).get(data.size()-1-i)) )
                .sum();
        return Math.abs(result);

    }

    public static void main(String[] args) {
        List<List<Integer>> data = Arrays.asList(
                Arrays.asList(1, 2, 13),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 10, 12)
        );

        int result=differenceOfDiagonals(data);
        System.out.println(result);

        int result2=differenceOfDiagonals2(data);
        System.out.println(result2);
    }

}
