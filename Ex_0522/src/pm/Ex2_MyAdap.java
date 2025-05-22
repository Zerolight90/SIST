package pm;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_MyAdap extends WindowAdapter {

	@Override
	//종료버튼(x) 눌렀을 때 호출되는 기능
	public void windowClosing(WindowEvent e) {
		//프로그램 종료
		System.exit(0); //지금 즉시 종료 해라
	}
	
	
 

}
