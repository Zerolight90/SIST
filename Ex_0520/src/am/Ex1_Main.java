package am;

public class Ex1_Main {

	public void test(Ex1_Parnet n) {
		n.myData(); //사용범위가 부모로 재설정되었지만, myData함수는 재정의가 되었으므로, 부모의 mydata가 숨겨지고 
					//Ex1_Child의 myData가 우선권 가져서 사용범위가 벗었났다고 해도 myData만큼은 Ex1_child의 함수로 호출된다
	}
	
	public static void main(String[] args) {
		// 원하는 객체 생성
		Ex1_Child c1 = new Ex1_Child();
		
		//test함수를 호출 하기 위해서 
		// test함수를 가지고 있는 클래스를 객체 생성
		Ex1_Main main = new Ex1_Main();
		main.test(c1);
		
	

	}

}
