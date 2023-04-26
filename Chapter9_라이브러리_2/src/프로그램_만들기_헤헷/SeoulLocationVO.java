package 프로그램_만들기_헤헷;

// 서울명소 => 데이터형 (읽기/쓰기만 가능하면 된다.)
// getter/setter만 있으면 됀다.
public class SeoulLocationVO {
	private int no;
	private String content;
	private String name;
	private String address;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
