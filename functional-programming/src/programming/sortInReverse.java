package programming;

import java.util.*;
import java.util.stream.Collectors;

public class sortInReverse {

	public static void main(String[] args) {
		System.out.print(printReverse(List.of(1,1,2,2,3,3,9,9,0,0,5,5,10,4,4)));
	}

	private static List<Integer> printReverse(List<Integer> arr) {
		
		return arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}
}
