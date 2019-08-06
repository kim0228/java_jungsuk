package ThreadSynchronized;

public class ThreadSynchronizedTest {
	public static void main(String[] args) {
		Task task = new Task();
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);

		t1.setName("t1-Thread");
		t2.setName("t2-Thread");

		t1.start();
		t2.start();
	}
}

class Account {
	int balance = 1000;

	public synchronized void withDraw(int money) {
		// synchronized는 현재 사용하고 있는 스레드를 제외하고 나머지 스레드들은 데이터에 접근할 수 없도록 만든 개념이다.
		if (balance >= money) {
			try {
				Thread thread = Thread.currentThread();
				System.out.println(thread.getName() + " 출금 금액 ->> " + money);
				Thread.sleep(1000);
				balance -= money;
				System.out.println(thread.getName() + " balance : " + balance);
			} catch (Exception e) {

			}
		}
	}
}

class Task implements Runnable {
	Account acc = new Account();

	@Override
	public void run() {
		while (acc.balance > 0) {
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withDraw(money);
		}
	}
}
