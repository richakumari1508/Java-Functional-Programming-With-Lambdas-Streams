package programming;

import java.util.List;

public class multiplyNumbersInList {
	public static int sumAllNumbers(List<Integer> a) {
		int res=a.stream().reduce(1,(i,j)->i*j);
			return res;
			
		}
		
	public static void main(String[] args) {
		System.out.println(sumAllNumbers(List.of(1,2,3,4,5,6,7,8)));
	}
}
