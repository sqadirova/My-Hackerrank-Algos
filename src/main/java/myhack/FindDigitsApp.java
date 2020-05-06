package myhack;

import java.util.Arrays;

public class FindDigitsApp {
    static int[] splitToNums(int num){
        int[] digits=new int[20];
        int cnt=0;
        while (num>0) {
            int r = num % 10;
            if (r != 0) digits[cnt++] = r;
            num /= 10;
        }
        return Arrays.copyOf(digits,cnt);  //len=cnt not 20!
    }

    static int findDigits(int n) {
       return (int) Arrays.stream(splitToNums(n)).filter(digit->n%digit==0).count();
    }

    public static void main(String[] args) {
        System.out.println(findDigits(1012));  //3
    }

}
