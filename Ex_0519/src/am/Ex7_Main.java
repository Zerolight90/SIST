package am;

public class Ex7_Main {

	public static void main(String[] args) {
		// 원하는 세단 클래스를 생성하자
		Ex7_Sedan gr1 = new Ex7_Sedan(); //메모리상 힙영역에 odject 만들고 Car만들고 sedan이 만들어 진다
		gr1.setModel("그렌져300");
		gr1.setMin_price(2700);
		gr1.setSunroof(true);
		
		Ex7_Sedan g80 = new Ex7_Sedan();
		g80.setModel("G80");
		g80.setMin_price(6000);
		g80.setSunroof(false);
		
		if(gr1.equals(g80))
			System.out.println("서로내용이 같다");
			else
				System.out.println("서로내용이 다르다");

	}

}

