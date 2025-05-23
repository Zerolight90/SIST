package pm;

public class Ex5_Main {

	public static void main(String[] args) {
		// 프래그램 시작
		Thread t1 = new Thread(); //run 함수가 비어 있기 때문에 하는 일이 없는 스레드다
		t1.start(); // ===> run() 수행
		
		Ex5_Thread t2 = new Ex5_Thread();
		t2.start(); //=> 해당 객채의 run() 수행

		System.out.println("메인 쓰레드");
	}

}
