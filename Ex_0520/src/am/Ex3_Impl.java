package am;

public class Ex3_Impl implements Ex3_Inter {

	@Override
	public void print() {
		System.out.println("Ex3_Impa의 프린트");
	}

	@Override
	public void testValue() {
		System.out.println("Ex3_Impa의 testValue");

	}
	
	//Ex3_Impl의 독단적인 기능들
	public void getValue() {
		System.out.println("Ex3_Impa의 getValue");
	}

}
