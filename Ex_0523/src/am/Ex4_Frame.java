package am;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex4_Frame extends JFrame {

	JPanel p;
	int x = 205;

	public Ex4_Frame() {
		p = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {

				Image buf = createImage(this.getWidth(), this.getHeight());

				Graphics buf_g = buf.getGraphics();
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				Color c = new Color(red, green, blue);

				buf_g.setColor(c);
				buf_g.fillRect(x, 385, 80, 30); // buf라느 이미지에 사각형을 그린다.

				// 사각형이 그려진 이미지 객체를 현재 JPanel에 넣는다.
				g.drawImage(buf, 0, 0, this);

			}
			// 현재 영역은 Jpanel을 상속받는 익명의 내부 클래스

		};
		
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				case KeyEvent.VK_LEFT:
					x -=5;
					if(x<0) {
						x=0;
					}
					p.repaint();
					break;
					
				case KeyEvent.VK_RIGHT:
					x+=5;
					if(x>p.getWidth()-80) {
						x=p.getWidth()-80;
					}
					p.repaint();
					break;
				}//switch 종료문
//				p.repaint(); //x값이 변경됐으므로 다시 그린다.
				

			}
			//현재 영역은 keyadapeter를 상속받는 익명의 내부 클래스
			
			
			
		});
		
		this.add(p);

		setBounds(400, 100, 500, 500);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			// 윈도우 어뎁터를 상속받는 익며으이 내부클래스 영역이다.

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

	}

	public static void main(String[] args) {
		new Ex4_Frame();

	}

}
