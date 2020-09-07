package programming;

import java.util.List;

public class findMinInList {
	public static int findMax(List<Integer> a) {
		//int min=a.stream().reduce(1, Integer::min);
		int min=a.stream().reduce(Integer.MAX_VALUE,(i,j)->(i>j)?j:i);
		return min;
	}
	
public static void main(String[] args) {
	System.out.println(findMax(List.of(1,2,3,4,5,6,7,8)));
}
}
