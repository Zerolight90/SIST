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

public class Ex7_Tset extends JFrame {

	JPanel p;
	int x = 220;
	int y = 170;
	int cmd = 0;
	final private int left = 1;
	final private int right = 2;
	final private int up = 3;
	final private int down = 4;

	Thread t1 = new Thread() {

		@Override
		public void run() {
			// 해당 스레드가 해야할 일
			cmd = (int) (Math.random() * 4 + 1); //난수를 발생해서 변수 1은 왼쪽 2은 오른쪽 3은 위 4는 아래 조건을 발생한다. 

			while (true) {

				if (cmd == left) { //난수 1일떄 왼쪽
					x -= 5;
					if (x == 0)
						break;
				}

				if (cmd == right) { //난수 2일떄 오른쪽
					x += 5;
					if (x > p.getWidth() - 50)
						break;
				}

				if (cmd == up) { //난수 3일떄 위
					y -= 5;
					if (y == 0)
						break;
				}

				if (cmd == down) { //난수 4일떄 아래
					y += 5;
					if (y > p.getHeight() - 50)
						break;
				}

				try {

					Thread.sleep(30);
					p.repaint();
				} catch (Exception e) {
					// TODO: handle exception
				}
			} // 무한 반복문 끝
		}

	};

	public Ex7_Tset() {

		// 오렌지 상자
		p = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				Image buf = createImage(this.getWidth(), this.getHeight());

				Graphics buf_g = buf.getGraphics();// 이미지에 그리는 전용 붓
				buf_g.setColor(Color.ORANGE);

				buf_g.fillRect(x, y, 50, 50);// 이미지에 그림을 그림

				// 사각형이 그려진 이미지를 JPanel에 넣기
				g.drawImage(buf, 0, 0, this); // 여기서Jpanel을 상속받는 익명 객체

			}

		};

		// 화면 구성
		this.add(p);
		setBounds(300, 100, 500, 400);
		setVisible(true);

		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();

				switch (keyCode) {
				case KeyEvent.VK_SPACE:
					t1.start();
					break;

				}

				while (true) {
					switch (keyCode) {
					case KeyEvent.VK_UP:
						cmd = up;
						break;
					case KeyEvent.VK_DOWN:
						cmd = down;
						break;
					case KeyEvent.VK_RIGHT:
						cmd = right;
						break;
					case KeyEvent.VK_LEFT:
						cmd = left;
						break;
					}
					break;
				}

			}

		});

		// 시스템 종료
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

	}

	public static void main(String[] args) {
		new Ex7_Tset();

	}

}
