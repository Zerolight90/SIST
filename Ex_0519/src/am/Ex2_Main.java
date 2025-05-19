package am;

public class Ex2_Main {

	public static void main(String[] args) {
		//원하는 객체 생성 
		
		Ex2_Ref b = new Ex2_Ref();
		
		int[] arr = {100, 200, 300};
		
		
		//b객체가 가지는 test함수를 호출하면서 인자로 arr을 전달하자
		
		b.test(arr);
		System.out.printf("%d,%d,%d",arr[0],arr[1],arr[2]);
		
		
		
		

	}

}
