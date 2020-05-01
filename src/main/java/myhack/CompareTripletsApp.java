package myhack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CompareTripletsApp {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result=new ArrayList<>();
        int len = a.size();
        int ac=0;
        int bc=0;
        for (int i = 0; i <len ; i++) {
            if (a.get(i)>b.get(i)){
                ac++;
            }else if (a.get(i)<b.get(i)){
                bc++;
            }
        }
        result.add(ac);
        result.add(bc);

        return result;

    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(17, 28, 30);
        List<Integer> b = Arrays.asList(99, 16, 8);

        List<Integer> result = compareTriplets(a, b); // [2,1]
        System.out.println(result);

        List<Integer> a1 = Arrays.asList(5,6,7);
        List<Integer> b1 = Arrays.asList(3,6,10);

        List<Integer> result1 = compareTriplets(a1, b1); //[1,1]
        System.out.println(result1);

    }

}
