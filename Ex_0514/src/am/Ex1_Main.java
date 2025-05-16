package am;

public class Ex1_Main {

	public static void main(String[] args) {
		// 자동차를 객체로 만들들어보자
		Ex1_Car c1 = new Ex1_Car();
		
		System.out.println(c1.getModel());
		c1.setModel("CLS400d"); 
		System.out.println(c1.getModel());
		
		Ex1_Car c2 = new Ex1_Car();
				
		c2.setModel("GV80"); 
		System.out.println(c2.getModel());
	}

}
