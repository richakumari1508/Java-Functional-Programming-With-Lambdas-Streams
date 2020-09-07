package programming;

import java.util.List;

public class printEvenNumbers {
	public static void printNumbers(List<Integer> a) {
		a.stream().filter(i->(i%2==0)).forEach(System.out::println);
	}
	public static void main(String[] args) {
		printNumbers(List.of(1,2,3,4,5,6,7,8));
	}
}
