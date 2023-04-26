package 라이브러리_이론;

class Sawon2{
	private int sabun;
	private String name;
	//초기화
	public Sawon2(int sabun, String name) // 생성자
	{
		this.sabun=sabun;
		this.name=name;
		
		
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
	
/*	??생성자 값변경??
 	생성자는 값을 변경한다는 개념이 아니라 
 	새로운 값을 만들어준다는 개념이다. 
 	
 	1. 맨처음 초기화 할때는 = 생성자를 사용한다.
 	2. 초기갑을 지정했는데 값을 변경하고 싶을 때 == getter/setter을 사용한다. 

 */
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Sawon2 s=(Sawon2)obj;
		return name.equals(s.name) && sabun==s.sabun;
	}
	// 오버라이딩을 해줘여ㅑ지 equal가 안에 있는 내용값으 비교한다.
	//. equal을 쓰지 않으면 안에 내용값은 비교해주지 않는다. 

	public void print()
	{
		System.out.println("출력하고 있습니다요 당신의 이름은: "+name);
	}


}

public class 라이브러리_Object_5_equals {
	public static void main(String[] args) {
		
		Sawon2 s1=new Sawon2(1, "홍길동"); // 새로운 객체를 만드는 것 새로운 메모리 객체가 생겨났다.
		// 생성자가지고 값을 변경할 수 없다. 그래서 생성자는 값을 변경하는 개념이 아니다.
		// 생성자는 값을 변경하기 위해서는 불필요한 새로운 객체를 계속해서 만들어야 하고, 메모리주소가 계속해서 바뀐다.
		// 초기값이 지정된 후 값을 변경하기 위해서는 getter/setter을 사용해야 한다. 
		
		Sawon2 s2=new Sawon2(1, "홍길동");
		// 오버라이딩을 하지 않는 경우 주소값을 비교한다. == 과 동일하다. 
		// 오버라이딩은 재정의해야한다. 
		// equal은 객체 안에 값이 동일하냐를 따지기 위헤 사용하는 것인데 오버라이딩을
		// 해주지 않으면 객체 안의 값을 비교하지 않고 주소값으 비교한다.
/*	1. equal = 객체안의 내용을 비교하지만, 오버라이딩을 하지 않으면 주소값을 비교한다. ==와 동일
  	equal은 오버라이딩을 해야한다는 번거로움이 있어서 잘 사용하지 안흔다. 
 		
 */
		if(s1.equals(s2))
		{
			System.out.println("같은 사원입니다.");
		}
		else
		{
			System.out.println("다른 사원입니다.");
		}
	

	}
}
























