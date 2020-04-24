package myhack;

public class KangarooApp {
    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if ((v2 >= v1 && x2 > x1) || ((x1 - x2) % (v1 - v2) != 0)) {
            return "NO";
        } else {
            return "YES";
        }
    }

    public static void main(String[] args) {

        String TESTCASE1 = kangaroo(21, 6, 47, 3);
        System.out.println(TESTCASE1);    //NO

        String TESTCASE2 = kangaroo(0, 3, 4, 2);
        System.out.println(TESTCASE2);  //YES
    }
}
