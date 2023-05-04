package 입출력_;

import java.io.*;

// 직렬화 = 일자로 쭉 저장한다 .
public class Sawon implements Serializable{ // Serializable직렬화라는 의미이다. 일자로 쭉쭉 저장
	//butteredReader처럼 묶어서 저장하는 것은 병렬화 
	private int sabun;
	private String name;
	private String dept;
	private String job ;
	private int pay;
	
	public Sawon(int i, String string, String string2, String string3, int j) {
		// TODO Auto-generated constructor stub
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
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
}
