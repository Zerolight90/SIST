package pm;

import am.Ex2_Pet;

public class Ex4_Main {

	public static void main(String[] args) {
		// 문자열 객세 생성
		String s1 = new String("SiST");
		
		String s2 = new String("교육센터");
		
		System.out.println("Sb"+s1);
		System.out.println("Sb"+s2);
			
			StringBuffer sb=new StringBuffer("SiSt");
			StringBuffer sb2= sb.append("교육센터");
			
			System.out.println("sb:" + sb.toString());
			System.out.println("sb2:" + sb2.toString());
			
			if(sb == sb2) {
				System.out.println("서로 주조가 같다");
			}else{
				System.out.println("서로 주조가 같다");
			
			}
		
				
	}

}
