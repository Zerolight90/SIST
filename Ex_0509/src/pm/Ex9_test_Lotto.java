package pm;

import java.util.Arrays;

public class Ex9_test_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수 6개를 담는 배열 생성
		int[] num = new int[6];
		
		//난수를 발생시켜 배열채우기
		
		for(int i = 0; i<num.length;) {
					
					num [i] = (int)(Math.random()*45+1);// I 난수 발생
					boolean chk = true; 
										
				for(int k = 0; k<i; k++) {	
					
					if(num[i]==num[k]) {
						chk = false;	
						break; //반복문 탈출
					} // chk가 false일 경우 if문(중복된 값이 존재)
					
				}// 안쪽for문	
				if(chk) {
					++i;
					
				} //chk가 true 일 경우 if문(중복된 값이 없을 경우)
		}// 바깥쪽 for문
		Arrays.sort(num); //정수 높은수 정렬
		for(int i=0; i<6; i++)
			System.out.printf("%-3d",num[i]);
	}
}


