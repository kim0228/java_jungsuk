import java.util.Scanner;

public class CombiPermuImpl {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("배열 요소의 갯수 : ");
		int arrLen = s.nextInt();
		int[] arr = new int[arrLen];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 숫자는? ");
			arr[i] = s.nextInt();
		}
		
		int n = arr.length; // 배열의 길이
		int r = 3; // 뽑을 숫자 수
		int[] combArr = new int[n]; // 경우의 수를 넣을 배
		
		doCombination(combArr, n, r, 0, 0, arr);
	}

	public static void doCombination(int[] combArr, int n, int r, int index, int target, int[] arr) {
		if (r == 0) {
			for (int i = 0; i < index; i++) {
				System.out.print(arr[combArr[i]] + " ");
			}
			System.out.println();
		} else if (target == n) return;
		else {
			combArr[index] = target;
			doCombination(combArr, n, r-1, index+1, target+1, arr);
			doCombination(combArr, n, r, index, target+1, arr);
		}
		
	}
}
