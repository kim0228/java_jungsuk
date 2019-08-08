package collectiontest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class MapTestMain {

	public static void main(String[] args) {
		HashMap<Integer,String> hMap = new HashMap<Integer, String>();
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();

		 hMap.put(new Integer("1"), "박나래");
		 hMap.put(new Integer(2), "손흥민");
		 hMap.put(3, "배철수");
		 hMap.put(4, "김신영");
		 hMap.put(5, "유동하");

		tMap.put(new Integer("1"), "정형석");
		tMap.put(3, "김성림");
		tMap.put(5, "이원근");
		tMap.put(new Integer(2), "임태현");
		tMap.put(4, "임선영");
		tMap.put(new Integer(6), "서보국");

		
		  System.out.println("1번 학생의 이름은 "+ hMap.get(new Integer("1")) +"입니다.");
		  System.out.println("2번 학생의 이름은 "+ hMap.get(new Integer(2)) +"입니다.");
		  System.out.println("3번 학생의 이름은 "+ hMap.get(3) +"입니다.");
		  System.out.println("4번 학생의 이름은 "+ hMap.get(4) +"입니다.");
		  System.out.println("5번 학생의 이름은 "+ hMap.get(5) +"입니다.");
		 

		
		  System.out.println("1번 학생의 이름은 "+ tMap.get(new Integer("1")) +"입니다.");
		  System.out.println("2번 학생의 이름은 "+ tMap.get(new Integer(2)) +"입니다.");
		  System.out.println("3번 학생의 이름은 "+ tMap.get(3) +"입니다.");
		  System.out.println("4번 학생의 이름은 "+ tMap.get(4) +"입니다.");
		  System.out.println("5번 학생의 이름은 "+ tMap.get(5) +"입니다.");
		 

		NavigableSet<Integer> nav = tMap.navigableKeySet();

		Iterator<Integer> itr = nav.iterator();
		// Iterator는 리스트 형태의 컬렉션이 상속받는 인터페이스이다.

		System.out.println("오름차순 정렬");

		while (itr.hasNext()) {
			// hasNext는 읽어 올 요소가 남아있는지 확인하는 메소드이며, 있으면 true, 없으면 false를 반환한다. 값이 나올 때까지 계속 while문을 돈다. 
			System.out.println(tMap.get(itr.next())); // next는 다음 요소를 가져오는 역할을 한다.
			// tMap에 next메소드로 값을 하나씩 넣는다.
		}

		System.out.println("---------------------------------------");
		System.out.println("내림차순 정렬");

		itr = nav.descendingIterator();

		while (itr.hasNext()) {
			System.out.println(tMap.get(itr.next()));
		}
	}

}
