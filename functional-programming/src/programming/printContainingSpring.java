package programming;

import java.util.List;

public class printContainingSpring {
	public static void main(String[] args) {
		printCourses(List.of("Spring","Spring Boot","API","MicroServices","AWS","PCF","AZURE","Docker"));
	}

	private static void printCourses(List<String> a) {
		a.stream().filter(s->(s.contains("Spring"))).forEach(System.out::println);
	}
}
