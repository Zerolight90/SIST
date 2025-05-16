package pm;

public class Ex12_Test {

	public static void main(String[] args) {
		// [문제1] 다음의 결과와 같은 모양을 출력하는 반복문을 구현하시오
		// [결과]
		/*
		    
		  * * * *
		  * * *
		  * *
		  * 
		  
		*/
		// 0 4 3 2 1
		
		/*
		 
	  	i1  k1 k2 k3 k4
		i2  k1 k2 k3 k4
		i3  k1 k2 k3 k4
		i4  k1 k2 k3 k4
		 */
		
		
		
		for(int i=0; i<4; i++) { // 1 2 3 4
			for(int k=1; k<=4; k++) { // 1 2 3 4
				if(k>i) {// 
					System.out.printf("%2c",'*');	
				} 
				
			
				
			}
			System.out.println(); //줄바꿈
		}
		
		
		System.out.println("----------------");
		
		// [문제2] 다음의 결과와 같은 모양을 출력하는 반복문을 구현하시오
		// [결과]
				/*
				    
				  * * * *
				    * * *
				      * *
				        *
				  
				*/
		for(int i=1; i<=4; i++) {
			for(int k=1; k<=4; k++) {
				if(k<i) {
					System.out.printf("%2c",' ');
				}else
				System.out.printf("%2c",'*');
			}
			System.out.println();
		}
		
		System.out.println("----------------");	
		
		// [문제3] 구구단을 다음과 같이 출력하는 반복문을 구현하시오
		// [결과]
				/*
				    
				2*1=2  3*1=3  ...  9*1=9
				2*2=4  3*1=3  ...  9*2=18
				...    ...    ...  ...
				2*9=18 3*9=27 ...  9*9=81
				  
				*/
		
		for(int i =1; i<=9; i++) {
			for(int k=2; k<=9; k++) {
				System.out.printf(k+ "*" +i+ "=" +"%-3d", k*i);
			}
			System.out.println();
		}
		
	}

}
