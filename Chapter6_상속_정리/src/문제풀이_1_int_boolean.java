/*
 * 	1. 캡슐화
 * 	=> 데이터 보호
 * 	=> 데이터를 은닉화 (private) / 메소드를 통해서 접근이 가능하다. 
 * 
 * 	사용자 정의 데이터형 => 필요에 의해서 데이터를 묶어서 관리할 목적 Music처럼 데이터만 모와놓은 것
 * 	사용자 정의 데이터형 => ~VO = 기능은 없고 변수값만 가지고 있는것
 * 	음악 프로그램을 만들 때 데이터형/시스템구현/조립 세 파트인데 이 중 데이터형이다 ~VO
 */
class SutdaCard
{
	private int num;
	private boolean isKwang;
//	getter => 읽기
//	setter => 저장
// 	관련된 것끼리 묶어서 데이터를 정리한다. 
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isKwang() {
		return isKwang;
	}
	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
// 앞에 isKwang처럼 is가 붂어있으면 boolean형이라고 볼 수 있다.	
	
class Student
{
	private String name;
	private int ban,no,kor,eng,math;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
}

public class 문제풀이_1_int_boolean {

	
	
}





























