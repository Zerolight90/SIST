package pm;

public class Ex9_Child2 extends Ex9_Parent {
	
	private String msg = "Child2";
	private int value = 10;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getValue() {//부무와 자식 둘다 같은 함수(모든 함수)가 있으면 부모의 것은 사라진다..? 함수의 우선권은 자식이 같는다.
		return value; //부모의 value가 아닌 자신의(Child1)를 반환 하는 value
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
