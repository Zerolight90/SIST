package am;

import java.util.Scanner;

public class Ex1_Exception {

	public static void main(String[] args) {
		//프로그램 시작
		
		int v1 =100;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력:");
		int v2 = scan.nextInt();
		
		try {			
			int res = v1/v2;
			if(v2==1)
				return;
			
			System.out.printf("%d/%d=%d",v1,v2,res);
		}catch(ArithmeticException e) {
			v2 = 1;
			int res = v1/v2;
			System.out.printf("%d/%d=%d\r\n",v1,v2,res);
		}catch(Exception e) {
			//혹시나 다른 예외가 발생할 것을 우려한 영역
			System.out.println("혹시 나??");
			
		} finally {
			//예외 생각 없이 무조건 수행
			System.out.println("\r\n혹시 저요?? 왜요??");
		}
		System.out.println("싫어요");
		

	}

}
