package pm;

import java.util.Scanner;

public class Ex7_Array {
	public static void main(String[] args) {
		//각 월에 마지막 날을 저장한 배열을 만드시오
		
		int[] month_array = {31,28,31,30,31,30,31,31,30,31,30,31}; //선언,생성,초기화를 한번에 진행함
		
		//키보드로 월을 입력 받아서 해당 월이 몇일까지 있는지? 출력해보자
		
		Scanner scan = new Scanner(System.in);
		String cmd = "n";
		
		do {
			//월 입력을 유도하자
			System.out.print("월을 입력해주세요.");
			int month = scan.nextInt();
			
			System.out.printf("%-3d월은 %d일까지 입니다.\n", month,month_array[month-1] );
			
			
			//숫자는 month에 들어 갔지만, 엔터값은 아직 Scannern에 남아 있다.
			scan.nextLine();//엔터값 처리
			System.out.println("계속 하시겠습니까?(y/n) :");
			cmd=scan.nextLine();
			
			
		}while(!cmd.equalsIgnoreCase("n"));//n이 아닐 때 반복수행 (!는 java에서 부정을 뜻한다.)
		System.out.println("프로그램 종료");
		
		
		
	}
}
