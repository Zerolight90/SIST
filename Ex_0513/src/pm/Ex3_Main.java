package pm;

import java.util.Scanner;

public class Ex3_Main {

	public static void main(String[] args) {
		// 원하는 구구단을 출력하는 기능가진 객체를 생성하자
		Ex3_Gugudan gu = new Ex3_Gugudan(); // class 생성
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		int dan = scan.nextInt(); //키보드로 부터정수를 하나씩 받는다
		
		gu.setDan(dan); //키보드로부터 받은 값을 구구단객체에 저장
		
		//해당단을 출력하는 기능을 호출
		gu.print();
		
		
		

	}

}
