package programming.exercises;

import java.util.List;

public class Exercise05 {
    public static void main(String[] args) {
        printTheCubesOfOddNumbers(List.of(1,2,3,4,5,6,7));
    }

    private static void printTheCubesOfOddNumbers(List<Integer> integers) {
        integers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n * n)
                .forEach(System.out::println);
    }
}
