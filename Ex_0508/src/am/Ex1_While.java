package am;

public class Ex1_While {

	public static void main(String[] args) {
		// while문
		// 1-10까지 반복하는 while문 작성
		
		int i = 0; //변수 초기화 변수 선언
		
		while (i<10) {
			
			System.out.println(i);
			++i;
		}
		//While문을 사용할때 주의할점
		//조건식을 언젠가는 불마족시킬 수 있도록 증감 또는
		//다른 식으로 구현해야 한다.
	}

}
