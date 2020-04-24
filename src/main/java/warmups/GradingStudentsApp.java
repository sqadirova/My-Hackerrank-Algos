package warmups;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class GradingStudentsApp {

    private static int adjust(int g) {
        return g < 38 ? g : g % 5 > 2 ? (g / 5 + 1) * 5 : g;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream().map(GradingStudentsApp::adjust).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);

        List<Integer> result = gradingStudents(grades);
        System.out.println(result);       // 75, 67, 40, 33
    }
}
