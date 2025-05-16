package homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 프로그램 시작
		
		//이때 히사객체 생성
		Company comp = new Company(); //Company 라는 객체를 생성한다. 왜? 내가 필요한 함수가 Company안에 있어서 
		comp.init(); 
		// Comany 클레스 comp라는 변수에 Company 클래스 inint함수를 호출했다
		// 그안에서 한일은 Emp객체(4개)를 생성해서 각각에 사번 이름 직책 부서를 만든 후 각각의 Emp 객체를 ArrayList에 저장하는 일을 했다.
		
		//
		Scanner scan = new Scanner(System.in);
		System.out.println("선택 :");
		System.out.println("사번검색:1, 이름검색:2, 직책검색:3, 부서검색:4");
		int cmd = scan.nextInt(); //위에 검색번호 중 하나를 cmd(1,2,3,4)를 정했다.
		
		String msg = null;
		String str = null;
		
		//사용자가 입력한 코드(1,2,3,4)에 따라 분기문을 구현하자
		
		switch(cmd) {
		
			case 1 :
				System.out.println("검색할 사번:");
				str = scan.next(); 
				msg = comp.searchEmp(cmd, str); //Comany 클레스 comp라는 변수에 Company 클래스 serchEmp(int cmd(serchEmp int n), String str(serchEmp String n)함수를 호출했다
				break; //수행이 끝났으므로 호출곳(serchEmp)로 돌아간다.
				 
			case 2 :
				System.out.println("검색할 이름:");
				str = scan.next();
				msg = comp.searchEmp(cmd, str);
				break;
				
			case 3 :
				System.out.println("검색할 직책:");
				str = scan.next();
				msg = comp.searchEmp(cmd, str);
				break;
				
			case 4 :
				System.out.println("검색할 부서:");
				str = scan.next();
				msg = comp.searchEmp(cmd, str);
				break;
			
			default :
				msg = "잘 못 입력하셨습니다.";
				
		}//switch의 끝
		if(msg.trim().length()<1) {
			System.out.println("검색된 정보가 없습니다.");
		} else {
			System.out.println(msg);
		}

	}

}
