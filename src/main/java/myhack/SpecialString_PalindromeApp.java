package myhack;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SpecialString_PalindromeApp {
   static class Pair<A, B> {
        final A a;
        final B b;

        Pair(A a, B b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return String.format("P[%s:%s]", a, b);
        }
    }

    static Map<Character, Long> sToMap(String s) {
         return s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }


    static long substrCount(int n, String s) {

//    CASE 1. All of the characters are the same, e.g. aaa.
//    CASE 2. All characters except the middle one are the same, e.g. aadaa.


//        Iterable<T> data;


        return 1;
    }
}
