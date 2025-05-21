package pm;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex6_Mouse extends JFrame implements MouseListener {

	JPanel center_P;
	int count;
	Color color;
	
	public Ex6_Mouse() {
		center_P = new JPanel();
		this.add(center_P);
		
		this.setBounds(300, 100, 400, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		color = center_P.getBackground(); //초기 배경색 얻기
		
		//이벤트 감지자 등록
		center_P.addMouseListener(this);
	}
	
	public static void main(String[] args) {
		
		new Ex6_Mouse();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setTitle(++count+"회 클릭");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// center_p에 마우스가 들어가면 수행하는 곳
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		
		Color c = new Color(red, green, blue);
		//위에서 만든 객체를 rgb값으로 넣는다
		center_P.setBackground(c);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// center_p에 마우스가 빠져나오면 수행하는 곳
		center_P.setBackground(color);
	}

}
