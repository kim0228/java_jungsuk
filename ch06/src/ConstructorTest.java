class Data1 {
	int value;
}

class Data2 {
	int value;

	Data2(int x) { 	// 留ㅺ컻蹂?섍? ?덈뒗 ?앹꽦??
		value = x;
	}
}

class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		// Data2 d2 = new Data2();		// compile error諛쒖깮
	}
}
