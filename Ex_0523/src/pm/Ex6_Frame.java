package pm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex6_Frame extends JFrame {

	JPanel p;
	int x = 220;
	int y = 170;
	
	Thread t1 = new Thread(){

		@Override
		public void run() {
		//해당 스레드가 해야할 일
			
			
			while (true) {
				x += 5;
				if(x>p.getWidth()-40)
					break;
				try {
					Thread.sleep(30);
					p.repaint();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}//무한 반복문 끝
		}
	
		
		
	};
	public Ex6_Frame() {

		p = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				Image buf = createImage(this.getWidth(), this.getHeight());

				Graphics buf_g = buf.getGraphics();// 이미지에 그리는 전용 붓
				buf_g.setColor(Color.MAGENTA);

				buf_g.fillRect(x, y, 40, 40);//이미지에 그림을 그림
				
				//사각형이 그려진 이미지를 JPanel에 넣기
				g.drawImage(buf, 0, 0, this); //여기서Jpanel을 상속받는 익명 객체
			}
		};
		
		this.add(p);

		setBounds(300, 100, 500, 400);
		setVisible(true);
		
//		t1.start();
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				case KeyEvent.VK_SPACE:
					t1.start();
					break;
				}
				
				
			}
			
			
		});
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
	}

	public static void main(String[] args) {
		new Ex6_Frame();

	}

}
