package pm;

import java.util.Scanner;

public class Ex5_Main {

	public static void main(String[] args) {
		// 스케너 준비
		Scanner scan = new Scanner(System.in);
		System.out.println("단 입력 해주세요");
		int dan = scan.nextInt();//키보드로 부터 정수 하나 받기
		
		//구구단의 값을 받기 위해 필요한 객체 생성
		
		Ex5_Gugudan gu = new Ex5_Gugudan();
		
		//키보드로 부터 입력 받은 단의 값을 Ex5_Gugudan에게 전달 하기
		gu.setDan(dan); 
		
		//해당 구구단의 결과를 문자열로 받는다.
		String str = gu.result();
		System.out.println(str.replace("*", "x"));

	}

}
