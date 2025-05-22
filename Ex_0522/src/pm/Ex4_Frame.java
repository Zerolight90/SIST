package pm;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex4_Frame extends JFrame implements ActionListener {

	JPanel north_P, center_P;
	JButton btn;
	
	public Ex4_Frame() {
		
		//화면 구성
		north_P = new JPanel();
		north_P.add(btn = new JButton("색상"));
		this.add(north_P, BorderLayout.NORTH);
		
		this.add(center_P = new JPanel());
		
		
		
		
		setBounds(300, 100, 450, 450);
		setVisible(true);
		
		//이벤트 감시자
		this.addWindowListener(new Ex2_MyAdap());
		btn.addActionListener(this);
	}
	
	public static void main(String[] args) {
		//프로그램 시작
		new Ex4_Frame();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 색상버튼을 클릭할떄 마다 수행하는곳
		new Ex4_Dialog(this);
		
	}

}
