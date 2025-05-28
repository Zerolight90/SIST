package pm;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex6_BufferedInput {

	public static void main(String[] args) {
		String path = "c:/My_Study/Java_Study/work/SIST/Ex_0528/src/pm/Ex5_FileInput.java";

		// Ex5_FileInputStream을 활용하여 읽은 후 화면에 출력하시오

		File f = new File(path); // 경로로 파일 객체 생성
		FileInputStream fis = null; // 객체자료형의 기본값은 null 값이다
		BufferedInputStream bis = null; //느리지만 자료손실이 제일 적다.

		try {
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);

			int size = -1;
			byte[] buf = new byte[2048]; // 여기서 배열이 매우 중요하다.

			while ((size = bis.read(buf)) != -1) {
				String str = new String(buf, 0, size);
				System.out.println(str);
			} // while종료

		} catch (Exception e) {
			// 예외가 발생할 경우 오류난 상황을 Stack구조로 표현한다.
			e.printStackTrace();
			System.out.println("오류 오류 비상 비상");
		} finally {
			try {
				fis.close();
				bis.close();
			} catch (IOException e2) {

				e2.printStackTrace();
			}
		}

	}

}
