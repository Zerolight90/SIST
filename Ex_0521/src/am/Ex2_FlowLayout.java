package am;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex2_FlowLayout extends JFrame implements ActionListener {
	
	JPanel north_P;
	JButton bt1, bt2, bt3;
	
	public Ex2_FlowLayout() {//기본 생성자
		//생성자는 객체가 생성될때 단 한번 호출 되면서 맴버 변수를 초기화를 목적으로 한다.
		north_P = new JPanel();
		bt1 = new JButton("Left");
		bt2 = new JButton("Center");
		bt3 = new JButton("Right");
		
		north_P.add(bt1);
		north_P.add(bt2);
		north_P.add(bt3);
		
		//버튼 3개를 가지는 north_P를 현재 창의 North영역에 추가한다.
		this.add(north_P, BorderLayout.NORTH);
		
		setBounds(300, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 이벤트 감지자 등록
		bt1.addActionListener(this); //인자는 ActionListener를 구현한 객체의 주소
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		
	}//기본 생성자 영역
	

	@Override
	public void actionPerformed(ActionEvent e) {
		//각 버튼을 클릭할때 마다 수행하는 곳
		
		String str = e.getActionCommand(); //클릭한 버튼의 문자열을 얻어낸다.
		if(str.equals("Left")) {
			//버튼들을 왼쪽 맞춤을 수행
			FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
			//위에서 만든 레이아웃을 다시 north_P에 적용하자
			north_P.setLayout(fl);
			north_P.updateUI();
			
		} else if(str.equals("Right")) {
			FlowLayout fl = new FlowLayout(FlowLayout.RIGHT);
			north_P.setLayout(fl);
			north_P.updateUI();	
		} else {
			FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
			north_P.setLayout(fl);
			north_P.updateUI();	
			
		}

	}

	public static void main(String[] args) {
		// 프로그램 시작
		new Ex2_FlowLayout(); //현재 클래스 초기화

	}

}
