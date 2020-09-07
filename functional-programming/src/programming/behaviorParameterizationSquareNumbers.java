package programming;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class behaviorParameterizationSquareNumbers {
	public static void main(String[] args) {
		System.out.println(printSquares(List.of(1,2,3,4,5,6,7,8,9)));
	}

	private static List<Integer> printSquares(List<Integer> a ) {
		Function<? super Integer, ? extends Integer> mapper = i->i*i;
		return a.stream().map(mapper).collect(Collectors.toList());
		
	}

}
