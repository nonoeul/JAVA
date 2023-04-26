package 라이브러리_Wrapper;
/*
 * 	Wrapper : 전체를 감싼다.
 * 	--------------------- CSS(container)
 * 	프로그램 개발 => 기본형 데이터형을 객체단위로 저장할때
 * 
 * 	List<int> => 오류
 * 		-------- 클래스형 
 * 
 *		기본형		클래스형	=> 기본형에 기능을 추가해서 클래스화 시킨 것 (Wrapper)
 *		int			Interger
 *		long		Long
 *		byte		Byte
 *		double		Double
 * 		boolean		Boolean
 * 		---------------------
 * 		String double => String(웹 => 문자열)
 * 		String score=(String)4.3;	=> 오류
 * 		double scroe=(double)"4.3";	=> 오류
 * 
 */
public class Wapper_1 {
	public static void main(String[] args) {
		String s="4.3";		 //String으로 숫자형을 문자형으로 지정했다.		
//		doutble d=(double)s; //숫자라도 자바상에는 문자이다. 문자열을 double 정수형으로 바꿀려고 하니 오류가 발생한다.,
		// 위 같이 타입이 안맞아서 오류가 발생할때 Wapper클래스를 사용하는 것이다.
		double d=Double.parseDouble(s);
		// 사용처 => 문자열을 원하는 데이터형으로 변경할 때 사용된다. 
		// 
		
		
	}
}
