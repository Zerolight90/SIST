package pm;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex3_Frame extends JFrame  {

	Ex3_Panel p;
	
	public Ex3_Frame() {

		p = new Ex3_Panel();
		this.add(p);

		setBounds(300, 100, 500, 500);
		setVisible(true);

		//이벤트 감지자 등록
		this.addWindowListener(new Ex2_MyAdap());
		p.addMouseMotionListener(new Ex3_MouseMotion(this));
		
		//Ex3_MouseMotion객체를 생성할 떄 인자가 this가 되어 
		//현재 객체 (Ex3_Frame)의 주소를 전달했다.

	}


	public static void main(String[] args) {
		//프로그램 시작

		new Ex3_Frame();

	}

}
