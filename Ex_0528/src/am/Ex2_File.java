package am;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Formatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Ex2_File extends JFrame {
	
	JPanel north_p;
	JTextField input_tf;
	JButton ok_bt, back_bt;
	JList<String> list;
	
	public Ex2_File() {
		north_p = new JPanel();
		input_tf = new JTextField(20);
		ok_bt=new JButton("확인");
		back_bt=new JButton("뒤로");
		
		north_p.add(new JLabel("경로:"));
		north_p.add(input_tf);
		north_p.add(ok_bt);
		north_p.add(back_bt);
		this.add(north_p, BorderLayout.NORTH);
		
		this.add(new JScrollPane(list= new JList<>()));
		
		
		this.setBounds(300,100,450,600);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			
		});
		
		
		
		ok_bt.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) { 
				//ok_bt를 눌렀을 때만 수행
				// Object obj = e.getSource();를 호출하여 객체를 구별할 필요가 없다.
				
				viewList();
			}
			
			
		}); //ok_bt 종료
		
			
		input_tf.addActionListener(new ActionListener() { //액션은 엔터만 잡아 낸다.
			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewList();
			}
		});
		
		
		back_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/*
				String path = input_tf.getText();
//				File f = new File(path); 
				
				int last = path.lastIndexOf("/");
				String re_path = path.substring(0, last);
				
				File re_f = new File(re_path);
//				System.out.println(re_f);
				
				if(re_f.exists() && re_f.isDirectory()) {
					String[] ar = re_f.list();
					
					//받은 배열을 JList에 출력하자

					list.setListData(ar);
					
				}//if문 끝	
				*/
				
				//1) 사용자가 입력한(intput_tf(JFeldtext)) 값을 얻어 낸다.
				String path = input_tf.getText().trim();
				
				//2)마지막에 있는 "/"의 위치를 알아낸다.
				int index = path.lastIndexOf("/");
				
				//3) 1)로부터 0번지에서 알아낸 위치 직전까지만 문자열 검출
				path = path.substring(0, index);
				
				//4) 위에서 검출된 문자열 input_tf에 저장한다.
				input_tf.setText(path);
				
				//5)가져온 문자열 경로를 가지고 File객체 생성
				//6)가져온 문자열 경로를 가지고 File객체 생성
				//7) 파일객체가 존재하는지? 그리고 폴더인지 판단
				//8) 하위 목록을 문자열 배열로 얻어낸다.
				//9) JList에 데이터로 배열을 저장한다.
				viewList();
				
			}
		});
			
		//마우스로 더블 클릭 했을때 해당 경로로 이동
		
		list.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				//더블 클릭 확인 여부
				String path = input_tf.getText().trim();
				int cnt = e.getClickCount();
				if(cnt == 2) {
					//더블클릭 할때 list에 선택된 값을 가져 오세요
					String str = list.getSelectedValue();
					
//					JOptionPane.showMessageDialog(Ex2_File.this, str);
					StringBuffer sb = new StringBuffer(input_tf.getText().trim());
					sb.append("/");
					sb.append(str);
					
					//조합된 문자열은 sb가 가지고 있다. 이것을 다시 input_tf 다시 지정
					input_tf.setText(sb.toString());
					viewList();
	
				}
			}
			
			
		});
		
	}//기본 생성자
	
	public void viewList() {
		// 첫번째 해야할 일 : 사용자가 입력한(intput_tf(JFeldtext)) 값을 얻어 낸다.
		String path = input_tf.getText().trim();
		
		if(path.length()<3 && !path.contains("/")) {
			path = path.concat("/"); // 맨뒤에 추가 해는 함수 concat
			input_tf.setText(path);
			
//			System.out.println(path);
		}
		
		// 두번일 해야할 일
		File f = new File(path); 
		
		//세번째 해야할 일 : f가 존재 하는지 그리고 폴더인지? 확인해야 한다.
		if(f.exists() && f.isDirectory()) {
			String[] ar = f.list();
			
			//받은 배열을 JList에 출력하자
			list.setListData(ar);
			
		}//if문 끝	
		
	}
	
	
	public static void main(String[] args) {
		new Ex2_File();

	}

}
