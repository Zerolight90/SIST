package pm;

public class Ex6_Baseball {
	
	int[] com = new int [3]; //baseball 의 멤버 변수
	int[] user = new int [3]; //baseball 의 멤버 변수
	int strike_count = 0; // 이 변수가 3이될 때 프로그램 종료!
	int ball_count = 0;

	//컴퓨터가 가지는 정수 3개 셋팅하는 기능
	public void init() {
		for (int i = 0; i < com.length;) {
			com[i] = (int) (Math.random() * 9 + 1);
			boolean chk = true;
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					chk = false;
					break;
				}
			}//안쪽 for문 종료
			if (chk)
				++i;
		}//바깥쪽 for문 종료
		//System.out.printf("com: %d, %d, %d\r\n", com[0], com[1], com[2]);
	}//init종료
	
	//컴퓨터 가지는 값을 문자열로 반환하는 기능
	public String getCom() {
		StringBuffer sb = new StringBuffer(); //문자열 편집을 위한 준비
		//com배열에 있는 숫자 3개를 하나씩 얻어내어 sb에 추가한다
		for(int i=0; i<com.length; i++) {
			sb.append(com[i]);
			
			//마지막에는 ","를 넣지 않도록 하기 위한 비교문
			if(i<com.length-1) { //i가 2보다 작을 때만 
				sb.append(","); //콤마를 추가한다.
				}
			
		}
		return sb.toString();
	}
	
	//사용자가 입력한 문자열을 정수 3개를 변환하여 배열에 저장하는 기능
	public void setUser(String n) {
		
		for (int i = 0; i < user.length; i++) {
			char ch = n.charAt(i);
			user[i] = ch - 48; // '1'이 코드값으로 49이므로 48을 빼면 1이 user[i]번째에 저장
		}//for문의 끝
	}
	
	//스트라이크 카운트 기능
	public int countStrike() { //두 배열을 비교에서 칸운터값 반환
		strike_count = 0;
		for(int i=0; i<com.length; i++) {
			if(user[i] == com[i]) {
				strike_count++;
			}
		}
		return strike_count;
	}
	
	
	
	
	//볼 카운트 기능
	public int countBall() {//두 배열을 비교에서 칸운터값 반환
		ball_count = 0;
		for (int i = 0; i < com.length; i++) {
			if (user[i] == com[(i + 1) % com.length])
				ball_count++;
			else if (user[i] == com[(i + 2) % com.length])
				ball_count++;
		}
		return ball_count;
	}

}//클레스 종료
