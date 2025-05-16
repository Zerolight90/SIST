package am;

public class Ex2 {

	
	public static void main(String[] args) {
		//프로그램 시작
		
		// 변수 선언
		// 변수는 자료형을 알아야 한다.
		// 자바에서는 자료형을 크게 2가지로 나눠진다. 
		// 1) 기본자료형, 2) 객체(참조)자료형
		// 기본자료형에는  boolean(true , false)
		
	  boolean b1 = true; //변수언언
	  
	  System.out.println(b1); //문장의 끝은 세미콜론(;)으로 마무리 해야 한다.
	  
	  
	  //char 하나의 문자를 기억하는 자료형 문자는 홑따음표로 구분합니다.
	  char b2 = 'A';
	  System.out.println(b2);
		
	  b2 = 'B'; //변수 사용(값 변경)
	  System.out.println(b2); 
	  
	  //정수형 변수 선언 : byte(-128~127), short(약30000), int(21억), long(겁내 큼)
	  
	  byte b3 = 127;
	  short b4 = 32767;
	  int b5 = 2100000000;
	  long b6 = 100000000000L; // long형의 값을 의미할때는 값 뒤에 l 또는 L을 기술한다.
	  
	  
	  
	  System.out.println(b4+b5);
	  System.out.println(b3+b6);
	  
	}
	
}
