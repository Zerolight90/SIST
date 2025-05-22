package pm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class Ex4_Dialog extends JDialog implements WindowListener, ActionListener{

	JButton red_btn, green_btn, blue_btn;
	JPanel color_P;
	Ex4_Frame f;
	Color color;

	public Ex4_Dialog(Ex4_Frame n) {// Ex4_Frame으로 돌아 가기 위한 지역변수 영역
		f = n;
		
		// 화면 구성
		color_P = new JPanel();
		color_P.add(red_btn = new JButton("Red"));
		color_P.add(green_btn = new JButton("Green"));
		color_P.add(blue_btn = new JButton("Blue"));
		
		this.add(color_P); //현재창 가운데에 color_P 추가
		
		setBounds(40, 150, 250, 160);
		setVisible(true);
		
		
		//이벤트 감시자
		this.addWindowListener(this);
		red_btn.addActionListener(this);
		green_btn.addActionListener(this);
		blue_btn.addActionListener(this);

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 종료버튼 누를떄 호출되는 곳
		this.dispose(); //현재창(대화창객체)만 메모리에서 지우기
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼을 눌를때 발생하는곳
		Object obj = e.getSource();
		
		if(obj == red_btn) {
			f.center_P.setBackground(color.RED);
		}
		if(obj == green_btn) {
			f.center_P.setBackground(color.GREEN);
		}
		if(obj == blue_btn) {
			f.center_P.setBackground(color.BLUE);
		}
		
	}
}
