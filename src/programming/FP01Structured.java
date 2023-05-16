package programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        printAllNumbersWithStructured(List.of(12,3,4,5,0,94));
    }

    private static void printAllNumbersWithStructured(List<Integer> integers) {
        for (Integer number: integers) {
            System.out.println(number);
        }
    }
}
