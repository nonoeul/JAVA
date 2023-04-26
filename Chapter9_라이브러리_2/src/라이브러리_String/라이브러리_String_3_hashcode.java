package 라이브러리_String;

public class 라이브러리_String_3_hashcode {
	public static void main(String[] args) {
		
		String s1="Hello";
		System.out.println(s1.hashCode());
		s1=s1+"Java";
		System.out.println(s1.hashCode());
		// 서로다른 주소가 나온다
		
	}
}
