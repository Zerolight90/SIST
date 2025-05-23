package am;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex3_Frame extends JFrame {
	
	private String msg = "쌍용교육센터";
	JPanel p;

	public Ex3_Frame() {

		p = new JPanel(){

			@Override
			protected void paintComponent(Graphics g) {
				g.drawString(msg, 10, 50);
			}
			
			
			
			//Jpanel을 상속받는 이름 없는 내부 클래스
			
			
			
			
		};
		this.add(p);
		

		this.setBounds(300, 100, 300, 300);
		this.setVisible(true);

		// 이벤트 감지 영역
		this.addWindowListener(new WindowAdapter() {

			// 내부클래스
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// 프로그램 종료
			}
			// 현재 영역은 WindowAdapeter를 상속받는 이름없는 내부 클래스다.
			// class ? extednds WindowAdapeter()

		});

	}

	public static void main(String[] args) {
		// 프로그램 시작

		new Ex3_Frame();

	}

}
