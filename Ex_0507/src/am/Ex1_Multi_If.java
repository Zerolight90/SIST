package am;

public class Ex1_Multi_If {

	public static void main(String[] args) {
		// 프로그램 시작
		// 1~10까지의 수들 중 난수(특정한 범위안에서 렘덤으로 발생하는 수) 발생
		// Math.random()*범위+시작수
		
		int ran = (int)(Math.random()*10+1);
		
		//ran의 값이 홀수 인지 짝수인지 판단하자
		
		if((ran%2)==0) {
		
			System.out.println(ran + " =짝수 입니다.");
		

		} else {
			System.out.println(ran + " =홀수 입니다.");
		}

	}
}
