package am;

import java.util.Scanner;

public class Ex3_Main {

	public static void main(String[] args) {
		// 도서관 객체 생성
		Ex3_Library lib = new Ex3_Library();
		lib.setAr();//배열에 책 5권이 생성
		
		
		//검색대 생성
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 도서명");
		String str = scan.nextLine(); // 사용자가 입력한 책이름
		System.out.println("=============");
		
		
		//검색된 결과 표출
		
		String msg = lib.search(str);
		if(msg.trim().length() < 1)
			System.out.println("검색된 정보가 없습니다.");
		else
			System.out.println(msg);
		
	}

}
