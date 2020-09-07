package programming;

import java.util.List;

public class sumAllNumbersInList {
	public static int sumAllNumbers(List<Integer> a) {
	//	int sum=a.stream().reduce(0,(i,j)->i+j);
		int sum=a.stream().reduce(0, Integer::sum);
		return sum;
		
	}
	
public static void main(String[] args) {
	System.out.println(sumAllNumbers(List.of(1,2,3,4,5,6,7,8)));
}
}
