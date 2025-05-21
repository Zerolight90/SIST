package pm;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ex8_Frame extends JFrame implements ActionListener {

	// 현재 창에 들어가는 객체들을 맴버변수로 선언
	JPanel north_P;
	JTextArea cen_ta;
	private JButton[] btn = new JButton[8];

	public Ex8_Frame() {// 기본 생성자
		this.setTitle("구구단 출력 프로그램");

		// 맴버변수 초기화
		north_P = new JPanel();
		cen_ta = new JTextArea();
		for (int i = 0; i < btn.length; i++) {
			StringBuffer sb = new StringBuffer();
			sb.append(i + 2);
			btn[i] = new JButton(sb.toString());
			north_P.add(btn[i]);

			btn[i].addActionListener(this);
		}

		this.add(north_P, BorderLayout.NORTH);
		this.add(cen_ta);

		this.setBounds(500, 200, 720, 480);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}// 기본 생성자 끝

	public static void main(String[] args) {
		new Ex8_Frame();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();

		for (int i = 0; i < btn.length; i++) {
			int j = i + 2;

			if (obj == btn[i]) {

				StringBuffer sb = new StringBuffer();
				
				for (int k = 1; k <= 9; k++) {

					sb.append(j);
					sb.append("단\r\n");
					sb.append(j);
					sb.append(" x ");
					sb.append(k);
					sb.append(" = ");
					sb.append(j * k);
					sb.append("\r\n");

				}
				cen_ta.setText(sb.toString());
				
			} // 구구단 계산 for문

			// 구구단 조건문
		}

	}

}
