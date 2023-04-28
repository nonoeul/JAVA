


211
238
142
111




package 프로그램_만들기;

// 서울명소 => 데이터형 (읽기/쓰기만 가능하면 된다.)
// getter/setter만 있으면 됀다.
// 모아주는 공간 VO라고 한다.무조권 VO는 존재해야한다.
// 데이터를 저장해주고 갖다쓸 수 있는 저장공간을 VO라고 한다. 

	/*	웹프로그램 짜는방식
	 * 	1. 저장공간을 먼저만들어야한다. 즉 변수를 먼저 만들어서 변수를 묶을건징, 어쩔건지 먼저 정해ㅑ한다.
	 * 	2. 웹프로그래밍은 시작할때 무조권 vo먼저, 알고르즘짤때는 무조권 변수 먼저
	 * 	변수 먼저 잡아라..!! 변수 먼저 잡아라..!!
	 */
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
