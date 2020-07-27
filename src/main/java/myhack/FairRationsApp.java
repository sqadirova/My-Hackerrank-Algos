package myhack;

import java.util.Arrays;

public class FairRationsApp {
    static String fairRations(int[] B) {
        int count=0;

        //if sum is odd(tek) number there is no way
        if (Arrays.stream(B).sum()%2==1) return "NO";
        else {
            int sum=0;
            for (int i = 0; i < B.length; i++) {
                sum+=B[i];
                if (sum%2==1) count+=2;
            }
        }
        return String.valueOf(count);
    }

}
