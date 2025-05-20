package pm;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ex6_Frame extends JFrame implements MouseListener {
	
	//현재 창에 들어가는것들을 맴버로 선언
	JPanel north_P;
	JButton bt1, bt2,bt3;
	JTextArea ta;
	
	public Ex6_Frame() {//기본 생성자
		this.setTitle("집에 갈래?");
		
		//맴버 변수들의 초기화
		north_P = new JPanel();
		bt1 = new JButton("그래 갈래");
		bt2 = new JButton("아니야 남을래");
		bt3 = new JButton("모르겠어");
		ta = new JTextArea();
		
		//위에서 생성한 객체들을 배치시켜야 한다.
		//먼저 NOrth영역에 들어갈 버튼들을 north_P에 추가
		
		north_P.add(bt1);
		north_P.add(bt2);
		north_P.add(bt3);
		//현재 창 North영역에 north_P를 추가
		this.add(north_P, BorderLayout.NORTH);
		
		//현재창 가운데에 ta를 추가한다.
		//스크롤바의 역활을 하는 객체 생성
		JScrollPane jp = new JScrollPane(ta);
		this.add(jp); //위치를 명시하지 않으면 자동으로 가운데 들어간다.
		
		this.setSize(720, 480);
		this.setLocation(400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bt1.addMouseListener(this);
		bt2.addMouseListener(this);
		bt3.addMouseListener(this);
		
		
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		Ex6_Frame f = new Ex6_Frame(); //새로운 객체 생성

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 마우스 버튼을 누를 때마다 호출하여 수행하는 곳
		
		//이벤트를 발생시킨 객체를 얻어낸다.
		Object obj = e.getSource();
		if(obj == bt1) {
			//이벤트를 발생시킨 객체가 bt1일때 수행하는 곳
			ta.append("RED\r\n");
		} else if(obj == bt2) {
			ta.append("GREEN \r\n");
		}else {
			ta.append("BLUE\r\n");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
