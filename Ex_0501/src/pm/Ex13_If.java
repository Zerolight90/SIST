package pm;

import java.util.Scanner;

public class Ex13_If {

	public static void main(String[] args) {
		// 키보드로부터 점수를 하나 받아 score에 저장한다.(0-100)
		// 그 점수가 80~100점이면 "우수"
		// 60-79점이면 "보통"
		// 40~59점이면 "좀 걱정"
		// 그 이하는 "나오지마"
		
		System.out.println("점수를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("점수를 올바르게 입력하세요");
			return;
			
		}else if(score >= 80) {
			
			System.out.println("우수");
			
		}else if(score >= 60) {
			
			System.out.println("보통");
			
		}else if(score >= 40) {
			
			System.out.println("좀걱정");
			
		}else{
			
			System.out.println("나오지마");
			
		}
		
		
	

	}

}
