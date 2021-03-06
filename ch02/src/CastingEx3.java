class CastingEx3 {
	public static void main(String[] args) {
		float f   = 9.1234567f;
		double d  = 9.1234567;
		double d2 = (double)f;

		System.out.printf("f =%20.18f\n", f);
		System.out.printf("d =%20.18f\n", d);
		System.out.printf("d2=%20.18f\n", d2);
	}
}

// ppt 6번
// 논리형 boolean은 1바이트이며, 제일 큰 자료형은 8바이트이다. 
// 문자형 char는 2바이트이고, byte는 1바이트이고, short는 2바이트, 
// int는 4바이트, long은 8바이트이다.
// float는 4바이트, double은 8바이트
// boolean은 1비트로도 저장이 가능하지만 자바에서 최소 저장단위가 1바이트이기에
// 1바이트로 저장한다.



// ppt 7번
// char는 문자를 저장하기 위한 타입이지만, 실제로는 문자의 코드인 숫자, 정수가 저장된다.
// 문자의 코드에는 음수가 없기 때문에, 맨 왼쪽 한자리를 부호자리로 사용하지 않는다.
// 그래서 short와 char는 표현할 수 있는 수의 개수는 같지만, 범위는 서로 다르다.


// 