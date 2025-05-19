package pm;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex13_Frame extends JFrame {

	//버튼 생성 초기화
	private JButton b1,b2,b3,b4,b5;
	
	//Ex13_Frame의 기본객체 생성
	public Ex13_Frame() {
		//창의 이름
		setTitle("버튼 모인 창");
		
		
		//버튼 객체 생성
		b1 = new JButton("북쪽버튼");
		b2 = new JButton("동쪽버튼");
		b3 = new JButton("남쪽버튼");
		b4 = new JButton("센터버튼");
		b5 = new JButton("서쪽버튼");
		
		//창의 사이즈 위치 보이기 등 셋팅
		setSize(720, 480);
		setLocation(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//버튼을 창에 넣기
		this.add(b1, BorderLayout.NORTH);
		this.add(b2, BorderLayout.WEST);
		this.add(b3, BorderLayout.SOUTH);
		this.add(b4, BorderLayout.CENTER);
		this.add(b5, BorderLayout.EAST);
	
		
	}
	
	
	public static void main(String[] args) {
		// 프로그램 시작
		
		Ex13_Frame f = new Ex13_Frame();

	}

}
