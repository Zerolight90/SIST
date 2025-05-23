package pm;

public class Ex6_Array {

	public static void main(String[] args) {
		// 문자열형 4개를 저장할수 있는  배열 생성
		
		String[] str = new String [4]; 
		
		//초기화
		str[0]="값1";  //암시적 객체 생성
		str[1]=new String("값1"); // 명시적 객체 생성
		str[2]=new String("값3"); // 명시적 객체 생성
		str[3]="값4"; //암시적 객체 생성

		String[] str2= {"val1","val2","val3","val4"};
		
		//str과 str2라는 1차원 배열을 한곳에 모아두는 2차원 배열을 만들자
		
		String[][] str3 = new String[2][4];
		
		//준비된 2차원 배열 각 요소에 str과 str2를 저장하자
		
		str3[0] = str;
		str3[1] = str2;
		
		//이제 다시 2차원 배열을 생성하자 이때, 초기 값들을 다음과 같이 하자
		// 선언 생성 초기화를 한번에 하자
		
		/*
		 v1 v2 v3 v4
		 n1 n2 n3 n4
		 */
		
		String[][] ar2 = {
				{"v1","v2","v3","v4"},
				{"n1","n2","n3","n4"}
				
		};
		
		String[][][] ar3 = new String[2][2][4];
		ar3[0]=str3; //3차원 배열의 첫번쨰 요소에 2차원애열 str3 을 저장
		ar3[1]=ar2; //3차원 배열의 두번쨰 요소에 2차원애열 ar2를 저장
		
		for(int i =0; i<ar3.length; i++) {//3차원배열에 저장된 2차원 배열을 반복할 for문
			System.out.println("2차원배열 "+ (i+1));	
			for(int j =0; j<ar3[i].length; j++) {//2차원배열에 저장된 1차원 배열을 반복할 for문
				System.out.print("\r\n\t");// 줄바꿈 후 템을 누를 것	
				for(int k =0; k< ar3[i][j].length; k++) {//1차원 배열을 반복하는 for문
					
					System.out.printf("=> %-5s",ar3[i][j][k]);
				}
				System.out.println(); //줄바꿈	
			}
			System.out.println(); // 줄바꿈
		}
		
		
	}

}
