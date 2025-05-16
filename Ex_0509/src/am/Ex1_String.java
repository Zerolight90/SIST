package am;

import java.util.Scanner;

public class Ex1_String {

	public static void main(String[] args) {
		// 물류센터에서 각 제품의 제품번호를 읽어온다.
		// 이 상황을 키보드로 입력을 받는것으로 가정하자.
		
		System.out.println("코드 :");
		Scanner scan = new Scanner(System.in);
		
		//제품번호 형식 : 제조날짜-카테고리-유형코드
		// ex)250509-L-120
		
		String num = scan.nextLine();
		
		// 입력된 제품번호의 8번째 자리의 문자를 얻어내어 그것이 'L'이면 "생활용품", 'E'면 "가전제품", 'S'면 "스포츠용품"
		
		int size = num.length();
		
		if(size < 8) {
			System.out.println("잘못된 코드 입니다.");
			return;
		} else {
		
			char ch = num.charAt(7);
			
			switch(ch) {
			case 'L' : 
				System.out.println("생활용품");
				break;
	
			case 'E' : 
				System.out.println("가전제품");
				break;
			
			case 'S' : 
				System.out.println("스포츠용품");
				break;
				
			case 'G' : 
				System.out.println("게임용품");
				break;
			}//switch문의 끝
		}			
				
		

	}

}
