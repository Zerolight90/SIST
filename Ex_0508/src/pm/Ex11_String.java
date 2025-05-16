package pm;

public class Ex11_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Know Sun Ae";
		
		int index = s1.indexOf('n');
		System.out.println("맨 처음 문자 n의 위치 :" + index);
		
		index = s1.indexOf("Sun");
		System.out.println("문자 Sun의 위치 :" + index);
		
		index = s1.lastIndexOf('n');
		System.out.println("맨 마지막 문자 n의 위치 :" + index);
		
		char ch = s1.charAt(index);
		System.out.println("추출한 문자 : "+ ch);
	}

}
