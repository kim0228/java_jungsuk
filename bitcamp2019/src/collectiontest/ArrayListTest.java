package collectiontest;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(11));
		list.add(new Integer("22"));
		list.add(33);
		
		
		System.out.println("리스트에 저장된 요소들의 출력");
		for(int i = 0;i<list.size();i++) { // list는 length가 아닌 size로 크기를 구한다.
			System.out.println(list.get(i));
		}
		
		list.remove(1);
		
		
		System.out.println("삭제 후 리스트에 저장된 요소들의 출력");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
