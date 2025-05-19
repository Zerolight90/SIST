package am;

//Ex7_Car로 부터 상속받은 자식 클래스
public class Ex7_Sedan extends Ex7_Car {
	
	private boolean sunroof;// true면 있는거고 false면 없는거

	public boolean isSunroof() {
		return sunroof;
	}

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}
	

}
