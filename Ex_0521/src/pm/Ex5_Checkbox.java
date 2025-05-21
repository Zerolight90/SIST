package pm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex5_Checkbox extends JFrame implements ActionListener, ItemListener {

	JPanel north_P, center_P;
	JButton bt;
	JCheckBox ch1, ch2, ch3;
	GridLayout grid;
	FlowLayout flow;

	public Ex5_Checkbox() {

		flow = new FlowLayout(FlowLayout.RIGHT);
		north_P = new JPanel(flow);

		grid = new GridLayout(3, 1);
		center_P = new JPanel(grid);

		bt = new JButton("확인");
		north_P.add(bt);
		bt.setEnabled(false); //비활성화

		ch1 = new JCheckBox("항목1");
		ch2 = new JCheckBox("항목2");
		ch3 = new JCheckBox("항목3");

		center_P.add(ch1);
		center_P.add(ch2);
		center_P.add(ch3);

		// 각 패넣들을 원하는 위치에 배치
		this.add(north_P, BorderLayout.NORTH);
		this.add(center_P, BorderLayout.CENTER);

		this.setBounds(300, 300, 400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

		// 이벤트 감지자 등록
//		ch1.addActionListener(this);
//		ch2.addActionListener(this);
//		ch3.addActionListener(this);
		
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex5_Checkbox();
		
		

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str = e.getActionCommand();
		Object obj = e.getSource();
		boolean ch = false;
		
		if(obj==ch1) {
			ch = ch1.isSelected();
		}
			else if(obj == ch2) {
				ch=ch2.isSelected();
			
			}else {
				ch=ch3.isSelected();
			}
			
			if(ch) {
				this.setTitle(str);
			}
			else
				this.setTitle("");

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getStateChange()==ItemEvent.SELECTED) {
			//이벤트를 발생시킨 객체가 뭔지는 모르지만
			//현재 이벤트를 감지하는 객체는 ch1, ch2, ch3가 되므로
			//그냥 이벤트 발생 객체의 문자열 얻어낸다.
			Object obj = e.getItem();
			JCheckBox ch = (JCheckBox) obj;
			String str = ch.getActionCommand();
			setTitle(str);//제목 변
		}else {
			setTitle("");
		}
		
	}

}
