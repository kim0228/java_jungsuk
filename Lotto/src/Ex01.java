import java.util.Arrays;
import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		int lotto[] = new int[6];
		
		for(int i = 0; i<lotto.length; i++) { 
			// lotto배열에 숫자 1부터 45까지의 랜덤한 숫자를 넣는다.
			lotto[i] = (int)(Math.random()*45)+1;
			// 랜덤된 숫자를 출력할 때 중복되는 숫자가 나올 수도 있기에 숫자가 똑같다면
			// 배열의 i번째 인덱스를 줄어들게 하고 반복문을 빠져나가게 한다.
			for(int j = 0;j < i;j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		// lotto배열을 sort함수로 정렬시켜준다.
		Arrays.sort(lotto); 
		System.out.print("로또 번호는 ");
		for (int i = 0;i < lotto.length; i++) { 
			// 6개의 로또 번호를 for문을 돌리면서 출력시킨다.
			System.out.print("[" + lotto[i] + "]");
		}
		System.out.println("입니다.");
		
	}

}
