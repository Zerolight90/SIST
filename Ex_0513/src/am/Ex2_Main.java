package am;

import java.util.Scanner;

public class Ex2_Main {

	public static void main(String[] args) {
		// 프로그램 시작
		/*
		
		System.out.println("펫의 이름을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("펫의 나이를 입력하세요 : ");
		int age = scan.nextInt();
		*/

		//Ex2_Pet 객체 생성
		
		
		Ex2_Pet p1 = new Ex2_Pet();
		
		String p1_name = p1.getName();
		int p1_age = p1.getAge();
		//System.out.printf("Name:%s, Age:%d", p1_name, p1_age);
		
		p1.setName("포동이");
		p1.setAge(2);
		p1_name=p1.getName();
		p1_age=p1.getAge();
		System.out.printf("p1:Name:%s, Age:%d", p1_name, p1_age);
		
		System.out.println();
		
		
		Ex2_Pet p2 = new Ex2_Pet();
		
		p2.setName("바둑이");
		p2.setAge(5);
		
		
		String name = p2.getName();
		int age = p2.getAge();
		System.out.printf("p2:Name:%s, Age:%d", name, age);
		
		
		

		

	}

}
