package 라이브러리_이론;
// toString() : 객체를 문자열화 시킨다.
/*
 * 	(String)
 * 	toString()
 * 	------------둘다 문자열을 변환시키는 것들이다. 
 * 	class A 
 * 	{
 * 	}
 * 	A a=new A();
 * 	1) 명시적 => System.out.println(a.toString()); 
 * 	2) 묵시적 => System.out.println(a);
 * 
 * 
 * 
 * 
 */
class Member{
	private String name;
	private int mno;
	

public Member(int m,String n)
{
	mno=m;
	name=n; // this가 필요없다
	//this를 쓰는 이유는 Member과 매개변수 이름이 동일할때
	//두 개의 동일한 이름의 매개변수를 구분해주기 위해서 this를 사용 
	//지역변수 public Member을 먼저 찾고 없을 때 위로 올라가서 class Member의 값을 찾는다.
	}

	public String toString() {
		return "회원번호"+mno+",이름:"+name;
	}

}

public class toString {
	public static void main(String[] args) {
	
		Member m1=new Member(1, "박문수");
		Member m2=new Member(2, "심청이");
		// 오버라이딩을 하지 않으면 주소값을 출력한다.
		// 객체를 생성하고 생성자까지 동시에 만들어서 초기값까지 배정해줬기 때문에
		// tostring으로 통해서 값이 출력한다. 만약 초기값을 주지 않고 
		// String name, int mno 처럼 변수만 선언했다면 주소값이 나온다. 
		
		System.out.println("묵시적 호출 m1"+m1);
		System.out.println("명시적 호출 m1"+m1.toString());
		
		System.out.println("묵시적 호출 m2"+m2);
		System.out.println("명시적 호출 m2"+m2.toString());
		
		
	}
}
