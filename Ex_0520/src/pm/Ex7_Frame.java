package pm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex7_Frame extends JFrame implements ActionListener {

	// 현재 창에 들어가는 객체들을 맴버변수로 선언
	JPanel btn;
	JPanel cen;
	private JButton[] bt_ar = new JButton[3];

	public Ex7_Frame() {
		setTitle("Ex7_Frame");

		// 맴버 변수들의 초기화
		btn = new JPanel();
		bt_ar[0] = new JButton("Red");
		bt_ar[1] = new JButton("Green");
		bt_ar[2] = new JButton("blue");
		cen = new JPanel();

		
		//각 객체들 배치
		
		this.add(btn, BorderLayout.NORTH);
		
		//버튼을 JPanel btn에 추가해주는 for문
		for (int i = 0; i < bt_ar.length; i++) {
			
			//JPanel btn에 배열로 추가
			btn.add(bt_ar[i]);
			
			//이벤트 감지자 등록
			bt_ar[i].addActionListener(this);
			
		} // for문의 끝
		this.add(cen);
		//배치 끝
		
		//창 크기 위치 등셋팅
//		this.setSize(720, 480);
//		this.setLocation(400, 300);
		this.setBounds(500, 200, 720, 480);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		
	}//기본 생성자 끝

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ex7_Frame f = new Ex7_Frame();
		new Ex7_Frame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트가 발생할 때 마다 수행하는 곳
		// 이벤트 발생 시킬 객체를 알아낸다.
		
		Object obj = e.getSource();
		if(obj == bt_ar[0]) {
			cen.setBackground(Color.RED);
		}else if(obj == bt_ar[1]) {
			cen.setBackground(Color.GREEN);
		} else {
			cen.setBackground(Color.BLUE);
		}
		
		
	}

	

}
