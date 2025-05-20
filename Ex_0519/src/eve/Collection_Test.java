package eve;

import java.util.ArrayList;

public class Collection_Test {

	public static void main(String[] args) {
		// List구조 배열과 같지만 크기가 유동적인다.
		ArrayList<String> list = new ArrayList<>();
		
		System.out.printf("list.size():%d\n", list.size()); //list.size() 리스트의 사이즈(길이)를 보여준다
		
		String s ="ABC";
		
		list.add(s);
		list.add("123");
		list.add(s);//중복허용
		
		System.out.printf("list.size():%d\n", list.size()); //list.size() 리스트의 사이즈(길이)를 보여준다
		
//		원하는 객체주소를 넣어서 삭제한다
		list.remove(s); //가장 먼저 만나는 0번지만 삭제 된다.
		System.out.printf("list.size():%d\n", list.size()); //list.size() 리스트의 사이즈(길이)를 보여준다
		
		for(int i =0; i<list.size(); i++) {
			
			//리스트 구조에서 하나씩 요소를 얻어낸다.
			String n =list.get(i);
			System.out.println(n);
		}//for문의 끝
	}

}
