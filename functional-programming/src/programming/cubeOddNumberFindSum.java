package programming;

import java.util.List;
import java.util.stream.Collectors;

public class cubeOddNumberFindSum {
	public static void main(String[] args) {
		System.out.println(cubeOddFindSum(List.of(1,2,3,4,5,6,7,8)));
	}

	private static int cubeOddFindSum(List<Integer> a) {
		return a.stream().filter(i->(i%2!=0)).map(j->j*j*j).reduce(0, Integer::sum);
	}
}
