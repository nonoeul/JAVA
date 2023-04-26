package 라이브러리_이론;
//clone => 복제를 할때를 사용 (메모리가 새롭게 생성) => prototype

class Sawon implements Cloneable{
	private int sabun;
	
	private String name;

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

	//초기화 
	public Sawon(int sabun, String name)
	{
		// 지역변수가 우선순위이다. => 멤버변수인지 지역변지인지 구분해야한다. this를 토해서 구분한다. 
		// this는 자기자신의 객체로써 static변수, 모든 클래스는 this를 가지고 있다. 
		this.sabun=sabun;		
		this.name=name;
		/*
		 * 	오버로딩
		 * 	생성자 => 생성자 같은 경우에는 여러 개를 사용이 가능하다.
		 * 	객체 생성시에 호출이 되는 메소드이다. 
		 * 	 1.생성자는 한 개 이상이 있다. 
		 *	 2.생성자를 생성하지 않으면 자동으로 기본생성자를 만들어준다.
		 *	 3.시작과 동시에 필요한 내용을 서술한다. 
		 * 	 예) 데이터베이스 연결 => 드라이버 설정 (클래스로 만들어져 있다.)
		 * 		 thin드라이버 (연결만 해주는 역할) 
		 * 	 4. 필요시에만 사용 
		 */
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
							// clone은 무조권 예외처리를 해줘야한다.
		//** throws가 붙는 순간 무조권 예외처리를 해줘야한다고 생각하면 된다.
		// throws가 지원하는 것에는 unchecked가 존재하지 않는다.
		
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public void print()
	{
		System.out.println("사번:"+sabun+",이름:"+name);
	}
	
}


public class 라이브러리_Object_2_clone {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Sawon s1=new Sawon(1, "홍길동"); // new를 호출하는 순간 새로운 객체를 만든다.
		// 값을 변경하기 위해서는 getter/setter을 이용해야 한다.
		// 생성자는 값을 변경하는게 아니라 생성자의 초기값을 지정해주는 것이다.
		// 생성자로 오버라이딩해서 값을 변경하기 위해 생성자를 생성할때마다 새로운 생성자가 만들어진다.
		s1.print();
		Sawon s2=s1;
		s2.print();
		
		s1.setSabun(2);
		s1.setName("노울입니다");

		//주소를 이용할 경우 같은 조사일때 두 내용이 서로 영향을 끼친다. 
		System.out.println("s1="+s1+",s2"+s2);
		
		//복제
		Sawon s3=(Sawon)s1.clone();
		s3.print();
		System.out.println("s3="+s3);
		
	}
}





















