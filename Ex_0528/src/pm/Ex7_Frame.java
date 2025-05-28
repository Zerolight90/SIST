package pm;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ex7_Frame extends JFrame {

	JTextArea ta;
	JMenuItem new_item, open_item, save_item, exit_item;
	JMenu f_menu;
	JMenuBar bar;

	// 파일 처리를 위한 객체들
	File f;
	BufferedInputStream bis;
	FileInputStream fis;

	JList<String> list;

	public Ex7_Frame() {

		this.add(new JScrollPane(ta = new JTextArea()));

		// 메뉴작업 -JmenuItem -> JMenu -> JMenuBar
		new_item = new JMenuItem("새파일");
		open_item = new JMenuItem("열기");
		save_item = new JMenuItem("저장");
		exit_item = new JMenuItem("닫기");

		f_menu = new JMenu("파일");
		// 앞서 생성된 JMenuItem들을 JMenu에 추가한다.
		f_menu.add(new_item);
		f_menu.add(open_item);
		f_menu.add(save_item);
		f_menu.addSeparator();
		f_menu.add(exit_item);

		bar = new JMenuBar();
		bar.add(f_menu);

		this.setJMenuBar(bar); // JMenuBar에 추가한다.

		setBounds(300, 100, 600, 550);
		setVisible(true);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// 종료하기 전에 해야할 일이 있으면 이쯤에서 해야함!

				System.exit(0);
			}

		});

		exit_item.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 종료하기 전에 해야할 일이 있으면 이쯤에서 해야함!

				System.exit(0);

			}
		});

		open_item.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 파일 선택기를 만든다.
				JFileChooser jfc = new JFileChooser("c:/my_study/java_study");
				int cmd = jfc.showOpenDialog(Ex7_Frame.this);
				if(cmd == JFileChooser.APPROVE_OPTION) {
					//사용자가 승인을 했을 때만 수행
					//Approve_option이면 사용자가 파일을 선택한 경우
					
					f =jfc.getSelectedFile();
					
					//위에서 받은 파일을 가지고 존재여부 확인 
					if(f.exists() && f.isDirectory()) {
						String[] ar = f.list();
						
						//받은 배열을 JList에 출력하자
						list.setListData(ar);
						
					}//if문 끝	
					
					//스트림과 f를 연동
					try {
						fis = new FileInputStream(f);
						bis = new BufferedInputStream(fis);

						int size = -1;
						byte[] buf = new byte[2048]; // 여기서 배열이 매우 중요하다.

						while ((size = bis.read(buf)) != -1) {
							String str = new String(buf, 0, size);
							ta.setText(str);
							
						} // while종료
						
					} catch (Exception e2) {
						e2.printStackTrace();
						System.out.println("오류 오류 비상 비상");
					}finally {
						try {
							fis.close();
							bis.close();
						} catch (IOException e2) {

							e2.printStackTrace();
						}
					}
					
					
				}
			}
		});

	}// 생성자의 끝

	public static void main(String[] args) {
		// 프로그램 시작
		new Ex7_Frame();

	}

}
