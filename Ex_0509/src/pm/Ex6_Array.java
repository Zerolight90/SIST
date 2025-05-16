package pm;

import java.util.Arrays;
import java.util.Collections;

public class Ex6_Array {

	public static void main(String[] args) {
		// 프로그램 시작
		
		//정수 5개를 저장하는 배열을 만들자
		
		int[] arr = new int[5];
		
		//외부로부터 배열의 값을 받았다고 가정하자!
		
		arr[0] = 27;
		arr[1] =  7;
		arr[2] = 35;
		arr[3] = 12;
		arr[4] =  9;
		
		//정렬을 시키지 위해 java.util.Arrays객체가 필요함
		
		Arrays.sort(arr); //올름 차순 정렬=>1만건 이하면 sort가 나쁘지 않다
						  // 1만건 이상이면 다른 오버로딩(Arrays.parallelSort)를 쓰길 추천한다.
		
		for(int i =0; i<arr.length; i++) {
			System.out.printf("%-3d",arr[i]);
		}
		
		System.out.println("\r\n=============================");
		
		//내림 차순을 정렬시키기 위해서는  java.util.Collections가 필요하다
		//Collections는 기본자료형 배열로 하지 말고 객체자료형 배열로 해야 한다. int [] => Integer []로 바꿔야 한다
		
		
		Integer[] ar = new Integer[5];
		ar[0] = 27;
		ar[1] =  7;
		ar[2] = 35;
		ar[3] = 12;
		ar[4] =  9;
		Arrays.parallelSort(ar, Collections.reverseOrder());
		for(int i =0; i<ar.length; i++) {
			System.out.printf("%-3d",ar[i]);
		}
		
		//실수형 5개를 저장하는 배열
		double[] arr1 = new double[5]; //기본 자료형 배열
		Double[] arr2 = new Double[5]; //객체 자료형 배열
		

		char c = 'A';
		Character c2 = 'A';
		
		boolean b = true;
		Boolean b2 = true;
		
		
		
	}

}
