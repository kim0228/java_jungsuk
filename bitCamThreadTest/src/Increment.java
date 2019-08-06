
public class Increment {
	private int num = 0;

	public synchronized void increment() {
		// synchronized는 이 메소드를 가진 객체를 기준으로 이루어진다. 
		// 한 시점에 오직 하나의 쓰레드만이 동기화된 인스턴스 메소드를 실행할 수 있다.
		num++;
	}

	public int getNum() {
		return num;
	}

	public static void main(String[] args) {
		Increment increment = new Increment();

		IncThread t1 = new IncThread(increment);
		IncThread t2 = new IncThread(increment);
		IncThread t3 = new IncThread(increment);

		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println(increment.getNum());
	}
}

class IncThread extends Thread{
	Increment increment;
	
	public IncThread(Increment inc) {
		this.increment = inc;
	}
	
	public void run() {
		for(int i = 0;i<10000;i++) {
			increment.increment();
		}
	}
}