package programming;

import java.util.List;
import java.util.Optional;

// Optional is actually way of handling null values in java
// If there is a possibility of returning value to be null,
// we can handle with this null value thanks to the Optional
public class PlayingWithOptional {
    public static void main(String[] args) {
        List<String> fruits = List.of("banana", "apple", "strawberry", "watermelon");
        Optional<String> firstItem = fruits.stream().filter(fruit -> fruit.startsWith("a")).findFirst();
        System.out.println(firstItem);
        System.out.println(firstItem.isEmpty());
        System.out.println(firstItem.isPresent());
        System.out.println(firstItem.get());

        System.out.println();

        firstItem = fruits.stream().filter(fruit -> fruit.startsWith("z")).findFirst();
        System.out.println(firstItem);
        System.out.println(firstItem.isEmpty());
        System.out.println(firstItem.isPresent());
        firstItem.ifPresent(System.out::println);
    }
}
