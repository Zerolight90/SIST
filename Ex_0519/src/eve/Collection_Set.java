package eve;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection_Set {

	public static void main(String[] args) {
		//set구조는 순서가 없다. 중복불가
		
		HashSet<String> set = new HashSet<String>();
		String s = "ABC";
		
		System.out.printf("set.size():%d\n",set.size());
		set.add(s);
		set.add("123");
		set.add(s); //종북 불가!
		String s2 = new String("ABC");
		set.add(s2); // 주소는 다르지만, 내용이 같은것이 이미 저장되어 있어서 저장이 안된다.
		System.out.printf("set.size():%d\n",set.size());
		
		System.out.println("===============로또 생성기===================");
		
		TreeSet<Integer> num = new TreeSet<Integer>();
		//난수를 발생시켜 num에 저장 한다. 그리고 num의 사이즈가 6이 무한반복문을 종료 한다.
		
		while(true) {
			int su = (int)(Math.random()*45+1); //1~45까지의 난수 발생
			
			num.add(su);
			
			if(num.size() ==6) {
				break; 
			} 
	
			
		}//무한반복
		//set구조와 map구조는 순서(index)가 없어서 반복자(Iterator)를 구해야 한다.
		Iterator<Integer> it = num.iterator(); //반복자가 나온다.
		while(it.hasNext()) {//hasNext함수는 커서의 다음칸에 요소가 있으면 true 요소가 없으면 false 반환함
			int n = it.next();//실제 다음칸으롷 이동하여 요소를 n에 저장한다.
			
			System.out.printf("%-3d", n);
		}

	}

}
