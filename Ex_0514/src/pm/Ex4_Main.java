package pm;

import java.util.Scanner;

public class Ex4_Main {

   public static void main(String[] args) {
      // 프로그램 시작
      
      Ex4_Vending vd = new Ex4_Vending();
      
      vd.setAr(); //자판기에 저장된 음료 4개 정보 생성
      
      
      System.out.println("SIST자판기");
      System.out.println("=====================");
      System.out.println("돈을 입금해주세요");
      
      
      //돈 입금을 해서 자판기클래스에 보내는 함수
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      String str = new String();
      str = vd.select(n);
      System.out.println(str);
   
      // 음료를 선택
      int s = scan.nextInt();
      String order = new String();
      order = vd.order(s);
      
      //최종 결과 출력
      System.out.println(order);
   }

}