package myhack;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolateApp {

    static int birthday(List<Integer> s, int d, int m) {
       throw  new IllegalArgumentException("Must be implemented");
    }

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1, 2, 1, 3, 2);
        int num_ways = birthday(data, 3, 2);
        System.out.println(num_ways);
    }
}
