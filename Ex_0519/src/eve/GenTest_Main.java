package eve;

public class GenTest_Main {

	public static void main(String[] args) {
		// GenTest생성 하자
		GenTest<String> g1 = new GenTest<>();
		g1.setValue("1000");
		
		System.out.println(g1.getValue());
		
		//숫자로 저장하는 GenTest를 만들고 싶다면, 위의 GenTest는 안된다.
		GenTest<Integer> g2 = new GenTest<>();
		g2.setValue(10000);
		
		System.out.println(g2.getValue()+1);
	}

}
