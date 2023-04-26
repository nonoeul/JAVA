package exam;
//Member => 사용자 정의 데이터형 (읽기/쓰기)
/*
 * Member 클래스는 데이터만 모아둔 것, 사용자가 아닌 입력에 필요한 변수들만 모아둔 것
 * 사용자에게 보여줄 필요가 없으므로 private로 감춰주고 setter/getter로 변수들을 보안하면서
 * 실제 변수는 사용 가능하도록 만들어준다. 
 */
public class Member {
	private String id;
	private String name;
	private String sex;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
}
