package programming;

import java.util.*;
import java.util.stream.Collectors;

public class sortCourses {
public static void main(String[]args) {
	sort(List.of("Spring","Spring Boot","API","MicroServices","AWS","PCF","AZURE","Docker"));
}

private static void sort(List<String> a) {
	System.out.println(a.stream().sorted().collect(Collectors.toList()));
	System.out.println(a.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
}
}
