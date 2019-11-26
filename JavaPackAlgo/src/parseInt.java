import java.util.Scanner;

public class parseInt {
	public static void main(String[] args) {
		
		// x진수를 10진수로 변환
		int testNum1 = Integer.parseInt("FF", 16);
		
		int testNum2 = Integer.parseInt("1100110",2);
		
		System.out.println(testNum1);
		System.out.println(testNum2);
		
		// 10진수를 2진수로 변환
		System.out.println(Integer.toBinaryString(9559710));
		System.out.println(Integer.toString(9559710, 2));
		
		System.out.println(Integer.toHexString(256));
		System.out.println(Integer.toString(256,16));
		
		System.out.println(Integer.toOctalString(5432));
		System.out.println(Integer.toString(5432, 8));
		
		// 문자열 역순
		StringBuilder sb = new StringBuilder();
		sb.append("abcdefghijk");
		
		sb.reverse();
		
		System.out.println(sb);
	
	}
}
