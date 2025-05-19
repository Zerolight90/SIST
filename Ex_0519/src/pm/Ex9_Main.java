package pm;

public class Ex9_Main {

	public void test(Ex9_Parent p) {
		
		System.out.println(p.getValue());
	}


	public static void main(String[] args) {
		// 원하는 객체 생성
		Ex9_Child1 c1 = new Ex9_Child1();

		Ex9_Child2 c2 = new Ex9_Child2();

		//5번 행에 있는 test함수를 호춣하기 위해 Ex9_Main 객체 생성
		Ex9_Main m = new Ex9_Main();
		m.test(c1);
		m.test(c2);

	}


}
