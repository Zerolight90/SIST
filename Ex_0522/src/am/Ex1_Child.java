package am;

public class Ex1_Child extends Ex1_Abs {

	String msg = "쌍용교육센터";
	
	@Override
	public void test() {
		// 부모 클래스인 추상 클래스가 가지는 추상메서드를 반드시 재정의 해야한다.
		int v = getV100();
		System.out.printf("부모의 값 :%d\r\n",v);
		

	}
	
	public  String gettmsg() {
		return msg;
	}
	
	

}
