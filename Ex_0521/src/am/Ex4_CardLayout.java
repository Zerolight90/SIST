package am;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex4_CardLayout extends JFrame implements ActionListener {

	// 화면에 쓰일 카드
	JPanel card1, card2;
	ImageIcon icon1, icon2;
	JButton btn1, btn2;
	CardLayout cl;
	
	public Ex4_CardLayout() {
		// 첫번째 화면 작업
		card1 = new JPanel();
		JLabel lb = new JLabel("첫번째 화면");
		card1.add(lb);
		icon1 = new ImageIcon("src/images/1.gif");
		JLabel lb2 = new JLabel(icon1);
		card1.add(lb2);
		btn1 = new JButton("다음");
		card1.add(btn1);

		// 두번째 화면 작업
		card2 = new JPanel();
		JLabel lb3 = new JLabel("두번째 화면");
		card2.add(lb3);
		icon2 = new ImageIcon("src/images/2.gif");
		JLabel lb4 = new JLabel(icon2);
		card2.add(lb4);
		btn2 = new JButton("이전");
		card2.add(btn2);
		
		//현재 창의 레이아웃을 카드레이아웃으로 변경한다.
		cl = new CardLayout(); // 카드레이어아웃 준비 완료
		this.getContentPane().setLayout(cl);
		
		//현재 창 안에 각 카드를 등록한다.
		this.getContentPane().add("card1", card1);
		this.getContentPane().add("card2", card2);
		
		cl.show(this.getContentPane(), "card1");
		
		
		setBounds(300, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.btn1.addActionListener(this);
		this.btn2.addActionListener(this);

	}

	public static void main(String[] args) {
		// 프로그램 시작
		new Ex4_CardLayout();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str = e.getActionCommand(); //클릭한 버튼의 문자열을 얻어낸다.
		
		if(str.equals("다음")) {
			//카드를 두번쨰 카드로변경
			cl.show(this.getContentPane(), "card2");
		} else if(str.equals("이전")) {
			cl.show(this.getContentPane(), "card1");
		}
		
		
	}

}
