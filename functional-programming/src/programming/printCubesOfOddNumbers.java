package programming;

import java.util.List;

public class printCubesOfOddNumbers {
	public static void main(String[] args) {
		printCourses(List.of(1,2,3,4,5,6,7,8,9));
	}

	private static void printCourses(List<Integer> a) {
		a.stream().filter(i->i%2!=0).map(x->x*x*x).forEach(System.out::println);
	}
}
