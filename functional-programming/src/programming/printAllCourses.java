package programming;
import java.util.*;
public class printAllCourses {
	public static void printCourses(List<String> courses) {
		courses.stream().forEach(System.out::println);
	}
	public static void main(String[] args) {
		printCourses(List.of("Spring","Spring Boot","API","MicroServices","AWS","PCF","AZURE","Docker"));
	}
}

