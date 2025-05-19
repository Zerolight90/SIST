package pm;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


//현재 객체는 JFeame으로 부터 상속을 받았으므로
//현재 개겣를 생성하는 순간 바로 창틀을 만드는것과 같다.
public class Ex12_Frame extends JFrame {
	//현재 창 객체가 가지는 모든 것들을 맴버변수로 선언한다.
	private JButton bt1, bt2, bt3;
	
	public Ex12_Frame() {//Ex12_Frame의 기본 생성자
		setTitle("버튼을 가진 창");
		
		//버튼 객체 생성
		bt1 = new JButton("버튼1");
		bt2 = new JButton("버튼2");
		bt3 = new JButton("버튼3");
		
		//현재 창(this)에 추가(add)해야 한다.
		this.add(bt1, BorderLayout.NORTH);//north 영역에 bt1추가
		
		this.add(bt2, BorderLayout.CENTER);//생갹하면 center
		
		this.add(bt3, BorderLayout.EAST);
		
		
		setSize(720, 480);
		setLocation(400, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// 프로그램의 시작
		
		Ex12_Frame f = new Ex12_Frame();
		
			

	}

}
