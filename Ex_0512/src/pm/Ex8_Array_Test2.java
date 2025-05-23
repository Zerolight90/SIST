package pm;

import java.util.Scanner;

public class Ex8_Array_Test2 {

	public static void main(String[] args) {
		int[] com = new int[3];
		int[] user = new int[3];

		int strike_count = 0; // 이 변수가 3이될 때 프로그램 종료!
		int ball_count = 0;
		int cnt = 0;// 시도한 회차수

		// 키보드로 부터 입력 받기 위한 스케너 준비
		Scanner scan = new Scanner(System.in);

		// 컴퓨터가 가지는 수를 정하는 반복문 - 중복되면 안됨
		for (int i = 0; i < com.length;) {
			com[i] = (int) (Math.random() * 9 + 1);
			boolean chk = true;
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					chk = false;
					break;
				}
			}
			if (chk)
				++i;
		}
		System.out.printf("com: %d, %d, %d\r\n", com[0], com[1], com[2]);
		// 사용자로 하여금 입력하도록 유도 한다. - 반복수행 하는 것이 좋음
		do {
			strike_count = 0;
			ball_count = 0;
			++cnt;
			System.out.println(cnt + "차:");
			String str = scan.nextLine();
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				user[i] = ch - 48; // '1'이 코드값으로 49이므로 48을 빼면 1이 user[i]번째에 저장
			} // 사용자가 입력한 문자열을 숫자로 변경하여 user배열에 저장했다.

			// 스트라이크 카운트하는 반복문: 같은 자리의 값들만 비교한다.
			for (int i = 0; i < com.length; i++) {
				if (user[i] == com[i])
					strike_count++;
			}

			// 볼 카운트하는 반복문
			for (int i = 0; i < com.length; i++) {
				if (user[i] == com[(i + 1) % com.length])
					ball_count++;
				else if (user[i] == com[(i + 2) % com.length])
					ball_count++;
			}
			System.out.printf("%dStrike, %dBall\r\n", strike_count, ball_count);
		} while (strike_count != 3);

		System.out.println(cnt + "회차에 성공!");
	}

}
