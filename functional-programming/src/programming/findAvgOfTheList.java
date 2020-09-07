package programming;

import java.util.List;

public class findAvgOfTheList {
	public static int findAvg(List<Integer> a) {
		int sum=a.stream().reduce(0, (i,j)->i+j);
		return (int)(sum/2);
	}
	
public static void main(String[] args) {
	System.out.println(findAvg(List.of(1,2,3,4,5,6,7,8)));
}
}
