package MAP;
import java.util.*;
/*
	A a= A에 있는 데이터만 관리한다. 
	A는 a만 접근 할 수 있다.

*/
class Sawon{
	// Object
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	
	
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}	
// 클래스가 여러 개이면 상위클래스를 interface로 묶어서 한번에 상속 가능
// 묶음을 할 때는 상위클래스부터 시작해서 묶는게 맞지만 =interface
// 상속받을때는 최대한 많은 기능을 수행할 수 있도록 자기 자신을 상속 받는데 기본적이다.
	
public Sawon(int sabun, String name, String dept, String job, int pay) {
	super();
	this.sabun = sabun;
	this.name = name;
	this.dept = dept;
	this.job = job;
	this.pay = pay;
}
	
	
	
}
// Sawon s=new Sawon(); s.addr
class Human
{
	public String name;
	public String addr;
}



public class 라이브러리_제네릭_1_1 {
	public static void main(String[] args) {
		
		List<Sawon> list=new ArrayList<Sawon>();
		// 데이터 추가
		list.add(new Sawon(1, "홍길동", "개발부","A",45000));
		list.add(new Sawon(2, "박문수", "총무부","B",55000));
		list.add(new Sawon(3, "이순신", "기획부","C",65000));
		list.add(new Sawon(4, "강감찬", "재정부","D",75000));
		list.add(new Sawon(5, "심청이", "자재부","E",85000));
		
//출력
		for (Sawon s : list) {
			System.out.println(
					s.getSabun()+ " "
					+s.getName()+ " "
					+s.getDept()+ " "
					+s.getPay()+ " "
					+s.getJob()+ " "
					);
		}
//삭제 
	// remove 인덱스 번호 2번 삭제
	// 삭제가 되면 인덱스 번호가 하나씩 당겨진다. 이 부분 잊지말자!
	// 중간중간을 remove로 삭제를 하게 되면 속도가 느려지는 단점이 발생한다.
/*	
	remove 인덱스 2번 삭제 => 속도가 느려진다
	List => 데이터 첨부 => 데이터 읽기 => 데이터 갯수
	수정 , 삭제 => 오라클
	
??Set을 사용하지 않는 이유??
	Set을 중복을 허용하지 않는다 .Set과 list의 기능을 벼로 차이가 나지 않는데
	Set을 안쓰고 list를 쓰는 이유는 Set는 중복을 허용하지 않는다. 게시판이나 홈페이지를
	만들때 엄청나게 많은 중복이 발생하게 되는데 중복을 허용하는 것은 list뿐이다.
*/		
		
	list.remove(2);
	System.out.println("===================");
	for (Sawon s : list) 
	{
		System.out.println(
				s.getSabun()+" "
				+s.getName()+ " "
				+s.getDept()+" "
				+s.getPay()+ " "
				+s.getJob()
				);
		}
		System.out.println("==================");
		System.out.println("현재 인원:"+list.size());
		System.out.println("==================");
		Sawon sa=new Sawon(8, "대한민국", "은평구", "라면", 2500);
		list.set(3, sa);
		for (Sawon s : list) 
		{
			System.out.println(
					s.getSabun()+" "
					+s.getName()+ " "
					+s.getDept()+" "
					+s.getPay()+ " "
					+s.getJob()
					);
		};
		System.out.println("=======================");
		System.out.println("현재 인원:"+list.size());
		System.out.println("=======================");
		list.clear();
		//clear는 장바구니를 지우거나 할때 clear를 많이 사용된다. 
		System.out.println("현재인원 "+list.size());
	
	}
}
