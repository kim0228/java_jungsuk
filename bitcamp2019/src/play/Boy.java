package play;

public class Boy {
	int mNum;

	String pName;

	Boy(String name, int num) {
		pName = name;
		mNum = num;
	}

	void gameWin(int mNum, Boy boy) {
		win(mNum);
		boy.lose(mNum);
	}

	// 구슬의 증가
	void win(int num) {
		mNum = mNum + num;
	}

	// 구슬의 감소
	void lose(int num) {
		mNum = mNum - num;
	}

	void showNumber() {
		System.out.println(pName + "의 구슬의 개수는 " + mNum + "개 입니다.");
	}
}
