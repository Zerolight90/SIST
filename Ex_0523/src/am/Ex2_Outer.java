package am;

public class Ex2_Outer {
	
	private String msg = "쌍용교육센터";
	
	class Inner{ //내부 클래스 : 장점은 바깥쪽 클래스의 맴버를 자신것처럼 쓸수 있다.
		int value = 100;
		
		public void print() {
			System.out.println(msg+value);
			
			
		}
	}
}
