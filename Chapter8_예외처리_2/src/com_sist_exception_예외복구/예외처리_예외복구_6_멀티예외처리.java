package com_sist_exception_예외복구;
/*
 *	getMessage()	  => 에러에 대한 메서지ㅏ만 전송
 *		=> 에러에 대한 숙달 
 *	printStackTrace() => 실행하는 과정 => 어디에서 에러가 발생했는지를 확인한다.  
 * 	-----------------
 * 
 * 	=> 오라클을 연결했다고 했을 때 게시판을 만들었을때 
 * 
 * 
 */
public class 예외처리_예외복구_6_멀티예외처리 {
	public static void main(String[] args) {
		try
		{
			int[] arr=new int[100];
			arr[100]=100;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.err.println(e.getMessage()); // 권장사항
//			System.out.println(e.getMessage();
//			out으로도 getMessage를 출력할 수 있지만 getMessage는 err로 출력해야한다.
//			err이 적합한 출력방법으로 out으로 getMessage를 출력하게되면 오류가 발생된다.
//			
		}
		
	}
}
