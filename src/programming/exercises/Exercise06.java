package programming.exercises;

import java.util.List;

public class Exercise06 {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring Framework","Spring Boot", "AWS", "Docker", "Cloud", "SOLID", "Design Patterns", "Golang");
        printTheNumberOfCharactersInCourses(courses);
    }

    private static void printTheNumberOfCharactersInCourses(List<String> courses) {
        courses.stream()
                .map(course -> course.length())
                .forEach(System.out::println);
    }
}
