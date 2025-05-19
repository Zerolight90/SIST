package am;

public class Ex1_Main {

	public static void main(String[] args) {
		// Ex1_Value 클래스를 새로 생성성하자
		
		Ex1_Value value = new Ex1_Value();
		
		//인자로 전달할 값
		int num = 100;
		
		//num값을 넣어서 value의 test함수 호출
		
		value.test(num);
		System.out.println(num);
		
		

	}

}
