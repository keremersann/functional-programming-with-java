package programming.exercises;

import java.util.List;

// Print courses whose name is atleast 10 letters
public class Exercise04 {
    public static void main(String[] args) {
        List<String> course = List.of("Spring Framework","Spring Boot", "AWS", "Docker", "Cloud", "SOLID", "Design Patterns", "Golang");
        printCoursesContainsMoreThan4Letter(course, 10);
    }

    private static void printCoursesContainsMoreThan4Letter(List<String> courses, int numberOfLetters) {
        courses.stream()
                .filter(course -> course.length() > numberOfLetters) // What to check
                .forEach(System.out::println); // What to do
    }
}
