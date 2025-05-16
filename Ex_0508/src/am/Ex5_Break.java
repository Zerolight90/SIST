package am;

import java.util.Scanner;

public class Ex5_Break {

	public static void main(String[] args) {
		// 문자열을 기억하는 변수 str을 선언하자
		
		
		
		String str ="";
		
		// 키보드와 연결된 스케너 준비
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열 입력:");
		
		//키보드로 부터 문자열을 받아서 str에 서장하자.
		str = scan.nextLine();
		
		System.out.println("str:"+str);
		
		
		//사용자가 키보드로 입력한 모든 값을이 하나의 문자열로 만들어져서
		//변수 str에 저장된 상태이다.
		// 이때 str에 있는 문자열을 한자씩 얻어내어, 출력하는 반복문을 만들어보자
		
		bk1:for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i); // 문자 추출
			
			System.out.printf("%-2c",ch); //출력해서 확인
			//만약에 문자가 '0'과 같은 것을 만나면 반복문을 찰출하자!
			//if(ch == '0') {
			//	break;
			//}
			
			switch(ch) {
			case '0' :
				System.out.println("0이네");
				//break; //반복문을 탈출하지 못하고 switch문만 탈출함
				break bk1; //switch문이 아니라 bk1 이라는 for문(반복문)을 빠져나온다.
			case 'a' :
				System.out.println("a입니다.");
				break;
			}
			
		}
		

	}

}
