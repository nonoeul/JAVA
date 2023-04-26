package 라이브러리_StringBuffer;
// delete, insert => 원본변경
// subString => 원본 변경이 없다. 
public class 라이브러리_StringBuffer_1 {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hong Gil dong"); 
		sb.delete(3, 6);				//0123456789123
		// 3번부터 5번까지 자르것 순서대로 자르는 것이다. a번부터 b-1번까지 자르는 것이다. 
		// delete(int s,int e) => e-1 
		System.out.println(sb);
		System.out.println(sb.toString());
		sb.insert(3, "입니다");
		// 뒤에다가 입니다를 붙여라!! 3번부터 뒤에 입니다를 붙여서 출력해라 
		System.out.println(sb.toString());
		
		System.out.println(sb.substring(3));
		// substring은 두 가지 방식이 있다.
		// 1. 매개변수 한개 일때	 a부터 잘라와라
		// 2. 매개변수 두개 일때	 a부터 b-1번까지 잘라와라 
		// substring은 메모리 자체를 변경하는게 새로운 메모리에 저장하는 것이다.
		
//	??delete,insert vs substring차이?/
/*		delete,insert같은 것은 
 * 
 * 
 * 
 */
		
	}
}
