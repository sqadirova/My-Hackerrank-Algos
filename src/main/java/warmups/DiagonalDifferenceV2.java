package warmups;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DiagonalDifferenceV2 {

    private static int differenceOfDiagonals(List<List<Integer>> data) {
       class Pair{
           final int a;
           final int b;

           Pair(int a, int b) {
               this.a = a;
               this.b = b;
           }
       }

       return IntStream.range(0,data.size()).mapToObj(i->new Pair(
               data.get(i).get(i),
               data.get(i).get(data.size()-1-i)))
               .reduce((dg_sum1,dg_sum2)->new Pair(dg_sum1.a+dg_sum2.a,dg_sum1.b+dg_sum2.b))
               .map(p->Math.abs(p.a-p.b))
               .orElseThrow(RuntimeException::new);

    }

    public static void main(String[] args) {
        List<List<Integer>> data = Arrays.asList(
                Arrays.asList(1, 2, 13),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 10, 12)
        );

        int result=differenceOfDiagonals(data);
        System.out.println(result);
    }

}
