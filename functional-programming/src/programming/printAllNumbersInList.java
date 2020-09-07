package programming;
import java.util.*;
public class printAllNumbersInList {
	public static void printAllNumbers(List<Integer> a) {
		a.stream().forEach(System.out::println);
		
	}
	
public static void main(String[] args) {
	printAllNumbers(List.of(1,2,3,4,5,6,7,8));
}
}
