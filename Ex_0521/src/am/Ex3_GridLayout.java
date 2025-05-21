package am;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex3_GridLayout extends JFrame {
	
	JButton[] ar = new JButton[5];
	GridLayout gl;
	JPanel center_P;
	
	
	public Ex3_GridLayout() {
		
		center_P = new JPanel();
		gl = new GridLayout(3,3, 10, 20);//3행 3열 즉 9개의 셀이 생긴다. 각각이 셀에는 하나 밖에 못쓴다.
		center_P.setLayout(gl); //기본레이어 아웃이였던, FlowLayout을 GridLayout으로 변경
		
		for(int i =0; i<ar.length; i++) {
			ar[i] = new JButton(String.valueOf(i+1));
			center_P.add(ar[i]); //center_P에 버튼객체 추가
			
		}
		
		for(int i =0; i<3; i++) { //3행 3열의 모양을 유지하기 위해 JLabel로 만들어서 추가하는 반복문
			center_P.add(new JLabel());
		}
		
		this.add(center_P);
		
		setBounds(300, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		//프로그램 시작
		new Ex3_GridLayout();
	}
}
