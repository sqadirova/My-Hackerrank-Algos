package myhack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class FairRations_V2App {

  // Complete the fairRations function below.
  static Optional<Integer> fairRations(int[] B) {
    int result = 0;

    if (Arrays.stream(B).sum() % 2 == 1) return Optional.empty();
    else {
      int sum = 0;
      for (int i = 0; i < B.length; i++) {
        sum += B[i];
        if (sum % 2 == 1) result += 2;
      }
    }
    return Optional.of(result);
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] B = new int[N];

    String[] BItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < N; i++) {
      int BItem = Integer.parseInt(BItems[i]);
      B[i] = BItem;
    }

    String result = fairRations(B).map(String::valueOf).orElse("NO");
    bufferedWriter.write(result);

    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
