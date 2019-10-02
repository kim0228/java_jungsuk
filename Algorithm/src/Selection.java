import java.util.Arrays;

public class Selection {
	public static void main(String[] args) {
		
		// 1. 입력
		int[] data = {7,5,6,1,9};
		
		// 2. 처리
		// Arrays.sort(data); // 쉽게 정렬할 수 있음
		
		// selection sort
		int temp = 0; // 데이터 swap용 임시 변수
		
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if(data[i] > data[j]) { // 오름차순: 큰 수를 뒤로, data[i] > data[j];
											  //  내림차순: 큰 수를 앞으로, data[i] < data[j]
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
			ShowArray(data);
		}
		
		System.out.println("=====정렬 결과=======");
		for (int i = 0; i < data.length; i++) {
			 System.out.print(data[i]+"  "); // 1, 5, 6, 7, 9 출력되도록
		}
	}
	
	// 회전시마다 배열상태를 보기위한 메소드
	private static void ShowArray(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i] + "  ");
		}
		System.out.println();
	}
	
}


