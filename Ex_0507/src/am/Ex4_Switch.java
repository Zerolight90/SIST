package am;

public class Ex4_Switch {

	public static void main(String[] args) {
		// 프로그램 시작
		// 문제)1~20까지의 수들 중 난수를 받아 su라는 변수에 저장한다.
		// su의 값이 짝수인지? 홀수 인지?를 판단하는 프로그램을 switch문으로 구현 하시오
		
		int su = (int)(Math.random()*20+1);
		
		//짝수는 su를 2로 나웠을 때 나머지가 0인 값들
		
		
		switch(su%2) {
		case 0 :
			System.out.println(su + " =짝수 입니다.");
			break;
			
		case 1 :
			System.out.println(su + " =홀수 입니다.");
			break;
			
		}

	}

}
