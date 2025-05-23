package homeWork;

import java.awt.Graphics;

import javax.swing.JPanel;

public class TestPanel extends JPanel {

	int x = 200; //시작점
	
	@Override
	protected void paintComponent(Graphics g) {
		// 그림을 그리는 동작, Graphics g 가 바로 붓과 같은 객체이다.
		
		super.paintComponent(g);
		g.fillRect(x, 235, 80, 30);
		
		
	}
	
	

}
