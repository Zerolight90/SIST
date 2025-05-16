package am;

public class Ex3_Switch {

	public static void main(String[] args) {
		// 프로그램 시작
		// 1~12까지의 난수를 발생하여 월의 값으로 가정하여 해당 월의 최대 날짜 수를 출력하자!
		
		int month = (int)(Math.random()*12+1);
		
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일 까지 입니다.");
			break;
			
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("30일 까지 입니다.");
			break;
			
		case 2 :
			System.out.println("29일 까지 입니다.");
			break;
		}
		
	}

}
