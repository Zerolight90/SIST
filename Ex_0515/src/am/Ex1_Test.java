package am;

public class Ex1_Test {
	// 맴버 변수
	private String name;
	private int age;
	
	//생성자는 반드시 접근제한자가 있어야 하며, 반환형은 명시하지 않는다.
	//이름은 반드시 클래명과 같아야 한다.
	
	public Ex1_Test(String name, int age) {
		//받은 인자들을 멤버필드에 저장 => 인자들은 모두 지역변수 이다.
		
		this.name = name;
		this.age = age;
		
		
	}//생정자의 끝
	
	public Ex1_Test() { //기본생성자
		
	}
	

	public String getName() { //맴버변수 값을 얻을때 사용
		return name;
	}

	public void setName(String name) { //맴버변수 값을 사용할때 사용
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
