package am;

public class Ex1_Oper {

	public static void main(String[] args) {
		// 프로그램 시작
		
		// 정수13을 기억하는 변수를 a를 만들자
		
		int a = 13;
		
		//정수 7을 기억하는 변수 b를 만들자
		
		int b = 7;
		
		
		int c = a | b ; // 비트연산자의 논리곱이다.
						// a = 000...1101 =13
						// b = 000...0111 = 7
						// &-------------------
						//     000...0101 = 5
		
		// 8비트는 1바이트 1인트 
		// 1인트는 4바이트
		
		
		System.out.println("c=" + c);

	}

}
