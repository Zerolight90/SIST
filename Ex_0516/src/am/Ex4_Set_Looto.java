package am;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex4_Set_Looto {

	public static void main(String[] args) {
		// set구조로 로또를 만들어라
		
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
		
		
		while(true) {
			
			Integer num = (int)(Math.random()*45+1); //난수 발생
			lotto.add(num); //set구조에 추가
			
			if(lotto.size()==6) {
				break; //무한반복 탈출
			}
		}
		
		//반복자 처리
		Iterator<Integer> it = lotto.iterator();
		
		while (it.hasNext()) { //커서 다음칸에 요소가 있는지 확인 만약 없다면, 다음 칸으로 이동하여 it(lotto)값(요소) 가져 오기
			
			int n = it.next();
			System.out.printf("%-3d",n);
			
		
		
		}

	}

}
