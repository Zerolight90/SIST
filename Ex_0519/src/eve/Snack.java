package eve;

public class Snack {
	
	private String comp; //제조사
	private String title; //제목
	private int price; //가격
	
	//객체가 생성될때 단 한번 호출되어 원하는 맴버변수에 초기화를 목적으로 하는것이 생성자이다.
	public Snack(String comp, String title, int price) {
		//인자로 넘어온 comp와 title과 price는 지역변수이다.
		//즉, 현재 생성자의 영역이 끝나면, 소멸된다.
		this.comp = comp;
		this.title = title;
		this.price = price;
		
	}
	public Snack(int price, String comp, String title ) {//기본생성자
		
	}
	
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
