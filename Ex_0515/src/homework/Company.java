package homework;

import java.util.ArrayList;

public class Company {
	//사원(EmpVO) 4명을 저장할 곳!!! (배열)
	ArrayList<Emp> ar = new ArrayList<>(); //맴버 필드(변수)
	
	//비어있는 배열을 원하는 사원정보들로 채우는 초기화 함수
	/*
	public void init() {
		Emp e1 = new Emp();
		e1.setEmpno("122");
		e1.setEname("이도");
		e1.setPosition("팀장");
		e1.setDept("개발1팀");
		
		Emp e2 = new Emp();
		e2.setEmpno("205");
		e2.setEname("아라치");
		e2.setPosition("사원");
		e2.setDept("기획팀");
		
		Emp e3 = new Emp();
		e3.setEmpno("529");
		e3.setEname("창조리");
		e3.setPosition("과장");
		e3.setDept("개발1팀");
		
		Emp e4 = new Emp();
		e4.setEmpno("365");
		e4.setEname("마루치");
		e4.setPosition("사원");
		e4.setDept("개발2팀");
		
		//앞서 생성한 사원객체들을 배열 각 요소에 저장한다.
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		ar.add(e4);
	}
	*/
	
	public void init() {
		Emp e1 = new Emp("122", "이도", "팀장", "개발1팀");
				
		Emp e2 = new Emp("205", "아라치", "사원", "기획");
		
		Emp e3 = new Emp("529", "창조리", "과장", "개발1팀");
				
		Emp e4 = new Emp("365", "마루치", "사원", "개발2팀");
		
		//앞서 생성한 사원객체들을 배열 각 요소에 저장한다. 왜?? init 지역변수인 호출이 끝나면 소멸 되기 때문에, 맴버변수인 ArryList에 저장해야 소멸 되지 않는다.
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		ar.add(e4);
		//=>ar ArrayList 에 저장 완료!
	}
	
	
	//검색기능
	public String searchEmp(int n, String value) { //int n은 매인함수의 int cmd값, value는 메인함수에 str값
		
		//인자인 value가 null이거나 공백일 경우에는 null값을 보낸다.
		if(value == null || value.trim().length() == 0)
			return null;// 호출한 곳으로 null을 반환하면서 돌아간다.
		
		StringBuffer sb = new StringBuffer();// 문자열 편집을 위해 필요한 객체
		
		for(int i=0; i<ar.size(); i++) {
			//먼저 배열로 부터 한개의 요소(EmpVO)를 얻어낸다.
			Emp e = ar.get(i);
			boolean chk = false;
			
			
			switch(n) { // 메인 함수에서 사용자로부터 n수(cmd)를 받는다.
				case 2: //이름검색
					//얻어낸 사원객체의 이름 안에 인자로 받은 value가 
					// 포함되었다면 sb에 적재한다.
					
					if(e.getEname().equals(value)) 
						chk = true;
					break;
				case 1: //사번검색
					if(e.getEmpno().equals(value))
						chk = true;
					break;
				case 3: //직책검색
					if(e.getPosition().equals(value))
						chk = true;
					break;
				case 4: //부서검사
					if(e.getDept().equals(value))
						chk = true;
					break;	
			}//switch의 끝			
			
			
			if(chk){// chk가 true일 때
				sb.append(e.getEmpno());
				sb.append(" | ");
				sb.append(e.getEname());
				sb.append(" | ");
				sb.append(e.getPosition());
				sb.append(" | ");
				sb.append(e.getDept());
				sb.append("\r\n");//줄바꿈
			}//if문의 끝
		}//for의 끝
		return sb.toString();//호출한 곳으로 sb의 내용을 문자열로 반환한다.
	}//searchEmp함수의 끝
}//클래스의 끝
