package programming;

import java.util.*;

public class findMaxInTheList {
	public static int findMax(List<Integer> a) {
		int max=a.stream().reduce(Integer.MIN_VALUE, (i,j)->(i>j)?i:j);
		return max;
	}
	
public static void main(String[] args) {
	System.out.println(findMax(List.of(1,2,3,4,5,6,7,8)));
}
}
