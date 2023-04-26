/*
 *	method => 140page
 * 	1) 메소드 형식 => 기능처리
 * 	------------
 * 	웹 => 화면 변경
 *  ------------ 메뉴 클릭, 버튼 클릭, 이미지 클릭
 * 	검색, 글쓰기, 수정, 회원가입, 회원탈퇴
 * 	사용자의 동작과 관련
 * 	리턴형 메소드명(매개변수 .....) => 선언부
 * 	{
 * 		구현부 
 * 	}
 * 	= 리턴타입	 (리턴형)
 * 	  처리 후 결과값 한 개만 전송이 가능하다. 
 * 	  *** 여러 개인 경우 : 배열 , 클래스
 * 	  *** 한개인 경우 : 일반 기본형, String
 * 
 *    예) 
 *   	int method()
 *   	{
 *   		return (int)10.5; ==> 오루발생
 *   	}
 *  	==> int a=method(); // 넘겨주는 값과 받는 값이 일치되어야 한다. int형태로 동일하게 해야함.
 *  	==> method() 
 *  
 *  	double method()
 *  	{
 *  		return 10;
 *  	}
 *  	==> double d=method()
 *  	==> 결과값을 받아서 처리
 *  	ex) 오라클에서 데이터를 읽기 
 *  	----------------------
 *  	=> 브라우저로 보낸다.
 *  => 자바 : 데이터관리
 *  => 자바스크립트 : 이벤트 처리 (브라우저)
 *  
 *  
 *  
 *  	int[] method()
 *  	{
 *  		int[] arr={1,2,3,4,5}
 *  		return arr; // 배열주소만 남겨준다.
 *  	}
 *  
 *  	==> int[] arr=method()
 *  	String method()
 *  	{
 *  		return "";
 *  	}
 *  	==> String s=method()
 *  
 *  	2) 결과값이 없는 경우 
 *  	   	void method()
 *  		----
 *  		{
 *  			return; // 메소드 종료
 *  		}
 *  		{
 *  			void method() // 
 *  		}	
 *  	내 폴더에 없는 것은 전부다 import를 찍어서 와야한다.		
 *  	=> import 추가
 *  	   import java.lang => 자동 추가
 *  			  System
 *  			  String
 *  			  Math
 *  			  ------
 *  		==> method()
 *  
 *  	= 메소드명 => 	식별자와 동일
 *  				길이의 제한이 없다 => 의미를 부여
 *  				aaa() , bbb() , ccc()
 *  				getName() , getTitle()
 *  				setName() ...
 *  	= 매개변수 
 *  
 *  
 *  
 * 	= 메소드명
 * 	= 메게뱐수
 */	




import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class 문제 {
	
	static void method1() 
	{
		System.out.print("0~32767까지의 정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int input=scan.nextInt();
		int[] binary=new int[16];
		int index=15;
		while(true)
		{
			binary[index]=input%2;
			input=input/2;
			if(input==0)
				break;
			index--;
		}
		for (int i = 0; i < binary.length; i++) 
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
				System.out.print(binary[i]);
		}
		
		
		
		// [API풀이] System.out.println(Integer.toBinaryString(input));
	}
	
	
	static void method2()
	{
		int arr[]=new int[5];
		int temp = 0;
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				arr[i]=(int)(Math.random()*100)+1;
				if(arr[i]>arr[j])
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	
	static void method3()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력");
		int year=scan.nextInt();
		if((year%4==0 && year%100!=0)||(year%400==0))
			System.out.println(year+"년도는 윤년입니다");
		else
			System.out.println(year+"년도는 윤년아닙니다.");
	}
	
	
	
	public static void main(String[] args) {
		method1();
		System.out.println();
		method2();
		System.out.println();
		method3();
		
		
		
	}
}
