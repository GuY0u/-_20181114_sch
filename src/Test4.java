
class Thread_Ex extends Thread{
	public Thread_Ex (String name) {
		super(name);
	}
	public void run(){
		System.out.println(getName() + "������");
	}
}

public class Test4 {
	public static void main(String[] str) {
		Thread_Ex obj1 = new Thread_Ex("�ְ� �켱 ����");
		Thread_Ex obj2 = new Thread_Ex("���� �켱 ����");
		Thread_Ex obj3 = new Thread_Ex("���� �켱 ����");
		
		obj1.setPriority(Thread.MAX_PRIORITY);
		obj2.setPriority(Thread.NORM_PRIORITY);
		obj3.setPriority(Thread.MIN_PRIORITY);
		
		obj3.run();
		obj2.run();
		obj1.run();
	}
}

// �켱������ �������� ���� �󵵸� ������ ���̴�