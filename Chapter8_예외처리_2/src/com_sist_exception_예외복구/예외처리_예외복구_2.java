package com_sist_exception_예외복구;
/*
 * 	** 예외를 수정하는 것이 아니다 => 에러 발생한 소스를 건너뛴다.
 * 	형식
 * 	** 
 * 		try 
 * 		{
 * 			문장1
 * 			문장2
 * 			문장3
 * 			try안에서 에러발생시에 에러난 위치부터 try끝까지는 수행하지 않는다. 
 * 			==================================================
 * 			catch로 이동하기 때문에 catch문장을 수행한다. 
 * 			
 * 		}catch{예외처리 종류가 들어간다.)
 * 		{
 * 			문장4
 * 		}
 * 		문장5
 * 		문장6
 * 		
 * 		??예외가 발생하는 상황??
 * 		checked exception은 예외처리가 되어있지 않으면 아예 컴파일 되지 않은 예외이다. // 컴파일이 안된다.
 * 		unchecked exception은 예외처리가 재량인 예외이다. // 예외처리를 해도되고 안해도 되고 
 * 		
 * 		??e.printStackTrace()??
 * 		예외처리를 수행하고 정상적으로 작동하고서도 추가적인 에러메세지를 띄울수 있다. 
 * 
 * 		??Exception e??
 * 		Exception은 예외처리의 최상위 개겣로 Exception은 모든 예외처리 에러를 잡을수 있따.
 * 		Exception e에서 e는 그냥 변수이다. 딴 것도 가능하다.e,e2,ex 다 가능하다 .
 * 		
 */
public class 예외처리_예외복구_2 {
	public static void main(String[] args) {
		System.out.println("문장1");
		System.out.println("문장2");
//		System.out.println("문장3"+(10/0)); // 비정상종료 ,
/*		에러가 발생하면 에러가 발생한 곳에서 강제종료가 된다 에러가 발생하더라도 
*		비정상종료를 막기위해서 예외처리를 사용해야 한다. !!
*/
		System.out.println("문장4");
		System.out.println("문장5");
		
		System.out.println("===============");
		
		System.out.println("문장1");
		System.out.println("문장2");
		try {
			System.out.println("문장3");
			System.out.println("문장4"); //
			int[] arr=new int[2];
			arr[2]=100;
			System.out.println("문장5:"+arr[2]);
			System.out.println("문장6");
			///////////////////////// => catch가 수행된다.
			// 예외와 예외처리를 하는 클래스 매칭을 잘해야한다. => 예측 
			// 발생할만한 에러를 잡아줘야 한다.
			// 예측을 할 때 멀티catch가 등장할 것이다. // 예상되는 에러가 무엇이 있는지 파악해야 한다. 
			}catch(ArrayIndexOutOfBoundsException e) // 계산오류 0으로 나누면 오류인데 에러를 예외처리해준다.
		{
				System.out.println("문장6:에러처리완료요 ");
				e.printStackTrace(); // 에러가 왜 발생했는지 알려준다. 
		}
			System.out.println("문장7");
			System.out.println("프로그램종료");
		
	}
}





























