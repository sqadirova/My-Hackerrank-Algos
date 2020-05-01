package myhack;

public class countingValleysApp {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int valley=0;
        int level=0;
        for (int i = 0; i < n; i++) {
            switch (s.charAt(i)) {
                case 'U':level++; break;
                case 'D':level--; break;
            }
            if (level==0 && s.charAt(i)=='U') valley++;
        }
        return valley;
    }

    public static void main(String[] args) {
        int result = countingValleys(8, "UDDDUDUU");  //1

        System.out.println(result);
    }
}
