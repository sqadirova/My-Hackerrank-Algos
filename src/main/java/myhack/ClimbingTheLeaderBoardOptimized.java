package myhack;

import java.util.Arrays;

public class ClimbingTheLeaderBoardOptimized {
    
    static int calc_score(Integer[] scores,int alice_element){
        //for compare scores must be Integer (actually Object) not int
        int idx = Arrays.binarySearch(scores, alice_element, (a, b) -> b - a);
        if (idx<0) return Math.abs(idx);
        return idx+1;
    }
    
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        //we must convert int to Integer
        Integer[] scores_distinct = Arrays.stream(scores).distinct().boxed().toArray(Integer[]::new);
        //calculate for every element of alice array their score rank
        return Arrays.stream(alice).map(a -> calc_score(scores_distinct, a)).toArray();
    }

    public static void main(String[] args) {
        int[] score={100, 100, 50, 40, 40, 20 ,10};
        int[] alice ={5 ,25, 50 ,120};
        int[] result = climbingLeaderboard(score, alice);
        System.out.println(Arrays.toString(result));  //6,4,2,1
    }
}
