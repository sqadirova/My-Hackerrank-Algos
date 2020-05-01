package myhack;

import java.util.Arrays;

public class AngryProfessorApp {
    static String angryProfessor(int k, int[] a) {
        return Arrays.stream(a).filter(t->t<=0).count()<k ?"YES":"NO";   //why only <k ??
    }

    public static void main(String[] args) {
        int[] array={-1, -3, 4, 2};
        System.out.println(angryProfessor(3,array)); //YES -canceled

        int[] array2={0 ,-1 ,2, 1};
        System.out.println(angryProfessor(2,array2));  //NO

    }
}
