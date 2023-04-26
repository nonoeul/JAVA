package 라이브러리_Wrapper;

import java.util.ArrayList;
import java.util.List;

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
public class Wrapper_1 {
	public static void main(String[] args) {
		String s="4.3";		 //String으로 숫자형을 문자형으로 지정했다.		
//		doutble d=(double)s; //숫자라도 자바상에는 문자이다. 문자열을 double 정수형으로 바꿀려고 하니 오류가 발생한다.,
		// 위 같이 타입이 안맞아서 오류가 발생할때 Wapper클래스를 사용하는 것이다.
		double d=Double.parseDouble(s);
		// 사용처 => 문자열을 원하는 데이터형으로 변경할 때 사용된다. 
		// 클라이언트 배포 => 윈도우 / 브라우저 / 핸드폰 
/*			==========> 모든 데이터형 문자열 => 기본형 데이터형으로 변경
			데이터형 문자열을 ㅜ리가 필요한 정수형, 논리형을 바꾸기 위해서 Wrapper을 사용한다.
			
		클래스형	: 객체단위로 저장 (List<>)
		
	??변환 방식??
		1. 문자열
		2. 해당데이터로 변환 parse.클래스형
		3. static에 저장 // 뱐환이 불가능한 값 
			
			
	??Wrapper??
		Wrapper 즉 포장해준다. 문자열을 위한 원하는 데이터형으로 포장을 해줘서 우리가 쓰기 편리하게 만들어준다.
		
	?? 오토박싱 / 언박싱??
		- Integer i=new Interger(10);
		Integer i=10; ==> String s=""
		클래스에 해당 데이터을 설정한다. 
		기본형에 클래스 객체를 설정해준다. 
		int aa=i;
*/		
		
		Integer i=100; // 클래스에다가 값을 대입하는 것은 오토박싱이라고 한다.
		System.out.println("i="+i);
		
		int aa=i;
		// 값을 클래스에다가 대입하ㅡㄴ 것을 언박싱이라고 한다.
		// new를 쓸 필요없다는 것을 생각하자. 
		System.out.println("aa"+aa);
		
//	??언박싱 오토박싱?/
/*		박싱 
 * 		= 기본타입의 데이터를 Wrapper 객체로 변환하는 것
 *		Integer i=100;  
 * 
 * 		언박싱
 * 		= Wrapper 객체를 기본 타입의 객체로 바꾸는 것 
 * 		int aa=i;	
 */
		List<Integer> list=new ArrayList<Integer>();
/*
 *	
 *	??ArrayList<Object> list = new ArrayList<Object>();?? 처럼
 *		??ArrayList를 안쓰고 List를 쓰는 이유는? 
 *		??List<Object> list = new ArrayList<Object>();??
 *		List인터페이스ㅡㄹ 사용하게 되면 인터페이스를 구체클래스 위에 타입으로 덧씌우는
 *		캡슐화와 낮은 결합도를 가진 프로그램을 짜야한다. 
 *		
 *		??List 인터페이스 장점??
 *			1. 쉽게 변경이 가능하다.  
 *		
 *	??Wrapper클래스 쓰는 이유??
 *		1. 문자열을 해당 데이터형으로 변환
 * 		 	문자열 => 정수형	Integer.parseInt("10"
 * 		 	문자열 => 실수형	Double.parseDouble("4.5")
 * 		 	문자열 => 논리형 	boolean.parseboolean("4.5")
 * 
 * 		2. 객체 단위로 저장할때가 있다. (자료구조 => Collection)	
 *
 * 	
 * 
 */
		
	}
}














