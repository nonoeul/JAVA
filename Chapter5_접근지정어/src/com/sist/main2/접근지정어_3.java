package com.sist.main2;


class Member{
	private int mno;			// Member클래스에서만 사용 가능
	public String name;			// 모든 클래스에서 사용 가능(패키지가 달라도 된다) 
	// private, public은 모든 클래스에서 사용이 가능, 다른패키지에서도 사용이 가능하다 .
	protected String address;	// 
	String tel;
	// protect와 일반 변수로 지정된 매개변수는 같은 패키지안에서만 사용이 가능하다.

	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	// ㅈ접근이 필요한게 private변수인 mno만 get,setter을 만들어줘서 
	// 아래 메소드가 접근이 가능하게 만들어준다. 
}
public class 접근지정어_3 {
	public static void main(String[] args) {
		Member m =new Member();
		// 변수.를 찍어보면 노랑색=protected / 초록색=pubilc / 빨강색=private
		m.name="홍길동";
		m.address="서울";
		m.tel="010-1111-1111";
		
		System.out.println(m.name);
		System.out.println(m.address);
		System.out.println(m.tel);
	}

}
