import java.util.Scanner;

public class Problem_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c, d;
		int result;
		
		System.out.print("첫번째 계산할 합을 입력하세요 ==> ");
		a = scanner.nextInt();
		System.out.print("두번째 계산할 합을 입력하세요 ==> ");
		b = scanner.nextInt();
		System.out.print("세번째 계산할 합을 입력하세요 ==> ");
		c= scanner.nextInt();
		System.out.print("네번째 계산할 합을 입력하세요 ==> ");
		d = scanner.nextInt();
		
		result = a + b + c + d;
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);
	}
	
}
