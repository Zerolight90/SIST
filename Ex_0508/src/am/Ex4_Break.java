package am;

public class Ex4_Break {

	public static void main(String[] args) {
		// 문자열을 기억하는 str이라는 변수 선언
		
		String str = "100239384";
		
		//str이 기억하는 문자열의 길이 만큼 반복문을 수행하자
		
		int i = 0;
		while(i<str.length()) {
			//str에서 문자 하나를 얻어낸다.
			char ch = str.charAt(i); 
			
			//얻어낸 값이 '5'이상이면 탈출하자
			if(ch>='5')
				break;
			i++;
			System.out.printf("%-2c",ch);
		}

	}

}
