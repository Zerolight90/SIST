package am;

import java.util.Scanner;

public class Ex1_Main {

	public static void main(String[] args) {
		// 프로그램 시작
		
		// 키보드로 부터 문자열 받는다.
		System.out.println("입력: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		//Ex1_Color 라는 객체가 필요하다고 가정하자
		
		Ex1_Color c1 = new Ex1_Color();
		
		//생성된 객체가 가지는 Color라는 변수를 출력하자
		//System.out.println(c1.color); //null
		
		//c1이 가지고 있는 color의 값을 반환 하는 동작을 호출하자
		String s1 = c1.getColor();
		System.out.println(s1);
		//키보드로 받은 색상문자열을 setColor를 호출하면서 인자를 넣어준다.
		
		c1.setColor(str);//
		//System.out.println(c1.color);
		System.out.println(c1.getColor());
		

	}

}
