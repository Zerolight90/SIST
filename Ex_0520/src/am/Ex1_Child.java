package am;

public class Ex1_Child extends Ex1_Parnet {

	public Ex1_Child() {
		super(10);
	
	}

	@Override // @는 언어테이션 기능성 주석이다.
	public void myData() {
		System.out.println("Child myData");
	}

	
	
}
