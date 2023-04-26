package 라이브러리_이론;
/*
 * 	??String vs StringBuffer??
 * 		String은 불변하다. 변하지 않는다. (immuatable)
 * 		StringBuffer 변함이 없다. (mutable) 변함
 * 
 *  	String은 문자열을 대표하는 것으로 문자열을 조작하는 경우 용이하다.
 *  	String은 한번 생성되면 메모리 공간이 변하지 안흔ㄷ.
 *  
 *  	1. String은 연산자로 다른 String 문자열을 붙여도 합쳐진 객체로 바뀌는게 아니라
 *  		문자열이 합쳐진 새로운 객체가 만들어진다. 
 *  		새로운 String 객체를 만든 후에, 새 String 객체에 연결된 문자열을 저장하고
 *  		그 객체를 참조하도록 합니다. 
 *  			=>문자열이 많은 경우 성능이 별로다
 * 				=>하지만 불변하기 때문에 동기화에 신경쓸 필요없고, 내부 데이터를 자유롭게 공유가 가능하다.
 * 
 * 		2. StringBuffer / StringBuiler 클래스
 * 			= 문자열을 추가하거나 변경할 떄 주로 사용되는 자료형이다.
 * 			= string도 연산자를 통해서 합칠 수 있지만 새로운 객체가 만들어져 속도가 느려진다.
 * 			= 내부 버퍼(Buffer)라는 독립적인 공간을 만들어줘서 공간의 낭비도 없고 속도가 빠르다. 
 */
public class String_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb2 = new StringBuffer();  // StringBuffer 객체 sb 생성
		sb2.append("hello");
		sb2.append(" ");
		sb2.append("jump to java");
		String result = sb2.toString();
		System.out.println(result); // hello jump to java
		// → + 연산보다는 복잡해 보이지만 연산 속도가 빠르다는 장점이 있다
		
		System.out.println("================");
		
		String str = "abcdefg";
		StringBuffer sb = new StringBuffer(str); // String -> StringBuffer

		System.out.println("처음 상태 : " + sb); // 처음상태 : abcdefg

		System.out.println("문자열 String 변환 : " + sb.toString()); // StringBuffer를 String으로 변환하기

		System.out.println("문자열 추출 : " + sb.substring(2,4)); // 문자열 추출하기

		System.out.println("문자열 추가 : " + sb.insert(2,"추가")); // 문자열 추가하기

		System.out.println("문자열 삭제 : " + sb.delete(2,4)); // 문자열 삭제하기

		System.out.println("문자열 연결 : " + sb.append("hijk")); // 문자열 붙이기

		System.out.println("문자열의 길이 : " + sb.length()); // 문자열의 길이구하기

		System.out.println("용량의 크기 : " + sb.capacity()); // 용량의 크기 구하기

		System.out.println("문자열 역순 변경 : " + sb.reverse()); // 문자열 뒤집기

		System.out.println("마지막 상태 : " + sb); // 마지막상태 : kjihgfedcba
	}
}
