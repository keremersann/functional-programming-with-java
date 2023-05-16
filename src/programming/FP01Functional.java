package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        printAllNumbersWithStructured(List.of(12,3,4,5,0,94));
    }

    public static void print(int number){
        System.out.println(number);
    }

    private static void printAllNumbersWithStructured(List<Integer> integers) {
        // [12,3,4,5,0,94]
        // 12
        // 3
        // 4
        // FP01Functional::print -> method reference
        integers.stream().forEach(FP01Functional::print);
    }
}
