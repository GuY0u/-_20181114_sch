import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test3 extends JFrame{
	private JLabel label;
	
	class MyThread extends Thread{
		public void run() {
			for(int i = 10; i >=0; i--) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i + "");
			}
		}
	}
	public Test3() {
		setTitle("ī��Ʈ�ٿ�");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("Start");
		label.setFont(new Font("Serif", Font.BOLD,100));
		add(label);
		(new MyThread()).start();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Test3 t = new Test3();
	}
	
}