package pm;

public class Ex11_Array {

	public static void main(String[] args) {
		// 1차원 배열
		// 배열은 : 같으 자료형 여러 개를 하나로 묶은 것
		//정수 6개를 저장할 수 있는 배열 준비
		
		int[] ar = new int[6]; 
		for(int i=0; i<=5; i++) {
			ar[i] = (int)(Math.random()*45+1); //1~45 중 난수 발생
			
		}//for문의 끝
		System.out.println("---------배열 출력--------");
		
		for(int i = 0; i<=5; i++) {
			System.out.printf("%-3d",ar[i]);
		}

	}

}
