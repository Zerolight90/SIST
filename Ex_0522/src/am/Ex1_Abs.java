package am;

public abstract class Ex1_Abs {
	// 추상클래스는 클래스가 abstract로 선언된 클래스를 말한다.
	// 내부에 추상메서드를 하나라도 가지면, 해당 클래스는 abstract로 선언되어야 한다.

	String msg;//변수
	final int v100 = 100;//상수

	public int getV100() {//일반 메서드
		return v100;
	}
	
	public void print() {
		//Empty Methood
		
	}

	public abstract void test() ; //추상 메서드 - 미완성적 개념


}
