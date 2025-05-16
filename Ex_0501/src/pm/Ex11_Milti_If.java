package pm;

import java.util.Scanner;

public class Ex11_Milti_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("값 : ");
		Scanner scan = new Scanner(System.in);
		
		int value = scan.nextInt();
		
		// 변수 value의 값이 1, 아니면 2, 아니면 3이 들어간다고 가정하자!
		// 1일때는, "초보" 2일때는 "중급" 3일때는 "고급" 그 외에는 잘못 입력하셨습니다. 출력
		// 이를 해결하기 위해서는 다중if문을 구현해야 한다.
		// [구성]
		/*
		 if(조건식1)
		  	조건식1을 만족하는 수행문
		  		else if(조건식2)
		  			조건식1에는 맞지 않지만, 조건식2를 만족하는 수행문
		  				else if(조건식3)
		  					조건식1과 2를 맞지 않지만, 조건식3을 만족하는 수행문
		  						else 그 나머지 모든것
		*/
		
		/*
		if(1 == value) {
			
			System.out.println("초급");
			
		}else if(2 == value) {
			
			System.out.println("중급");
			
		}else if(3 == value) {
			
			System.out.println("고급");
			
		}else {
			
			System.out.println("잘못 입력하셨습니다.");
			
		}
		*/
		
		String str = "";
		if(value == 1) {
			
			str = "초급";
					
		}  else if(value ==2) {
			
			str = "중급";
			
		} else if(value == 3) {
			
			str = "고급";
			
		} else {
			
			str = "잘못 입력하셨습니다.";
			
		}
		System.out.println(str);
			
			
		
		

	}

}
