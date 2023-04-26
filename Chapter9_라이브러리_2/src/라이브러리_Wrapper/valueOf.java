package 라이브러리_Wrapper;

/*
	valueOf()함수는 입력받은 인자 값을 지정된 객체형으로 반환해야 한다.
	기본형 원시 데이터 => byte, int, long, double, boolean등 데이터형 또는 문자열등이 될 수 있다.
	
	valueOf == 문자열로 바꿔주는 것이다. 
 */ 

public class valueOf {
	public static void main(String[] args) {
	
		int numInt = 100;
		long numLo = 1000;
		double numDou = 100.100;
		
		boolean flag = true;
		
		char ch = 'A';
		
		//위와 같은 모든 타입을 문자열로 바꿀수 있다.
		//이를 가능하게 해주는 메서드가 바로 valueOf이다.
				
		//형변환을 실시한 이유 변경된 문자열과 그에따른 클래스가 
		//String에 속하는지 확인하기 위해 getClass를 이용해 속한 클래스를 나타내게 하였다.
		
		String numIntS = String.valueOf(numInt);
		System.out.println(numIntS + " / " + numIntS.getClass());
		
		String numLoS = String.valueOf(numLo);
		System.out.println(numLoS + " / " + numLoS.getClass());
		
		String numDouS = String.valueOf(numDou);
		System.out.println(numDouS + " / " + numDouS.getClass());
		
		String flagS = String.valueOf(flag);
		System.out.println(flagS + " / " + flagS.getClass());
		
		String chS = String.valueOf(ch);
		System.out.println(chS + " / " + chS.getClass());
		
		// getClass 타입형을 바꿔주는 것이다.
	}
}
