package am;

import java.io.File;

public class Ex1_File {

	public static void main(String[] args) {
		// 프로그램 시작
		
		//자바에서 File객체는 파일 뿐만 아니라 폴더(디렉토리)를 객체화 시키는 클래스다.
		// 그리고 실제 존재하지 않는 파일과 폴더도 객체화 시킬 수 있다.
		//그래서 존재여부 확인을 exists()로 구분할 수 있다.
		
		String path = "c:/My_Study/test/util"; // 원하는 경로를 준비
		
		File f = new File(path); 
		
		//현재 객촤 시킨 File객체가 실제 존재하는지 확인 하자
		
		if(f.exists()) {
			System.out.println("파일입니당!");
			
			//폴더일 경우에는 폴더 안에 파일 또는 또다른 하위 폴더들이 있을 수 있다.
			//하위 목록들을 한번에 얻어 낸다.
			
			/*
			String[] ar = f.list();
			for(int i=0; i<ar.length; i++) {
				System.out.println(ar[i]);
			}
			*/
			
			File[] ar =f.listFiles(); //문자열이 아니라 File객체다.
			
			for(int i=0; i<ar.length; i++) {
				if(ar[i].isDirectory())
				
				System.out.println(ar[i].getName());
			
			}
			
			System.out.println("====하위 파일들===");
			for(int k=0; k<ar.length; k++) {
				if(ar[k].isFile())
				
				System.out.println(ar[k].getName()+"("+ar[k].length()/1024+")");
			}
			
			
			
		}else {
			 System.out.println("폴더 아닙니당");
		}//if문의 끝
		
		

	}

}
