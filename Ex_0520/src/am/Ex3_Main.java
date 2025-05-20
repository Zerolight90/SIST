package am;

public class Ex3_Main {

	public void test(Ex3_Inter n) {
		n.print();
		n.testValue();
//		n.getValue(); //오류 Ex3_Inter 에는 getValue()가 없어서 오류가 난다.
	}				 //사용범위가 현재 메서드로 들어 오면서 inter로 변경됨
	
	public static void main(String[] args) {
		// 프로그램 시작
		Ex3_Class t1 = new Ex3_Class(); //Ex3_Class객체를 생성하였다.
		Ex3_Impl t2 = new Ex3_Impl(); //Ex3_Impl객체를 생성하였다.
		
		//현재클래스가 가지고 있는 test함수를 호출
		Ex3_Main main = new Ex3_Main(); //Ex3_Main객체를 생성하였다.
		main.test(t1);
		main.test(t2);
	}

}
