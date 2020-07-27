package myhack;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolateApp {

    static int birthday(List<Integer> s, int d, int m) {
        int ways=0;
        int sum=0;
        if (m<=s.size()){
            for (int i = 0; i < m; i++) {
                sum+=s.get(i);
            }
            if (sum==d) ways++;
        }

        return ways;

//       throw  new IllegalArgumentException("Must be implemented");
    }

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1, 2, 1, 3, 2);
        int num_ways = birthday(data, 3, 2);
        System.out.println(num_ways);
    }
}
