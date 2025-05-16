package am;

public class Ex5_Array {

	public static void main(String[] args) {
		// 문자를 4개 저장 할수 있는 배열을 생성한 후 반복문을 이용하여 'A','B','C','D'가 순서대로 저장대도록 저장하여라
		
		char[] ar = new char [4];
		
		char ch = 'A';
		
		for(int i = 0; i<ar.length; i++) {
			ar[i] =ch;
			ch++;
			
			
			System.out.printf("ar[%d]=%c ",i, ar[i]);
			
		}
		

	}

}
