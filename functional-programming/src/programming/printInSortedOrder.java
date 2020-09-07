package programming;
import java.util.*;
import java.util.stream.Collectors;
public class printInSortedOrder {
	public static List<Integer> printSorted(List<Integer> a){
		return a.stream().sorted().collect(Collectors.toList());
	}
public static void main(String[] args) {
	System.out.print(printSorted(List.of(0,9,1,8,3,7,4,6,5)));
}
}
