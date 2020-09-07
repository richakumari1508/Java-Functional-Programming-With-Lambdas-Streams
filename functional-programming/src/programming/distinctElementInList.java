package programming;
import java.util.*;
import java.util.stream.Collectors;
public class distinctElementInList {
public static List<Integer> printDistinct(List<Integer> a){
	return a.stream().distinct().collect(Collectors.toList());
}
public static void main(String[] args) {
	System.out.print(printDistinct(List.of(1,1,2,2,3,3,9,9,0,0,5,5,10,4,4)));
}

}
