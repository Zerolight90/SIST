package pm;

import java.util.Scanner;

public class Ex7_Oper {

	public static void main(String[] args) {
		// 프로그램 시작
		
		//키보드로 부터 정수 하나 받기 위해 필요한 객체
		
		Scanner scan = new Scanner(System.in);
		
		//정수를 받기 전에 문자열 출력
		
		System.out.print("정수 입력 : ");
		
		//키보드와 연결된 스캐너로부터 정수를 하나 받아서 
		//변수 v1에 저장하자
		
		int v1 = scan.nextInt();
		
		//입력받은 값이 10(10~19)인지? 맞다면 true 맞지 않다면 false로 표현 하자
		//v1이 10보다 크거나 같고,
		//v1이 20보다 작으면 true 이럴 때 논리연산자를 같이 써야 함
		//논리연산자 : && And 의미 모든 값이 true이어 야지 true
		//		   || or 의미 하나라도 true 면 true 단, 앞에게 true면 뒤에 연산처리는 하지 않는다.

		boolean res = (v1 >= 10)&&(v1 <20);
		
		System.out.println("v1의 값이 10대 인가?"+ res);
		
	}

}
