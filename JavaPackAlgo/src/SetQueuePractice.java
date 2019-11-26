import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class SetQueuePractice {
	public static void main(String[] args) {
		// 중복되지 않고 정렬되지 않은 자료구조
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(15);
		set.add(21);
		set.add(1);
		set.add(4);
		set.add(1);
		
		System.out.println(set);
		
		// 중복되지 않고 정렬된 자료구조
		Set<Integer> set2 = new TreeSet<Integer>();
		set2.add(10);
		set2.add(20);
		set2.add(1);
		set2.add(8);
		set2.add(1);
		
		System.out.println(set2);
		
		// 역순으로 정렬
		Comparator<Integer> reverseOrdering = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};
		
		// 중복되지 않고 역순으로 정렬된 자료구조
		Set<Integer> set3 = new TreeSet<Integer>(reverseOrdering);
		set3.add(10);
		set3.add(5);
		set3.add(14);
		set3.add(7);
		set3.add(1);
		
		System.out.println(set3);
		
		// MAX Heap 구조를 유지하기 위한 자료구조
		Queue<Integer> queue = new PriorityQueue<Integer>(10, reverseOrdering);
		
		queue.add(10);
		queue.add(20);
		queue.add(1);
		queue.add(7);
		queue.add(100);
		
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
	}
}
