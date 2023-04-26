package com.sist.main;
class Sawon{
	private int sabun;
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
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	private String name;
	private String dept;
	private String loc;
	private int pay;
	
	
}
// 객체지향의 3대 특성은 문법사항이 아니다
public class 접근지정어_2 {
	public static void main(String[] args) {
		Sawon as=new Sawon();
		as.setSabun(1);
		as.setName(null);
		as.setLoc("서울");
		as.setPay(3000);
		// 캡술화방식 데이터를 보호하기 위해서 사용하는 방식
		
	}
}















































