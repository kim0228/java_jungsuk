
public class ReservedWord_this {

	String name = "commin's blog"; // name과 address는 전역변수이다.
	String address = "Seoul";
	
	ReservedWord_this(String name){
		
		System.out.println(name); // 결과값:commin
		
		// 메소드내에 선언된 변수가 없으므로 전역변수인 address의 값인 Seoul을 출력한다.
		System.out.println(address); // 결과값:Seoul
		
		
		// this는 자기 자신을 지칭하는 객체를 의미하며, 현재 클래스에 접근하여 멤버필드에 있는
		// name변수의 값을 가져오게 된다.
		System.out.println(this.name); // 결과값: commin's blog
		
		this.name = name;
		// 생성자에서 받은 데이터를 클래스의 전역변수로 옮기게 된다.
		System.out.println(this.name); // 결과값: commin
		
		
	}

	public static void main(String[] args) {
		new ReservedWord_this("commin");
		
		
	}

}
