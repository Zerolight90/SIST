package am;

public class Ex4_Array {

	public static void main(String[] args) {
		/*
		 	0 0 0 0                      1 0 0 0
		 	0 0 0 0  => 반복문 처리해서  0 1 0 0
		 	0 0 0 0      				 0 0 1 0
		 	0 0 0 0						 0 0 0 1
		 */
	
		int[][] ar =new int [4][4];
		
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				if(i==j) {
					ar[i][j] =1;
				}
				System.out.printf("%-2d",ar[i][j]);
			}
			
			System.out.println();
		}
			
		
	
	}
	
	 
	

}
