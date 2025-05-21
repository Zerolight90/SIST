package am;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Formatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


// 5월20일 Ex8_Frame 예제 코드 리펙토링! 

public class Ex1_GuguDan extends JFrame implements ActionListener {
	//현재 창에서 필요한 객체들을 모두 맴버로 생성
	JPanel north_P;
	JButton[] btn;
	JTextArea cen_ta;

	//기본 생성자 생성
	public Ex1_GuguDan() {
		//화면 디자인 하기
		//화면 모양 -- 창틀(JFrame)은 기본레이아웃이 BorderLayout이다.
		north_P = new JPanel(); //패널의 기본 레이아웃이  FlowLayout 이다. => 순서대로 배치
		btn = new JButton[8];
		for(int i =0; i<btn.length; i++) {
			String v1 = String.valueOf(i+2);			
			btn[i] = new JButton(v1);
			north_P.add(btn[i]);	
			
			//생성된 버튼객체 각각에 이벤트 감지자 등록
			btn[i].addActionListener(this);
		}//for의 끝
		//현재 창 north영역에 north_P 추가
		this.add(north_P, BorderLayout.NORTH);
		//현재 창 가운데 영역에 cen_ta 추가
		JScrollPane jp = new JScrollPane(cen_ta = new JTextArea());
		this.add(jp);
		
		this.setBounds(500, 200, 400, 480);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		new Ex1_GuguDan();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//현재 이벤트를 발생 시킨 객체의 문자열을 얻어낸다
		String str = e.getActionCommand();
		int dan = Integer.parseInt(str);
		
		StringBuffer sb = new StringBuffer(str);
		sb.append("단\r\n");
		sb.append("==============\r\n");
		
		Formatter fm = new Formatter(sb);;
		for(int i=1; i<10; i++) {
			fm.format("%d*%d=%d\r\n", dan,i,dan*i);
		}
		cen_ta.setText(sb.toString());
		
		
		/*
		for(int i=1; i<10; i++) {
			sb.append(str);
			sb.append(" x ");
			sb.append(String.valueOf(i));
			sb.append(" = ");
			sb.append(String.valueOf(dan*i));
			sb.append("\r\n");
		}
		cen_ta.setText(sb.toString());
	
		*/
		
		/*
		cen_ta.setText(str);
		cen_ta.append("단\r\n");
		cen_ta.append("==============\r\n");
		
		for(int i=1; i<10; i++) {
			cen_ta.append(str);
			cen_ta.append("x");
			cen_ta.append(String.valueOf(i));
			cen_ta.append("=");
			cen_ta.append(String.valueOf(dan*i));
			cen_ta.append("\r\n");
		}
		*/
		
		
		
	}

}
