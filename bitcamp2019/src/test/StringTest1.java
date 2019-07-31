package test;

public class StringTest1 {

	public static void main(String[] args) {

		String str1 = "My JAVA";
		String str2 = "My JAVA";
		String str3 = "Your JAVA";
		String str4 = new String("My JAVA");

		System.out.println(str1 == str4.intern());
		// intern메소드는 두 문자열이 같은 주소값에 저장되게 한다.

		System.out.println("=======================");

		boolean strCheck = str1.equals(str4);
		
		if (strCheck) {
			System.out.println("문자열이 같다.");
			// equals()는 문자열의 값만을 가지고 비교하기 때문에 true값이 나온다.
		} else {
			System.out.println("문자열이 다르다.");
		}

		System.out.println("=======================");

		if (str1 == str2) {
			System.out.println("참조하는 주소값이 같다");
		}

		if (str1 == str3) {
			System.out.println("참조하는 주소값이 같다.");
		} else {
			System.out.println("참조하는 주소값이 다르다.");
		}
		// 참조하는 주소값이 다를 뿐만 아니라 값이 아예 다르다.
		// 그래서 else문의 프린트문이 출력된 것!!

		if (str1 == str4) {
			System.out.println("참조하는 주소값이 같다.");
		} else {
			System.out.println("참조하는 주소값이 다르다.");
			boolean a = (str1 == str4);
			System.out.println(a);
		}

		// 참조하는 주소값이 다르다고 출력되는 이유는 new 연산자로 생성된 str4는
		// str1과 다른 별도의 저장 공간에 저장된다.
		// 관계연산자==는 데이터값뿐만 아니라 저장된 위치도 보기 때문에,
		// 그래서, str1과 str4는 동일하지 않은 데이터로 취급되어 false간 나온다.

	}

}
