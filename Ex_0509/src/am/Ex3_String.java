package am;

public class Ex3_String {

	public static void main(String[] args) {
		
		String str = "안녕하세요! 금요일이군요.";
		int i = str.length();
		
		// str이 기억하고 있는 문자열에서 "하"가 있는 위치
		// index값(정수)을 알아내자
		
		
		int idx =str.indexOf("하");
		System.out.println("str.indexOf(\"하\")의 위치 = "+idx); 
		
		
		int idx2 =str.indexOf("요");
		System.out.println("str.indexOf(\"요\")의 위치 = "+idx2); //기본적으로 왼쪽에서 부터 찾아 들어 가서 제일 먼저 있는 "요"의 index값을 전달한다.
		
		//찾은 "요" 이후에 있는 "요를 검색하자
		int idx3 = str.indexOf("요", idx2+1);
		System.out.println("str.indexOf(\"요\") idx2+1)의 위치 = " +idx3);
		
		int idx4 = str.lastIndexOf("요");
		System.out.println("str.lastIndexOf(\"요\")의 위치 = " + idx4);// 검색을 뒤에서 시작한다. 하지만 idx값이 변하진 않는다.
		
		
		System.out.println("============================================");
		
		String file_name = "    Ex1.java     "; //외부에서 인자로 받았다고 가정하고, 내용은 모른다고 생각하자
		//받은 파일이 자바 파일 또는 텍스트 파일인지 판단하자
		String t_fname = file_name.trim();//trim()함수는 앞뒤 공백을 제거 해서 반환해준다.
		
		
		if(t_fname.endsWith(".java") || t_fname.endsWith(".txt")) {
			
			System.out.println("자바 또는 텍스트 파일이군요");
			
		} else {
			System.out.println("처리 할 수 없는 파일입니다.");
		}
		
		// a를 찾아서 *로 변경하자
		
		String c_fname =  t_fname.replaceAll("a", "*");
		System.out.println(c_fname);
		
	}

}
