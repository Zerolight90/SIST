package pm;

import java.util.Scanner;

public class Ex9_Oper {

	public static void main(String[] args) {
		// 키보드로부터 정수를 하나 받아 변수 v1에 저장한다.
		// v1의 값이 20대 인지 아닌지? 판단하는 프로그램을 구현하시오
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int v1 = scan.nextInt();
		System.out.println("입력하신 정수 v1 = " + v1);

		boolean res = (v1>=20) && (v1<=30);
		System.out.println("입력한 v1의 값은 " + v1 +" 이므로 결과는 " + res);
	}

}