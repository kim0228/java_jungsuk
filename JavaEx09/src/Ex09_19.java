class myChar{
	char x;
	char y;
}

public class Ex09_19 {
	
	static void func1(char x, char y) { // 값 전달
		char imsi;
		imsi = x; // imsi = 'A'
		x = y; // x = 'Z'
		y = imsi; // y = 'A'
	}
	
	static void func2(myChar ch) { // 주소 전달
		char imsi; 
		imsi = ch.x; // 
		ch.x = ch.y;
		ch.y = imsi;
	}

	public static void main(String[] args) {
		char x = 'A', y = 'Z';
		System.out.printf("원래 값     : x = %c, y = %c\n", x,y);
		func1(x,y); // 메소드 호출
		System.out.printf("값을 전달한 후 : x=%c, y = %c\n\n",x,y);
		
		myChar ch = new myChar();
		ch.x = 'A';
		ch.y = 'Z';
		System.out.printf("원래 값     : x = %c, y = %c\n", x,y);
		func2(ch);
		System.out.printf("주소를 전달한 후 : x=%c, y = %c\n\n",ch.x,ch.y);
	}

}
