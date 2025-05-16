package pm;

public class Ex9_String {

	public static void main(String[] args) {
		// "ABCDE"를 기억하는 변수 str을 만들자
		
		String str = "ABCDE";
		
		//문자열의 길이를 구하는 법
		
		int len = str.length();
		System.out.println("str.length():"+len);
		
		//str에서 특정 위취(index)에 있는 문자를 얻어내자
		
		char ch = str.charAt(1);// 두번쨰 문자 B
		System.out.println("str.charAt(1):"+ch);
		
		//str에서 "BC"가 있는 위치(index) 값을 알아내자
		
		int index = str.indexOf("BC");
		System.out.println("str.indexOf(\"BC\"):" + index);
		
		//str에서 앞서 얻어낸 index로 부터 3자를 추출하자
		String sub=str.substring(index, index+3); //String을 반환해서 받기 때문에 String을 선언해야 한다.
		System.out.println("str.substring(index, index+3) :"+ sub); 
	
		

	}

}
