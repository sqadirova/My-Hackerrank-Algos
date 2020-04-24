package warmups;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Long> types = arr.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));

        Long max_count = types.values().stream()
                .max(Comparator.comparingLong(a -> a))
                .orElseThrow(RuntimeException::new);

        return types.entrySet().stream()
                .filter(a -> a.getValue() == max_count)
                .map(Map.Entry::getKey)
                .min(Comparator.comparingInt(a -> a))
                .orElseThrow(RuntimeException::new);

    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 1, 2, 5, 5, 2, 3, 3, 4, 4, 4);
        int birds = migratoryBirds(arr);
        System.out.println(birds);
    }
}
