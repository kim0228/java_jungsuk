package ver01;

public class FruitBuyer {
	private int myMoney;
	private int numOfApple;

	FruitBuyer(int money) {
		myMoney = money;
		numOfApple = 0;
	}

	FruitBuyer() {
		// myMoney = 5000;
		this(5000); // 위에 있는 생성자를 호출
	}

	public void buyApple(FruitSeller seller, int money) {
		numOfApple = numOfApple + seller.saleApple(money);
		myMoney = myMoney - money;
	}

	public void showBuyResult() {
		System.out.println("현재 잔액 : " + myMoney);
		System.out.println("사과 개수 : " + numOfApple);
	}
}
