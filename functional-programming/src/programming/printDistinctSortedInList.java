package programming;

import java.util.List;
import java.util.stream.Collectors;

public class printDistinctSortedInList {
	public static void main(String[] args) {
		System.out.print(printDistinct(List.of(1,1,2,2,3,3,9,9,0,0,5,5,10,4,4)));
	}

	private static List<Integer> printDistinct(List<Integer>a) {
		return a.stream().distinct().sorted().collect(Collectors.toList());
	}
}
