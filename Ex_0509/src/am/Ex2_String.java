package am;

import java.util.Scanner;

public class Ex2_String {

	public static void main(String[] args) {
		// 키보드로 문자열을 입력 받는다.
		// 그것이 숫자인지? 아닌지? 판단하는 프로그램을 완성하시오
		
		System.out.println("문자를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		//str에서 한 문자씩 얻어내어  그것이 0~9까지의 수들 중 하나인지? 아닌지? 판단(boolean)하면 된다.
		boolean res = true; //res가 true이면 숫자로 판단. 그렇지 않으면 문자열로 인식
		
		for(int i =0; i<str.length(); i++) {
			//str로 부터 문자 하나를 가져 온다
			char ch = str.charAt(i);
			//i가 0이면 첫번째 문자가 오고, i가 1이면 2번째 문자가 온다.
			//얻어낸 문자(ch)가 0~9범위에 포함 되는지? 비교하자
			
			if(ch<'0' || ch>'9') {
				res = false;
				break; //반복문 탈출
			} //if문의 끝
			
		}//for문의 끝
		if(res) {
			System.out.println("숫자 입니다.");
		}else {
			System.out.println("문자 입니다.");
			
		}
		}
		
	}


