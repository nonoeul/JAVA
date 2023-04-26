/*
 * 	초기화
 * 	1. 디폴트 값
 * 		멤버에 대한 초기값 
 * 		int => 0 , String => null , boolean => false ....
 * 		class A
 * 		{
 * 			int a;
 * 		}
 * 
 * 	2. 명시적 초기화 // 직접 값을 설정 
 * 		class A
 * 		{
 * 			int a=10; 
 * 		}
 * 
 * 	3. 생성자 초기화
 * 		class A
 * 		{
 * 			int a;
 * 			A(){
 * 			a=100;	
 * 			}
 * 		}	
 * 
 * 	4. 초기화 블록 
 * 		class A
 * 		{
 * 			int a;
 * 			//a=1000;
 * 			{
 * 			  a=1000; 
 * 			}
 * 		}
 * 	디폴트 => 명시적 => 초기블록 => 생성자
 *  
 *  디폴트 	: int a=0
 *  명시적 	: int a=10
 *  초기블록 	: int a=100
 * 	생성자	: int a=1000
 * 	// 최종적으로 생성자 값인 1000이 나온다
 * 	// 즉, 구지 초기블록이랑 생성자 두개 다 만들 필요가 없다.	
 * 	// 어차피 최종적인 값 생성자의 값으로 초기값이 설정되기 때문이다. 
 * 
 * 	
 * 
 */
class Student{
	int hakbun=1000;
	String name;
	
	{
		hakbun=100; // 연산처리 , 제어문 , 파일 읽기
	}
	
	Student() {
		System.out.println("Student() Call..");
		name="홍길동";
		hakbun=1;
		// 값을 확정적이라면 명시적 초기값에서 설정해버린다.
		// 구지 생성자를 만들어서 처리할 필요가 없다. 
	}
	
	Student(int h,String n)
	{
		hakbun=h;
		name=n;
	}
	// 생성자를 여러개 만들 수 있따.
}
/*
 *		class A
 *		{
 *			void a(){}
 *			void b(int a){}
 *			
 * 
 * 
 * 
 * 
 * 
 */
public class 생성자_2 
{
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hakbun);
		System.out.println(s.name);
		
		Student s1 = new Student();
		System.out.println(s1.hakbun);
		System.out.println(s1.name);
		// 생성자 호출 시에는 반드시 앞에 new가 붙어야 한다.!! 
		// 위에 class 자체에서 값을 지정해버리면 추후에 값 변경이 힘들다. 
		
		Student s2=new Student(2, "심청이");
		System.out.println(s2.hakbun);
		System.out.println(s2.name);
		Student s3=new Student(3, "야옹이");
		System.out.println(s3.hakbun);
		System.out.println(s3.name);
		
	}
}


































