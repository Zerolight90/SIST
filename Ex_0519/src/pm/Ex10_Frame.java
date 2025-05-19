package pm;

import javax.swing.JFrame;

public class Ex10_Frame extends JFrame {

	
	
	public static void main(String[] args) {
		// 프로그램 시작
		
		//현재객체 생성
		Ex10_Frame frame = new Ex10_Frame();
		frame.setSize(720, 480); //창 크기 설정
		frame.setLocation(500, 200); //창 위치 설정
		frame.setVisible(true); //창 보여주기
	}

}
