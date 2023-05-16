package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        //printAllNumbersWithFunctional(List.of(12,3,4,5,0,94));
        //printEvenNumbersWithFunctional(List.of(12,3,4,5,0,94));
        printSquaresOfEvenNumbersWithFunctional(List.of(12,3,4,5,0,94));
    }

    public static void print(int number){
        System.out.println(number);
    }

    private static void printAllNumbersWithFunctional(List<Integer> integers) {
        // [12,3,4,5,0,94]
        // 12
        // 3
        // 4
        integers.stream().forEach(FP01Functional::print); // FP01Functional::print -> method reference
    }
    private static boolean isEven(int number){
        return number % 2 == 0;
    }
    private static void printEvenNumbersWithFunctional(List<Integer> integers) {

        integers.stream()
                .filter(number -> number % 2 == 0) // Lambda Expression
                //.filter(FP01Functional::isEven) // filter -> define which elements should go further
                .forEach(System.out::println);  // Method reference
    }
    private static void printSquaresOfEvenNumbersWithFunctional(List<Integer> integers) {

        integers.stream()
                .filter(number -> number % 2 == 0) // Lambda Expression -> What to check?
                .map(number -> number * number) // What to do (Transform the element)
                .forEach(System.out::println);  // Method reference (Print)
    }
}
