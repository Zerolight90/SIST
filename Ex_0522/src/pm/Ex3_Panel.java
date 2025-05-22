package pm;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Ex3_Panel extends JPanel {

		
	int x,y;
	int width= 10;
	int height= 10;
	@Override
	protected void paintComponent(Graphics g) {
		g.fillOval(x, y, width, height);
	}
	
	

}
