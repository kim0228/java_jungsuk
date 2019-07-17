
public class Ex03_09 {
	public static void main(String[] args) {
//		int a,b,c,d;
//		
//		a = 100 + 100;
//		b = a + 100;
//		c = a + b - 100;
//		d = a + b + c;
//		System.out.printf("a,b,c,d의 값 ==> %d, %d, %d, %d \n", a,b,c,d);
//		
//		a = b = c = d = 100;
//		System.out.printf("a,b,c,d의 값 ==> %d, %d, %d, %d \n", a,b,c,d);
//		
//		a = 100;
//		a = a + 200;
//		System.out.printf("a의 값 ==> %d \n", a);
		
		float a,b,c;
		a = b = c = 123.45f;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int d,e,f;
		d = e = f = (int)123.45f;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		System.out.println();
		
		System.out.println("1" + "2"); // 12
		System.out.println(true + ""); // true
		System.out.println('A' + 'B'); // 131--- 'A'와 'B'의 문자코드 값은 각각 65,66이다. 
		System.out.println('1' + 2); // 51--- '1'의 문자코드 값은 49이다.
		System.out.println('1' + '2'); // 99 
		System.out.println('J' + "ava"); // Java
		// System.out.println(true + null); 결과:오류
		
		// 문자열과 덧셈연산을 하면 그 결과는 항상 문자열이다.
		// 그러나, 문자와 문자의 덧셈연산의 결과는 int형 정수값이 된다. 왜냐하면 int형보다 작은 타입은 
		// int형으로 변환된 뒤에 덧셈연산이 진행되기 때문이다.
		// 'A' + 'B'는 char + char -> int + int -> int의 과정을 통해 결과도 int형으로 나온다.
	}
}
