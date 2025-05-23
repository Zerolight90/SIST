package am;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Ex1_Panel extends JPanel {
	
	int x = 205;

	@Override
	protected void paintComponent(Graphics g) {
		//현재 JPanel과 같은 크기의 이미지 객체를 생성하자!
		Image buf = createImage(this.getWidth(), this.getHeight());
		
		//buf에만 그림을 그릴 수 있는 붓객체를 얻어낸다.
		Graphics buf_g = buf.getGraphics();
		buf_g.fillRect(x, 235, 80, 30); //buf이미지에 그림을 그린다.
		
		//현재 JPanel에 위에서 준비된 이미지를 붙여 넣어야 한다.
		g.drawImage(buf, 0, 0, this);

	}
	
	

}
