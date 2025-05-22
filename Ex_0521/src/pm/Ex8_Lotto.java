package pm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex8_Lotto extends JFrame implements ActionListener {

	JPanel north_P, center_P;
	JButton btn;
	JLabel[] ar = new JLabel[6];
	TreeSet<Integer> ts;
	FlowLayout flow;
	GridLayout grid;

	public Ex8_Lotto() {

		setTitle("로또 생성기");

		flow = new FlowLayout(FlowLayout.RIGHT);
		north_P = new JPanel(flow);
		north_P.add(btn = new JButton("번호생성"));
		this.add(north_P, BorderLayout.NORTH);
		
		grid = new GridLayout(1, 6);
		center_P = new JPanel(grid);
		this.add(center_P);
		ts= new TreeSet<Integer>();
		
		setBounds(300, 100, 800, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		// 이벤트 감지자 등록
		
		btn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		center_P.removeAll(); //새로 생성될때 마다 초기화
		
		ts.clear();
		
		while (true) {
			int su = (int)(Math.random() * 45 + 1);// 난수 발생
			ts.add(su);// 
			if (ts.size() == 6)
				break;// 무한반복 탈출
		} // 무한반복의 끝
			// ts에 있는 요소들을 하나씩 얻어내어 ImageIcone으로 만들어야 한다.

		
		
		// 반복자 처리
		Iterator<Integer> it = ts.iterator();
		int i = 0;
		while (it.hasNext()) {
			int n = it.next();
			StringBuffer sb = new StringBuffer("src/images/");
			sb.append(n);
			sb.append(".gif");
			ImageIcon icon = new ImageIcon(sb.toString());
			// JLabel배열에 icon을 넣어서 JLabel을 새성한다.
			ar[i] = new JLabel(icon);
			System.out.println(n);
			//center_P에 추가
			center_P.add(ar[i]);//center_P에 JLabel추가
			i++;
		}
		center_P.updateUI();
	}
	
	public static void main(String[] args) {

		new Ex8_Lotto();

	}
}
