
public class Ex03_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		float c,d;
		
		a = 100;
		b = a;
		
		c = 111.1f; // float형을 쓸 때에는 반드시 f를 붙여야만 한다. 
		d = c;
		
		System.out.printf("a, b의 값 ==> %d, %d \n", a, b);
		System.out.printf("c, d의 값 ==> %5.1f, %5.1f \n",c,d);
	}

}
