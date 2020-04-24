package warmups;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Parking {
  public static long carParkingRoof(List<Long> cars, int k) {
    List<Long> sorted = cars.stream().sorted((a1, a2) -> (int) (a1 - a2)).collect(Collectors.toList());
    return IntStream.rangeClosed(0, sorted.size() - k)
            .mapToLong(idx -> cars.get(idx + k - 1) - cars.get(idx) + 1)
            .min()
            .orElseThrow(RuntimeException::new);

    //with range
//    return IntStream.range(0,sorted.size()-k+1)
//            .mapToLong(idx->cars.get(idx+k-1)-cars.get(idx)+1)
//            .min()
//            .orElseThrow(RuntimeException::new);
  }

  public static void main(String[] args) {
    List<Long> cars = Arrays.asList(6L, 2L, 12L, 7L);
    long r = carParkingRoof(cars, 3);
    System.out.println(r); // 6
  }
}
