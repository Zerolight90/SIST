package am;

//interface에서는 @Override(재정의)가 필수다
public class Ex2_Impl implements Ex2_Inter {

	int su = 20;

	@Override 
	public int getValue() {
		// TODO Auto-generated method stub
		return MAX_VALUE * su;
	}

}
