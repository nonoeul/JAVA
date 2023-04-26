package com.sist.main3;
// 데이터형만 사용
// 따로 캡슐화분리해 놓아서 사용자에게 필요한 정보만 보여줄 수 있게 한다. 
public class Student {
	public int number;
	private String hakbun;
	String name;
	protected int kor,eng,math;
	
	private int total;
	private double avg;
	private char score;
	private int rank;
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getScore() {
		return score;
	}
	public void setScore(char score) {
		this.score = score;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
}


// public은 패키지가 달라도 돼고 모든 클래스에서 접근이 가능하다
// private, 일반변수, protected는 클래스내에서만 존재한다. 