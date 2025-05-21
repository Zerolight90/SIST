package pm;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex9_Member extends JFrame {

	JPanel Eest_P, South_P;
	JTextArea ja;
	JLabel jl1,jl2,jl3,jl4;
	JTextField tf;
	JButton bt1, bt2, bt3, bt4, bt5;
	GridLayout gl1;
	GridLayout gl2;
	
	public Ex9_Member() {

		Eest_P = new JPanel();
		South_P = new JPanel();
		bt1 = new JButton("전체");
		bt2 = new JButton("추가");
		bt3 = new JButton("검색");
		bt4 = new JButton("삭제");
		bt5 = new JButton("취소");
		ja = new JTextArea();
		jl1 = new JLabel("사번");
		jl2 = new JLabel("이름");
		jl3 = new JLabel("직책");
		jl4 = new JLabel("부서");
		tf = new JTextField();
		
		this.add(ja);
		
		//사번 이름 등등
		
		gl2 = new GridLayout(4,1,10,10);
		this.add(jl1);
		this.add(jl2);
		this.add(jl3);
		this.add(jl4);
		this.add(Eest_P,BorderLayout.WEST);
		
		//밑에 버튼
		gl1 = new GridLayout(1,5, 10, 20);
		South_P.setLayout(gl1);
		South_P.add(bt1);
		South_P.add(bt2);
		South_P.add(bt3);
		South_P.add(bt4);
		South_P.add(bt5);
		this.add(South_P,BorderLayout.SOUTH);
		
		setBounds(400, 300, 1280, 720);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex9_Member();

	}

}
