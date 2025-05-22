package pm;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex5_test1 extends JFrame implements ActionListener {

	ImageIcon icon;
	JLabel icon_lb;
	JPanel card1, card2;
	JPanel p1_south_p, s_p1, s_p2, p2_south_p;
	JTextField talkname, msg_F;
	JButton login_btn, send_btn;
	JTextArea ta;

	CardLayout card;

	public Ex5_test1() {
		// 현재 창의 레이아웃을 CardLayout으로 지정
		card = new CardLayout();
		this.getContentPane().setLayout(card);

		// 첫번쨰 화면 작업
		card1 = new JPanel(new BorderLayout());
		icon = new ImageIcon("src/images/logo.png");
		icon_lb = new JLabel(icon);
		card1.add(icon_lb); // 첫번쨰 화면 가운데에 이미지 표현
		s_p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		s_p1.add(new JLabel("대화명 :"));
		s_p1.add(talkname = new JTextField(8));
		s_p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		s_p2.add(login_btn = new JButton("    로그인    "));

		p1_south_p = new JPanel(new GridLayout(2, 1));
		p1_south_p.add(s_p1);
		p1_south_p.add(s_p2);

		card1.add(p1_south_p, BorderLayout.SOUTH);

		this.getContentPane().add("card1", card1);

		// 두번쨰 화면
		card2 = new JPanel(new BorderLayout());
		card2.add(new JScrollPane(ta = new JTextArea()));
		p2_south_p = new JPanel(new BorderLayout());
		p2_south_p.add(msg_F = new JTextField());
		p2_south_p.add(send_btn = new JButton("보내기"), BorderLayout.EAST);
		card2.add(p2_south_p, BorderLayout.SOUTH);
		this.getContentPane().add("card2", card2);
		
//		card.show(this.getContentPane(), "card2");

		// 화면 셋팅
		setBounds(300, 100, 400, 500);
		setVisible(true);

		// 이벤트 감시자
		this.addWindowListener(new Ex2_MyAdap());
		login_btn.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex5_test1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj == login_btn) {
			//로그인 버튼을 클릭 했을때
			
			//사용자가 입력한 대화명 가져오기
			String n = talkname.getText().trim();
			if(n.length()>0) {
				//대화명을 한자라도 입력한 경우
				card.show(this.getContentPane(), "card2");
			}else {
				JOptionPane.showMessageDialog(this,"대화명을 입력하세요");
			}
		}
		
	}

}
