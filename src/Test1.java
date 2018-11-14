
class MyThread implements Runnable{
	public void run() {
		for(int i = 10; i >=0; i--)
			System.out.print(i + " ");
	}
}

public class Test1 {
	public static void main(String args[]) {
		Thread t = new Thread(new MyThread());
		t.start();
	}

}
