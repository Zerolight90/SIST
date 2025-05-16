package pm;

public class Ex5_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar1 = {10,20,30,40};
		
		int[ ] ar2= new int[3];
		int[ ] ar3= new int[5];
		
		
		int [][] ar = new int[3][];
		
		ar[0]=ar1;
		ar[1]=ar2;
		ar[2]=ar3;
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.printf("%-3d",ar[i][j]); 
			}
			
			System.out.println();
		}
		
				
				
		
	}

}
