
class Thread_Ex extends Thread{
	public Thread_Ex (String name) {
		super(name);
	}
	public void run(){
		System.out.println(getName() + "스레드");
	}
}

public class Test4 {
	public static void main(String[] str) {
		Thread_Ex obj1 = new Thread_Ex("최고 우선 순위");
		Thread_Ex obj2 = new Thread_Ex("보통 우선 순위");
		Thread_Ex obj3 = new Thread_Ex("최저 우선 순위");
		
		obj1.setPriority(Thread.MAX_PRIORITY);
		obj2.setPriority(Thread.NORM_PRIORITY);
		obj3.setPriority(Thread.MIN_PRIORITY);
		
		obj3.run();
		obj2.run();
		obj1.run();
	}
}

// 우선순위는 스레드의 선택 빈도를 높여줄 뿐이다