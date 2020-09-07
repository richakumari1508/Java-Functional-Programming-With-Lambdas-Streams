package programming;

import java.util.List;
import java.util.stream.Collectors;

public class cubeAndFindSum {
	public static void main(String[] args) {
		System.out.println(cubeAndSum(List.of(1,2,3,4,5,6,7,8)));
	}

	private static int cubeAndSum(List<Integer> a) {
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println(a.stream().map(i->i*i*i).collect(Collectors.toList()));
		return a.stream().map(i->i*i*i).reduce(0,Integer::sum);
	}
}
