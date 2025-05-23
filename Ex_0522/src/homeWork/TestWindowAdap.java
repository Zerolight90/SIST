package homeWork;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindowAdap extends WindowAdapter  {

	
	
	//windowAdapter는 windowListener를 구현하였으며 추상메서드들이
	//모두 Empty를 재정의 되어 현재 클래스에서 의무적으로 재정의할
	//메서드가 없다.
	
	@Override
	public void windowClosing(WindowEvent e) {
		//지금 바로 프로그램 종료
		System.exit(0);
		
	}
	
	



}
