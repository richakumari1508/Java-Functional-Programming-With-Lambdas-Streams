package programming;

import java.util.List;

public class printNumberIfCharacterInEachCourseName {
	public static void main(String[] args) {
		printNumberOfCharacters(List.of("Spring","Spring Boot","API","MicroServices","AWS","PCF","AZURE","Docker"));
	}

	private static void printNumberOfCharacters(List<String> a) {
		a.stream().map(s->s.length()).forEach(System.out::println);
	}
}
