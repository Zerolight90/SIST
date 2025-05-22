package homeWork;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EmpFrame extends JFrame implements ActionListener {

	JPanel west_P, south_P, p1, p2, p3, p4;
	JTextField empno_tf, ename_tf, pos_tf, dept_tf;
	JButton total_bt, add_bt, search_bt, del_bt, cancel_bt;
	JTextArea ta;

	final int TOTAL = 1;
	final int ADD = 2;
	final int SEARCH = 3;
	final int DEL = 4;
	final int CANCEL = 0;

	int cmd; // 현재 눌러진 버튼값 저장소

	public EmpFrame() {

		// 아랫쪽 제이페널 셋팅
		south_P = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		south_P.add(total_bt = new JButton("전체"));
		south_P.add(add_bt = new JButton("추가"));
		south_P.add(search_bt = new JButton("검색"));
		south_P.add(del_bt = new JButton("삭제"));
		south_P.add(cancel_bt = new JButton("취소"));
		// 현재 창 south영역에 south_p를 추가
		this.add(south_P, BorderLayout.SOUTH);

		// 오른 제이패널 셋팅
		west_P = new JPanel(new GridLayout(6, 1));
		west_P.add(new JLabel()); // 공백 추가
		// 두번쨰 셀에는 사번:______가 들어가는 p1을 만들어야 한다.
		p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(new JLabel("사번"));
		p1.add(empno_tf = new JTextField(8));
		west_P.add(p1);
		// 세번쨰 셀에는 이름:______가 들어가는 p1을 만들어야 한다.
		p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(new JLabel("이름"));
		p2.add(empno_tf = new JTextField(8));
		west_P.add(p2);
		// 네번쨰 셀에는 직책:______가 들어가는 p1을 만들어야 한다.
		p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p3.add(new JLabel("직책"));
		p3.add(empno_tf = new JTextField(8));
		west_P.add(p3);
		// 다섯번쨰 셀에는 부서:______가 들어가는 p1을 만들어야 한다.
		p4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p4.add(new JLabel("부서코드"));
		p4.add(empno_tf = new JTextField(8));
		west_P.add(p4);

		this.add(west_P, BorderLayout.WEST);
		this.add(new JScrollPane(ta = new JTextArea()));// 가운데 추가

		setTitle("사원 관리 프로그램");
		setBounds(500, 100, 400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		// 이벤트 감시자 등록
		total_bt.addActionListener(this);
		add_bt.addActionListener(this);
		search_bt.addActionListener(this);
		del_bt.addActionListener(this);
		cancel_bt.addActionListener(this);

	}

	public void setButton() {

		total_bt.setEnabled(false);
		add_bt.setEnabled(false);
		search_bt.setEnabled(false);
		del_bt.setEnabled(false);

		switch (cmd) {
		case ADD:
			add_bt.setEnabled(true);
			break;
		case SEARCH:
			search_bt.setEnabled(true);
			break;
		case DEL:
			del_bt.setEnabled(true);
			break;
		case CANCEL:
			total_bt.setEnabled(true);
			add_bt.setEnabled(true);
			search_bt.setEnabled(true);
			del_bt.setEnabled(true);

		}

	}

	public void viewData() {
		cmd = 0;
		// 데이터들 불러서 ta에 표현했다.
		setButton();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 각 버튼을 클릭할 때 수행하는 곳
		Object obj = e.getSource();

		if (obj == total_bt) {

		} else if (obj == add_bt) {
			if (cmd == ADD) {

				viewData();
			} else {
				cmd = ADD;
				setButton();
			}
		}

		else if (obj == search_bt)	{

			if (cmd == SEARCH) {

				viewData();
			} else {
				cmd = SEARCH;
				setButton();
			}

		} else if (obj == del_bt) {

			if (cmd == DEL) {

				viewData();
			} else {
				cmd = DEL;
				setButton();
			}

		} else {

			if (cmd == CANCEL) {

				viewData();
			} else {
				cmd = CANCEL;
				setButton();
			}




		}
		//

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmpFrame();
	}

}
