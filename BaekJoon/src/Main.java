import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		System.out.println(Integer.toBinaryString(N));
		
		s.close();
	}
}
