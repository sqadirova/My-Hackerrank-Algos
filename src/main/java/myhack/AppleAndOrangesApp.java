package myhack;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

public class AppleAndOrangesApp {

    static void countApplesAndOranges1(int s, int t, int a, int b, int[] apples, int[] oranges) {
        long countApl = Arrays.stream(apples).map(apl -> apl + a).filter(x -> x >= s && x <= t).count();
        long countOrg = Arrays.stream(oranges).map(apl -> apl + b).filter(x -> x >= s && x <= t).count();

        System.out.printf("Apple: %d \t Orange: %d\n", countApl, countOrg);
    }

    static void countApplesAndOranges2(int s, int t, int a, int b, int[] apples, int[] oranges) {
        IntPredicate p = x -> x >= s && x <= t;
        long countApl = Arrays.stream(apples).map(apl -> apl + a).filter(p).count();
        long countOrg = Arrays.stream(oranges).map(apl -> apl + b).filter(p).count();

        System.out.printf("Apple: %d \t Orange: %d\n", countApl, countOrg);
    }

    static void countApplesAndOranges3(int s, int t, int a, int b, int[] apples, int[] oranges) {
        IntPredicate p = x -> x >= s && x <= t;
        Function<Integer, IntUnaryOperator> plus=y-> x->x+y;  //y is a or b , x is apple or orange
        long countApl = Arrays.stream(apples).map(plus.apply(a)).filter(p).count();
        long countOrg = Arrays.stream(oranges).map(plus.apply(b)).filter(p).count();

        System.out.printf("Apple: %d \t Orange: %d\n", countApl, countOrg);
    }

    static void countApplesAndOranges4(int s, int t, int a, int b, int[] apples, int[] oranges) {
        IntPredicate p = x -> x >= s && x <= t;
        Function<Integer, IntUnaryOperator> plus=y-> x->x+y;  //y is a or b , x is apple or orange
        BiFunction<int[],IntUnaryOperator,Long> count=(array,f)->Arrays.stream(array).map(f).filter(p).count();
        Long countApl = count.apply(apples, plus.apply(a));
        Long countOrg = count.apply(oranges, plus.apply(b));

        System.out.printf("Apple: %d \t Orange: %d\n", countApl, countOrg);
    }

    public static void main(String[] args) {
        int[] apples={-2,2,1};
        int[] oranges={5,-6};

        countApplesAndOranges1(7,11,5,15,apples,oranges);
        countApplesAndOranges2(7,11,5,15,apples,oranges);
        countApplesAndOranges3(7,11,5,15,apples,oranges);
        countApplesAndOranges4(7,11,5,15,apples,oranges);

    }
}
