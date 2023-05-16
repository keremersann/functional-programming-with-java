package programming.exercises;

import java.util.List;

// Print the odd numbers in the list
public class Exercise01 {
    public static void main(String[] args) {
        printTheOddNumbers(List.of(71,37,32,48,76,97));
    }

    private static void printTheOddNumbers(List<Integer> integers) {
        integers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }
}
