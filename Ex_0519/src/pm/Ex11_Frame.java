package pm;

import javax.swing.JFrame;

public class Ex11_Frame extends JFrame {
	
	public Ex11_Frame() {
		this.setTitle("내가 만든 창");
		
		//현재 객체(this)가 상속받아서 가지고 있는 setSize호출
		this.setSize(720, 480);
		this.setLocation(500, 200);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}//기본 생성자 생성

	public static void main(String[] args) {
		//프로그램 시작
		//현재 객체 생성
		Ex11_Frame f = new Ex11_Frame();
		
	
	}

}
