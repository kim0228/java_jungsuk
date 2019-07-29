
public class ReservedWord_final {
	
	final int age = 56;
	int tall = 183;
	
	ReservedWord_final() {
		tall = 190;
		// age = 67;
	}
	
	// final 메소드는 상속을 하였을 때 오버라이딩이 안되게 만들 필요가 있을 때 사용한다.
	
	final void TestMethod_final() {
		System.out.println("TestMethod_final !! ");
	}
	
	void TestMethod_normal() {
		System.out.println("TestMethod_normal !! ");
	}
	
	class A extends ReservedWord_final {
		@Override
		void TestMethod_normal() {
			super.TestMethod_normal();
		}
	}

	// final 클래스 : class자체를 상속하지 못하도록 할 때 사용된다.
	final class TestClass_final {
		TestClass_final(){
			System.out.println("TestClass_final !! ");
		}
	}
	
	class TestClass_normal {
		TestClass_normal(){
			System.out.println("TestClass_normal !! ");
		}
	}
	
	class B extends TestClass_normal {
		
	}
	
	public static void main(String[] args) {
		new ReservedWord_final();
	}

}
