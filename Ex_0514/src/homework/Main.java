package homework;


import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// 프로그램 시작
		
		
		//자판기(Vendig) 객체 생성
		Vending vd = new Vending(); //변수 선언
		vd.init(); //각 음료들이 배열에 생성되어 저장된다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("insertCoin : ");
		int coin = scan.nextInt();
		
		String msg = vd.insertCoin(coin);
		System.out.println(msg);
		
		System.out.println("선택 : ");
		int num = scan.nextInt(); //음료 번호 선택
		//msg = vd.charge(num, coin);
		//System.out.println(msg);
		
		Drink d = vd.getDrink(num);
		System.out.printf("선택한 음료는 : %s, 잔돈 : %d원 입니다." ,d.getName(), coin-d.getPrice());
			
		
	}

	
}
