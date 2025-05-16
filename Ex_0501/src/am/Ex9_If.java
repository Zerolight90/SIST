package am;

import java.util.Scanner;

public class Ex9_If {

	public static void main(String[] args) {
		// 키보드로 부터 점수(0~100)를 받아서
		// 60점 이상이면 "합격"을 출력하고 그렇지 않으면
		// "다시 도전"을 출력 하세요
		
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 점수는 : ");
		
		int a = scan.nextInt();
		
		if (a <= 100) {
			
			if(a >= 60) {
				
				System.out.println("합격 입니다.");
				
			} else {
				
				System.out.println("다시 도전하세요.");
			}
						
		} else {
			
			System.out.println("점수를 올바르게 입력하세요");
		} 
		
	}
}


