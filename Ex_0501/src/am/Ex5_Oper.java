package am;

import java.util.Scanner;

public class Ex5_Oper {

	public static void main(String[] args) {
		// 프로그램 시작
		
		// 삼항연산자(조건연산자)
		// [구성]
		// (조건식)?참값:거짓값;
		int a = 7;
		int b = 5;
		
		int res = (a>b)?1:0;
		//거짓값과 참값을 모두 저장할 수 있는 변수를 준비하고,
		// 삼항연산자는 반드시 조건을 수행하는 식이 존재해야 한다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 값: ");
		a = scan.nextInt();
		
		System.out.print("두번째 값: ");
		b = scan.nextInt();
		
		String str = (a>b)?"a가 크다":"b가 크다";
		System.out.println(str);
		
			

	}

}
