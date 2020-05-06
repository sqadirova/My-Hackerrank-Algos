package myhack;

import java.util.Arrays;
import java.util.List;

public class ClimbingTheLeaderBoardFailedSomeTests{
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
       return Arrays.stream(alice).map(a->{
            int[] score_distinct = Arrays.stream(scores).filter(s0 -> s0 >= a).distinct().toArray();
            if (score_distinct.length==0) return 1;
            if (score_distinct[score_distinct.length-1]==a) return score_distinct.length;
            else return score_distinct.length+1;
        }).toArray();
    }

    public static void main(String[] args) {
        int[] score={100, 100, 50, 40, 40, 20 ,10};
        int[] alice ={5 ,25, 50 ,120};

        int[] result = climbingLeaderboard(score, alice);
        System.out.println(Arrays.asList(result));  //6,4,2,1
    }
}
