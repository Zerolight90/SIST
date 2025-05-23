package homeWork;

import javax.swing.JFrame;



public class TestFrame extends JFrame {

		
	TestPanel p;
	 
	public TestFrame() {
		
		this.add(p=new TestPanel());
			
		
		setBounds(300, 100, 500, 320);
		setVisible(true);
		
		//이벤트 감지자 영역
		this.addWindowListener(new TestWindowAdap()); // 종료를 위해 만든 TestWindowAdap 함수를 불러 호출한다.
		this.addKeyListener(new TestKeyAdap(this));
	}
	
	
	public static void main(String[] args) {
		//프로그램 시작
		new TestFrame();

	}

}
