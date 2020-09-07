package programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class sortAccordingToStringLength {
public static void main(String[] args) {
	sort(List.of("Spring","Spring Boot","API","MicroServices","AWS","PCF","AZURE","Docker"));
}

private static void sort(List<String> of) {
	System.out.println(of);
	System.out.println(of.stream().sorted(Comparator.comparing(x->x.length())).collect(Collectors.toList()));
}
}
