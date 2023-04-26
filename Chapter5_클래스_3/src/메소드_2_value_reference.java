//매개변수 전송법
/*
 * 
 * 	= Call By Value
 * 		// 일반 기본형 데이터 전송 (string)
 * 		// 값에 직접적인 영향X
 * 	
 * 	= Call By Reference
 * 		// 주소를 넘겨주는 방식 (배열 ,클래스)
 * 
 */
public class 메소드_2_value_reference {
	// Call By value
	// 별도의 저장공간인 메소드를 따로 만들기 떄문에
	// 아래 main에 메소드를 실행하여도 값이 변하지 않는다.
	
	static void swap2(int[] arr2)
	{
		System.out.println("arr2="+arr2);
		System.out.println("교환전:arr2[0]="+arr2[0]+",arr2[1]="+arr2[1]);
		int temp=arr2[0];
		arr2[0]=arr2[1];
		arr2[1]=temp;
		System.out.println("교환후:arr2[0]="+arr2[0]+",arr2[1]="+arr2[1]);
	}
	
	static void swap(int x,int y)
	{
		System.out.println("교환 전:x="+x+",y"+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("교환 후:x="+x+",y"+y);
	}
	
	static void swap3(String id,String pwd)
	{
		System.out.println("교환전:id="+id+",pwd"+pwd);
		String temp=id;
		id=pwd;
		pwd=temp;
		
		System.out.println("교환후:id="+id+",pwd"+pwd);
	}
	
	
	
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		swap(a,b);
		System.out.println("종료:a="+a+",b="+b);
		
		int[] arr= {10,20};
		System.out.println("arr="+arr);
		swap2(arr);
		System.out.println("교환후:arr[0]="+arr[0]+",arr[1]="+arr[1]);
		// 배열, 클래스 => 메소드 자체에서 변경이 가능하다. 
		// call by Reference
		
		String id="admin";
		String pwd="1234";
		swap3(id,pwd);
		System.out.println("종료:id="+id+",pwd"+pwd);
		// string은 call by referce가 되지 않는다
		// string은 call by value만 적용되서 값을 변경해도 변경되지 않는다.
		
	}
}


































