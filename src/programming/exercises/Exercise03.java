package programming.exercises;

import java.util.List;

// Print all courses containing particular keyword
public class Exercise03 {
    public static void main(String[] args) {
        List<String> course = List.of("Spring Framework","Spring Boot", "AWS", "Docker", "Cloud", "SOLID", "Design Patterns", "Golang");
        printCoursesContainsKeyword(course, "Spring");
    }

    private static void printCoursesContainsKeyword(List<String> courses, String keyword) {
        courses.stream()
                .filter(course -> course.contains(keyword))
                .forEach(System.out::println);
    }
}
