package am;

public class Ex2_While {

	public static void main(String[] args) {
		// 1~45까지의 수들중 난수를 발생시켜 출력하는 프로그램을 만든다.
		// 난수의 수는 총 6개를 출력해야 하며, 반드시 while문을 사용해 한다.
		
		int i = 0;
		
		while(i<6) {
			
			int n=(int)(Math.random()*45+1);
			System.out.printf("%-3d",n);
			i++;	
			
		}
		
		/*
		 while문을 이용하여 다음과 같이 출력하자
		 [결과]
		 * * * *
		 * * * *
		 * * * *
		 * * * * 
		 */
		System.out.println("\r\n==============================");
		
		int k = 1;
		
	
		while(k<=3) {
			int n =1;
			while(n<=4) {
				System.out.printf("%2s",'*');
				n++;
				
			}
			System.out.println();
			k++;
		}
		 
	}

}


