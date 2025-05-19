package homework;

public class Vending { //자판기
	
	//현 자판기는 내부에는 음료가 4개 가져야 한다.
	Drink[] ar = new Drink[4];
	
	public void init() {
		//배열에 음료객체 4개를 생성하여 초기화 하는 동작(함수 == 메서드)
		Drink d1 = new Drink();
		d1.setName("레츠비");
		d1.setPrice(500);
		ar[0] = d1;
		
		Drink d2 = new Drink();
		d2.setName("사이다");
		d2.setPrice(700);
		ar[1] = d2;
	
		Drink d3 = new Drink();
		d3.setName("콜라");
		d3.setPrice(700);
		ar[2] = d3;

		Drink d4 = new Drink();
		d4.setName("웰치스");
		d4.setPrice(1000);
		ar[3] = d4;
		
	}
	
	public String insertCoin(int money) {
		//배열에 저장된 각 음료의 가격과 인자로 받은 money를
		//비교하여 money가 크거나 같다면, 해당 음료의 이름을
		//문자열로 조합하여 반환하는 기능
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i<ar.length; i++) { //ar이라는 배열을 처음부터 끝까지 모두 반복수행하기 위한 반복문
			
			if(money >=ar[i].getPrice()) {
				sb.append(i+1);
				sb.append(".");
				sb.append(ar[i].getName()); //음료 이름을 sb에 적재
				sb.append(" | ");
				
			} 
			
		}//for문의 끝
		
		//마지막에 존재하는 ","를 삭제한다
		int idx = sb.lastIndexOf("|"); // 마지막 "|"의 위치값을 찾아준다.
		String str = "";
		
		if(idx != -1) {
			str = sb.substring(0, idx); //스트링값 변경
			
			return str;
		}
			
			
		
		return toString();
	}
/*
	
	public String charge(int num, int coin) {
		// 사용자가 선택한 음료번호(num)와 사용자가 이전에 입력한 금액(coin)을 
		// 인자로 받아서 해당 음료객체를 배열에서 얻어내어 사용자가 입력한 금액(coin)에서
		// 선택한 음료가격을 빼면 거스름돈이 나온다.
		StringBuffer sb = new  StringBuffer("선택한 음료 : ");
		
		//사용자가 선택한 음료번호에서 -1한 후 그것을 배열의 index로 사용하자!
		Drink d = ar[num-1]; 
		int m = coin-d.getPrice(); //거스름돈 연산
		
		sb.append(d.getName()); //음료명
		sb.append(", 잔돈 : ");
		sb.append(m);
		sb.append("원 입니다.");
		
		return sb.toString();
	}
	*/
	
	public Drink getDrink(int i) {
		//사용자가 음료번호를 인자로 보내주면 음료번호 -1하여
		//ar이라는 배열에 접근하는 index로 사용한다.
		
		return ar[i-1];
	}

}
