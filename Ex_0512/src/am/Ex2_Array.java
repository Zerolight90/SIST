package am;

public class Ex2_Array {

	public static void main(String[] args) {
		// 2차원 배열을 생성하자
		
		int[][] ar = new int[2][3];
		
		for(int i = 0; i<ar.length; i++) {
			//2차원배열의 길이를 반복 수행;
			for(int j=0; j<ar[i].length; j++) {
				//각 1차원배열을 반복하는 반복문
				System.out.printf("%-2d",ar[i][j]);
			}
			System.out.println();//1차원 배열 끝날때 마다 줄바꿈
		}

	}

}
