import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class ArrayVectorPractice {
	public static void main(String[] args) {
		// 배열 정렬
//		int[] array = new int[] {10, 15, 5, 7, 5};
//		Arrays.sort(array);
//		
//		for (int each : array) {
//			System.out.println(each + " ");
//		}
//		
//		System.out.println("----------------------------------------");
		
		// 중복된 자료구조
		List<Integer> list = new Vector<Integer>();
		
		list.add(55);
		list.add(15);
		list.add(25);
		list.add(5);
		list.add(3);
		
		System.out.println(list);
		System.out.println(list.contains(15));
		System.out.println(list.contains(2));
		
		// 순차적으로 정렬
		 Collections.sort(list);
		 System.out.println(list);
		
		// 역순으로 정렬
		Comparator<Integer> reverseOrdering = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};
		Collections.sort(list, reverseOrdering);
		System.out.println(list);
	}
}
