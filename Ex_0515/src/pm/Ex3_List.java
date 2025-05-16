package pm;

import java.util.ArrayList;

public class Ex3_List {

	public static void main(String[] args) {
		// 배열과 같은 List 구조 생성

		ArrayList<Integer> al = new ArrayList<Integer>(3); // 초기에 3개 짜리를 만들어 준다 추가로 늘어난다

		// 현재 List구조의 사이즈를 얻어내자
		int size = al.size();
		System.out.printf("al.size():%d\n", size);// 0

		// 현재 List구조에 값을 추가해보자
		al.add(100);
		size = al.size();
		System.out.printf("al.size():%d\n", size);// 1

		for (int i = 1; i < 11; i++) {
			al.add(i);

			size = al.size();
		}
		System.out.printf("al.size():%d\n", size);// 11

		// List구조에 저장된 요소들을 하나씩 얻어내어 출력하는 반복문
		for (int i = 0; i < al.size(); i++) {
			// List구조에 저장된 요소들을 하나씩 얻어낼 떄는 반드시 저장된 요소의 자료형을 알아야 한다.
			int v1 = al.get(i); // get 하나씩 빼올때 쓴다
			System.out.printf("%-4d", v1);

		} // for의 끝
		System.out.println(); // 줄바꿈

		al.remove(1); // ArrayList에서 1번지, 즉 두번째 요소를 삭제한다.
		for (int i = 0; i < al.size(); i++) {
			// List구조에 저장된 요소들을 하나씩 얻어낼 떄는 반드시 저장된 요소의 자료형을 알아야 한다.
			int v1 = al.get(i); // get 하나씩 빼올때 쓴다
			System.out.printf("%-4d", v1);

		}
		System.out.println();
		System.out.println("삭제 후 al.size():" + al.size());

		// 원하는 위치에 추가하기 - insert
		al.add(3, 400);
		for (int i = 0; i < al.size(); i++) {
			// List구조에 저장된 요소들을 하나씩 얻어낼 떄는 반드시 저장된 요소의 자료형을 알아야 한다.
			int v1 = al.get(i); // get 하나씩 빼올때 쓴다
			System.out.printf("%-4d", v1);

		}
		System.out.println();
		/*
		boolean b1 = false;
		for (int i = 0; i < al.size(); i++) {

			int v1 = al.get(i); // get 하나씩 빼올때 쓴다

			if (v1 == 99) {
				b1 = true;
				break;
			}//if의 끝
		}//for의 끝
		
		if(b1) {
			System.out.println("99가 있습니다.");
		}else {
			System.out.println("99가 없습니다.");
		}
		*/
		
		//al.add(3, 99);
		
		//boolean chk = al.contains(99);//list에서 (n)이 있는 없는지 찾아 주는 기능
		//	System.out.println(chk);
		if(al.contains(99)) {
			System.out.println("99가 있습니다.");
		}else {
			System.out.println("99가 없습니다.");
		}
		
		if(al.contains(400)) {
			System.out.println("400이 있습니다.");
		}else {
			System.out.println("400이 없습니다.");
		}
		
		if(al.contains(400)) {
			int idx = al.indexOf(400);
			System.out.printf("400이 %d위치에 있습니다.\r\n",idx);
		}
		
		al.clear(); //모든 요소 삭제
		System.out.printf("clear후 사이즈:%d\n",al.size());
		System.out.printf("리스트가 비었을까?:%b",al.isEmpty());
		
		//리스트 구조에서 알아야할 메서드(함수)
		/*
		 1.-add : 맨뒤에 추가 할때 쓴다.
		 2 -add(n,x) : n위치에 x값 추가
		 3 -remove : 삭제
		 4 -get : 추출
		 5 -size : 저장된 요소수
		 6 -clear : 모두 삭제
		 7 -contains(n) :n값 포함 여부
		 8. -isEmpty : 비었는지 확인
		 */
	}

}
