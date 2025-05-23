package pm;

import java.util.Scanner;

public class Ex6_Main {

	public static void main(String[] args) {
		// 프로그램 시작
		// 숫자 야구 게임을 하기 위한 객체(Ex6_Baseball) 준비
		Ex6_Baseball bb = new Ex6_Baseball();
		//컴퓨터가 가지는 수를 설정하자!
		bb.init(); // 함수호출
		String msg = bb.getCom();
		//System.out.printf("com: %s\r\n", msg);
		//System.out.println("==============");

		// 키보드로 부터 값을 받기 위해 스캐너 준비
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		int s1 = 0; 
		//int b1 = 0;// public int countBall 여기로 반환

		do {
			//반복 수행하는곳
			++cnt;
			System.out.printf("%d차:", cnt);
			String str = scanner.nextLine(); //키보드로부터 한줄 입력받기
			if(str.length()>3) {
				System.out.println("3자 입력하셔야 합니다.");
				continue;
			}

			bb.setUser(str); // 사용자가 입력한 문자열을 숫자화 시켜서 user배열에 저장함
			
			s1 = bb.countStrike(); // 클래스를 통해서 스트라이크 수를 받음
			int b1 = bb.countBall(); // 클래스를 통해서 볼 카운트 수를 받음
			
			System.out.printf("\r\n%d차시도- %dStrike, %dBall\r\n", cnt, s1, b1);
		}

		while (s1 != bb.com.length);

		System.out.println(cnt + "회차에 성공!");

	}
}
