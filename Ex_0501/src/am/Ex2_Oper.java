package am;

public class Ex2_Oper {

	public static void main(String[] args) {
		// 프로그램 시작
		// 증감연산자 : ++ , --
		
		
		// 정수 8을 기억하는 변수 a를 만들자
		int a = 8;
		
		int b = ++a + 3;
		
		System.out.println("a="+a);
		System.out.println("b="+b);

		b = a++ + 3; // 증감연산자는 변수 앞에 있으면 최우선 순위지만 변수 뒤에 있으면 젤 마지막에 한다.
		System.out.println("a="+a);
		System.out.println("b="+b);
	
		System.out.println(a++); //10
		// 개행이 될 때 a의 값을 1증가 시켜서 11이 된다. 
		// 그래서 출력될 당시에는 10이 출력이 되는것이 맞다

		System.out.println(a); //11
	}

}
