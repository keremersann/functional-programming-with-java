package programming.exercises;

import java.util.List;

// Print all courses individually
public class Exercise02 {
    public static void main(String[] args) {
        List<String> course = List.of("Spring Boot", "AWS", "Docker", "Cloud", "SOLID", "Design Patterns", "Golang");
        printAllCourses(course);
    }

    private static void printAllCourses(List<String> course) {
        course.stream().forEach(System.out::println);
    }
}
