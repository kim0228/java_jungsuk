package ver01;

public class FruitSeller {
	// int numOfApple = 20;
	// int myMoney = 0;
	// final int APPLE_PRICE = 1000;

	private int numOfApple;
	private int myMoney;
	private final int APPLE_PRICE;

	FruitSeller(int appleNum, int money, int price) {
		numOfApple = numOfApple + appleNum;
		myMoney = money;
		APPLE_PRICE = price;
	}

	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple = numOfApple - num;
		myMoney = myMoney + money;
		return num;
	}

	public void showSaleResult() {
		System.out.println("남은 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
	}
}
