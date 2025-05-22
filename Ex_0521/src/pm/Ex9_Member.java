package pm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex9_Member extends JFrame implements ActionListener{

	JPanel Eest_P, South_P;
	JTextArea ja;
	JLabel jl1,jl2,jl3,jl4;
	JTextField tf1, tf2, tf3, tf4;
	JButton bt1, bt2, bt3, bt4, bt5;
	GridLayout gl1;
	GridLayout gl2;
	FlowLayout fl;
	
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
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JTextField();
		
		this.add(ja);
		
		//사번 이름 등등
		
		gl2 = new GridLayout(6,2,20,20);
		Eest_P.setLayout(gl2);
		Eest_P.add(jl1);
		Eest_P.add(tf1);
		Eest_P.add(jl2);
		Eest_P.add(tf2);
		Eest_P.add(jl3);
		Eest_P.add(tf3);
		Eest_P.add(jl4);
		Eest_P.add(tf4);
		this.add(Eest_P,BorderLayout.WEST);
		
		
		
		//밑에 버튼
		gl1 = new GridLayout(2,5,30,10);
		fl = new FlowLayout(FlowLayout.RIGHT);
		South_P.setLayout(fl);
		South_P.add(bt1);
		South_P.add(bt2);
		South_P.add(bt3);
		South_P.add(bt4);
		South_P.add(bt5);
		this.add(South_P,BorderLayout.SOUTH);
		
		
		//텍스트에어리얼
		ja=new JTextArea();
		this.add(ja);
		
		setBounds(400, 300, 720, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex9_Member();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj==bt2) {
			bt1.setEnabled(false);
			bt3.setEnabled(false);
			bt4.setEnabled(false);
		}else if(obj==bt3) {
			bt1.setEnabled(false);
			bt2.setEnabled(false);
			bt4.setEnabled(false);
		}else if(obj==bt4) {
			bt1.setEnabled(false);
			bt2.setEnabled(false);
			bt3.setEnabled(false);
		}else if(obj==bt5) {
			bt1.setEnabled(true);
			bt2.setEnabled(true);
			bt3.setEnabled(true);
			bt4.setEnabled(true);
			
		}
		
		//setEnabled
	}

}
