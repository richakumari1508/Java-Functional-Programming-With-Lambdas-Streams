package programming;

import java.util.List;

public class printContaining4Letters {

	public static void main(String[] args) {
		printCourses(List.of("Spring","Spring Boot","API","MicroServices","AWS","PCF","AZURE","Docker"));
	}

	private static void printCourses(List<String> a) {
		a.stream().filter(s->(s.length()>=4)).forEach(System.out::println);
	}
}
