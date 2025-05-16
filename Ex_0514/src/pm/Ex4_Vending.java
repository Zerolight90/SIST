package pm;

public class Ex4_Vending {

   // 음료수 배열 저장
   Ex4_Drink[] ar = new Ex4_Drink[4];
   private int insertCoin;
   
   // 음료 종류 : 레쓰비, 사이다, 콜라, 웰치스
   // 자판기에 음료 저장
   public void setAr() {
      ar[0] = new Ex4_Drink();
      ar[0].setDrink_name("레츠비");
      ar[0].setPrice(500);

      ar[1] = new Ex4_Drink();
      ar[1].setDrink_name("사이다");
      ar[1].setPrice(700);

      ar[2] = new Ex4_Drink();
      ar[2].setDrink_name("콜라");
      ar[2].setPrice(700);

      ar[3] = new Ex4_Drink();
      ar[3].setDrink_name("웰치스");
      ar[3].setPrice(1000);

   }

   
   public String select(int amount) {

      StringBuffer sb = new StringBuffer();
      insertCoin = amount;

      //음료 최소 가격이 500원이여서 500이상에서만 실행 되게하는 if문
      if (insertCoin >= 500) {
         for (int i = 0; i < ar.length; i++) {
            Ex4_Drink dr = ar[i];
            
            if (dr.getPrice() <= insertCoin) {
               
               sb.append(i+1);
               sb.append(".");
               sb.append(dr.getDrink_name());
               sb.append(" ");
               sb.append(dr.getPrice());
               sb.append("원");
               sb.append(" ");
               sb.append("|");
               sb.append(" ");
            }
            
         }
         sb.append(" 선택");
         sb.append(": ");
         
      }
      return sb.toString();
   }
   
   //선택한 음료와 잔돈 계산
   public String order(int order) {
      StringBuffer sb = new StringBuffer();
            
         Ex4_Drink dr = ar[order-1];// 배열은 0=>1 1=>2 이므로 키보드에서 2번을 받으면 배열함수에선 1번영역에 가야되므로 -1 처리
         int price = dr.getPrice(); //각 음료 가격에 대한 정보를 int price로 선언
         int change = insertCoin - price; //잔돈을 구하기 위해 입금된 코인을 음료정보로 통해 들어온 각 음료와 연산처리
         
         sb.append("선택하신 음료는");
         sb.append(" ");
         sb.append(dr.getDrink_name());
         sb.append("\r\n");
         sb.append("잔돈은 ");
         sb.append(change);
         sb.append(" 입니다");
         
      
      
   
      
      return sb.toString();
   }

}
