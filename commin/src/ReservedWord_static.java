
public class ReservedWord_static {
	
	// static 필드: 데이터 값을 공유하기 위해서 선언하는 공간을 말한다.
	// static은 클래스 설계단계에서 멤버변수 중 다른 모든 인스턴스에서 공통적으로 사용 하는 것과	
	// static 메서드로 작성된 내부내용에 static이아닌 기본 인스턴스 변수가 사용되지않을때 static을 붙입니다. 

	class Car{
		String name;
		int price;
		public static final int wheel = 4;  // 상수 선언 
		public static final int door = 4; 
	}
	
	static class House{
		public static int width = 400;
		public static int height = 500;
		public static void sell(String str) {
			System.out.println(str);
		}
	}
	
	public ReservedWord_static() {
		// 이렇게 생성자를 호출하는 이유는 inner class로 작성된 Car라는 클래스에
		// static메소드인 main()가 접근할 수 없기 때문
		// 그 이유는 main메소드는 static메소드이기에 객체가 선언되지 않아도 자바의
		// 프로그램이 시작하면 미리 메모리에 할당해 놓아서 바로 시작이 가능하지만,
		// Car라는 클래스는 객체가 생성되기 전에는 메모리에 존재하지 않기 때문에 참조 할 수 가 없기 때문이다.
		// 만약에 사용하고 싶으면 Car클래스를 static으로 선언하면 된다.
		Car car = new Car(); // 객체 생성
		
		car.name = "K5";
		car.price = 50000000;
		
		System.out.println("door number : "+Car.door	
				+"\n"+"wheel number : "+Car.wheel	
				+"\n"+"wheel number : "+car.name
				+"\n"+"wheel number : "+car.price);
		System.out.println();
		
		car.name = "K7";
		car.price = 70000000;
		
		System.out.println("door number : "+Car.door	
				+"\n"+"wheel number : "+Car.wheel	
				+"\n"+"wheel number : "+car.name	
				+"\n"+"wheel number : "+car.price);
		System.out.println();
		// Car클래스안에 name과 price는 car객체를 이용하여 마음대로 바꿀 수 있지만,
		// final static으로 선언된 wheel과 door는 바꿀려고한다면 오류가 난다.
		// final값은 불변의 값이기 때문
		// 만약에 final을 지우게 되면 오류가 난다. 이유는 wheel과 door는 static으로 선언되어
		// 메모리에 할당되어있지만, car클래스는 레퍼런스로 선언되어 메모리에 할당되지 않을 수 있는 상태이기 때문이다.
		// 그래서, 레퍼런스 클래스 안에 static은 반드시 final로 선언해야하며 static메소드는 사용할 수 없다.
		// 예를 들어, 물건을 담는 상자는 없는데 물건이 어지러져있으면 매우 불안정한상태이기 때문에
		// final로 고정시켜놓는것이라 이해하자!
		
		
		System.out.println("House width:"+House.width
				+	"\n"+"House height:"+House.height);
		House.sell("이미팔렸습니다.");
		
		House.height = 300;
		House.width = 200;
		System.out.println();
		System.out.println("House width:" + House.width + 
				"\n" + "House.height:" + House.height);
		House.sell("아직 안 팔렸습니다.");

		// 위에 보는 것처럼 객체를 생성하지 않아도 House라는 클래스는 이미 메모리에 할당이 되어있는 상태
		// Car클래스와는 다르게 House클래스 자체도 static으로 선언되어있어서
		// 상자안에 있는 멤버들은 자유롭게 변화되어도 자바가 처리할 수 있으니 static으로 선언이 가능하다.
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("door number : " + Car.door 
				+ "\n" + "wheel number : "+ Car.wheel);
		// Car클래스는 아직 메모리에 존재하지 않지만 그안에 static으로 선언된 멤버필드인
		// wheel과 door변수는 프로그램이 시작되면서 메모리에 할당되게 된다.
		// 그래서,클래스이름만으로 접근하여 사용이 가능하게 된다.
		System.out.println();
		new ReservedWord_static();
	}

}
