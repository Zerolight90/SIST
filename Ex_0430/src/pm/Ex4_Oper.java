package pm;

public class Ex4_Oper {

	public static void main(String[] args) {
		// 프로그램 시작
		
		//정수 10을 기억하는 v1이라는 변수를 만들자.
		
		long v1 = 10L;
		
		//정수를 7을 기억하는 v2라는 변수를 만들자.
		long v2 = 7L;
		
		long res = v1+v2;
		System.out.println(res); //v1+v2=17
		
		
		//v1+v2=17 로 출력하기
		System.out.println("v1 + v2 = " + res);
	
		//자바에서의 +는 연산적인 + 의미도 있지만 문자열과 문자열을 연결시켜주는 의미도 있다.
		// +연산자는 피연산자들 중 하나라도  문자열이 있다면, 다른 피연산자 또한 문자열로 변환된다.
		
		
		//실수형 : float(소수점6자리) 과 double(소수점8자리)
		float f1 = 3.14F; // 자바에선 소숫점을 가지고 있으면 기본적으로 double로 인식한다. 그래서 float형을 쓸경우 뒤에 f나 F를 붙여 줘야 한다.
		
		double d1 = 2.1;
		
		//나머지 값 구하기 : %연산자 사용
		
		double d2 = f1%d1;
		
		
		System.out.println("f1 % d1 = " + d2); //f1의 값 3.14를 d1의 값 2.1 로 나눈 후 그 나머지 값을 변수 d2에 저장하여 출력 하였다.
		


	}

}
