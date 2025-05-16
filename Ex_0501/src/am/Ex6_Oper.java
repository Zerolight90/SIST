package am;

public class Ex6_Oper {

	public static void main(String[] args) {
		// 프로그램 시작
		
		// 대입연산자 : =, +=, -=, *=, /=, %=
		// 우선 순위가가장 낮다
		
		int a = 7;
		int b = 5;
		 
		int c = 0;
		c+=a;
		
		System.out.println(c); //c= c+a; c=7
		
		c+=b; // c=c+b
		System.out.println(c);
		
		c*=b; // c=c*b 12*5
		System.out.println(c);
		
		

	}

}
