package am;

import java.util.Iterator;

public class Ex9_Multi_For {

	public static void main(String[] args) {
		// 화면에 1~5까지 출력하는 반복문
		/*
		 [결과]
		 1 2 3 4 5
		 1 2 3 4 5
		 1 2 3 4 5
		 */
		for(int i =1; i<=5; i++) {
			//System.out.print(i+ " ");
			System.out.printf("%-2d",i); //f => 포멧(형식) 
			
		}
		System.out.println();
		
		for(int i =1; i<=5; i++) {
			//System.out.print(i+ " ");
			System.out.printf("%-2d",i); //f => 포멧(형식) 
			
		}
		System.out.println();
		
		for(int i =1; i<=5; i++) {
			//System.out.print(i+ " ");
			System.out.printf("%-2d",i); //f => 포멧(형식) 
			
		}
		System.out.println();
		
		for(int i =1; i<=5; i++) {
			//System.out.print(i+ " ");
			System.out.printf("%-2d",i); //f => 포멧(형식) 
			
		}
		System.out.println();
		
		for(int i =1; i<=5; i++) {
			//System.out.print(i+ " ");
			System.out.printf("%-2d",i); //f => 포멧(형식) 
			
		}
		System.out.println();
		
		System.out.println("---------------다중 for문-------------------");
		
		//다중 for문
		
		for(int k =1; k<=5; k++) {
		
			for(int i =1; i<=5; i++) {
				//System.out.print(i+ " ");
				System.out.printf("%-2d",i); //f => 포멧(형식) 
				
			}
			System.out.println();
		}
		
		
		System.out.println("----------------");
		
		for(int k = 1; k<=4; k++) {
			
			for(int i =1; i<=4; i++) {
				System.out.printf("%-2s",'*');
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		
	
	
	}

}
