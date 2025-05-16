package pm;

public class Ex7_Array_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] ar = {
				{"다이아","금두꺼비","꽝","로또1등"},
				{"꽝","황금알","비누","아파트"},
				{"꽝","천원","꽝","거품"}
		};
		int row = (int)(Math.random() * ar.length); //0,1,2
		int col = (int)(Math.random() * ar[0].length);//0,1,2
		
		String msg = ar[row][col];
		System.out.printf("%s가 선택되었습니다.",msg);
		
		

	}

}
