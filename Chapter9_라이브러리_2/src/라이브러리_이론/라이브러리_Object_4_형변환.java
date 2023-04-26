package 라이브러리_이론;

//equals => Object에서는 객체비교 String 

class Stuent{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Student2{
	private String name;

	public Student2(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student2)
			return name==((Student2)obj).name; // 문자열 비교할때 사용한다. 
/*						1.우선순위를 주고 해야한다 .
						2.obj객체에 student로 형변환을 하고
						3.student에 있는 name을 가져와야한다.
					**만약 ((student2)obj)을 묶어주지 않는다면 오류가 발생한다.
					**obj 자체의 name을 가져올 수 없기 때문에 obj을 student로 형변환을 해준 뒤에
					student의 name을 가지고 와야 하낟.  
*/		
		else
			return false;
/*	(Student2)obj.name ==> 형변환
 * 	((Student2)obj).name
 * 	Object => String name 
 * 	형변환보다 우선순위이다.
  	(10+2)*5 20 
  	재정의를 하지 않는 경우는 ==동일하다.
  	Object => equals는 사용빈도가 많지 않다. => 오버라이딩을 사용해야 한다.
  	=> String ... equals가 재정의 되어 있다.  
 */
	}
	
	public void print()
	{
		System.out.println("당신의 이름은: "+name+"입니다");
	}

/*
 	String s="Hello";
 	s.length()
 	
 	
 */
	
	
}

	
// == (객체=>주소) , equals (객체가 가지고 있는 변수의 비교)
public class 라이브러리_Object_4_형변환 {
	public static void main(String[] args) {
		
		Student2 s1=new Student2("홍길동");
		Student2 s2=new Student2("홍길동");
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		// s1=com_sist_lib.Student2@64f6106c
		// s2=com_sist_lib.Student2@553a3d88
		// 객체비교 == 주소값을 비교한다. 두 개의 값의 내용은 달라도
		// new를 통해서 새로운 객체를 만든 것이기 때문에 서로 다른 객체이다.
		
		
		if(s1==s2)
		{
			System.out.println("s1과 s2은 같다");
		}
		else
		{
			System.out.println("s1과 s2는 같지 않다.");
		}
		
		System.out.println("=================");
		
		if(s1.equals(s2))
		{
			System.out.println("s1과 s2는 같다.");
		}
		else
		{
			System.out.println("S1과 s2는 같지 않다.");
		}
		
		s1.print();
		s2.print();
		new Student2("박문수").print();
/*
 	??접근할 때 Student2 s1=new Student2("홍길동")??
  	s1으로 접근할 수 도 있고, student2로도 접근할 수 있따.
  	int a=10에서 객체에 접근할 때 10으로도 접근할 수 있고, a로도 접근할 수 있다.
  	만차가지고 Student2 s1=new Student2도 s1으로도 접근이 가능하고 Student로도 접근이 가능하다.
  	
  
 */
		
		
		
	}
}

















