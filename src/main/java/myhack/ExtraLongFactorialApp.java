package myhack;

import java.math.BigInteger;

public class ExtraLongFactorialApp {
    static void extraLongFactorials(int n) {
        BigInteger factorial =BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);
    }

    public static void main(String[] args) {
        extraLongFactorials(25);
    }
}
