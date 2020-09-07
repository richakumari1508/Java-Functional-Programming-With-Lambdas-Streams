package programming;

import java.util.List;

public class printSquareOfNumbers {
	public static void main(String[] args) {
		printSquares(List.of(1,2,3,4,5,6,7,8,9));
	}

	private static void printSquares(List<Integer> a) {
		a.stream().map(i->i*i).forEach(System.out::println);
}
}
