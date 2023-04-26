package com_sist_main;
class Member{
	private String name; // 메모리에 읽기/쓰기 
	private static Member mem;
	// 메모리에 저장된 데이터 읽기 
	public String getName() {
		return name;
	}
	
	// 메모리에 저장 
	public void setName(String name) {
		this.name = name;
	}
	
	public static Member newInstance()
	{
		if(mem==null)
			mem=new Member();
		return mem;
	// static은 거의 다 싱클턴이다.	
	// 싱클턴~~~~!!! // 하나의 메모리; 공간을 공유하기 때문에 아무리 많은 객체를 생성해도 동일한값, 동일한 메모리를 공유한다.
	// 싱클턴이 아닌 각각의 객체를 생성해서 각각의 메모리를 공유하는 경우 인스턴스 변수 
	}
	
}

public class 정적초기화_싱글턴 {
	public static void main(String[] args) {
		
	Member m1=Member.newInstance();
	m1.setName("홍길동");
	System.out.println("m1="+m1);
	Member m2=Member.newInstance();
	m2.setName("심청이");
	System.out.println("m2="+m2);
	Member m3=Member.newInstance();
	m3.setName("박문수");
	System.out.println("m3="+m3);
	
	System.out.println(m1.getName());
	System.out.println(m2.getName());
	System.out.println(m3.getName());
	// 3개가 전부 다 같은 객체이다.
	// m1 , m2 , m3 전부 다 같은 객체로써 같은 메모리를 공유한다. 
	// 객체를 아무리 많이 생성해도 하나의 객체를 공유하기 떄문에 객체의 값은 변하지 않는다.
	
	System.out.println("================");
	
	}
}	

























