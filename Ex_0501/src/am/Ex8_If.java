package am;

import java.util.Scanner;

public class Ex8_If {

	public static void main(String[] args) {
		// 프로그램 시작
		
		Scanner scan = new Scanner(System.in);
		System.out.println("나이 입력");
		
		int age = scan.nextInt();
		
		//받은 age르 가지고 20보다 크고, 30보다 작은지 비교하자
		if(age>=20 && age < 30)  {
			System.out.println("20대 입니다.");
		} else {
			System.out.println("20대가 아닙니다.");
			
		}
		 

	}

}
