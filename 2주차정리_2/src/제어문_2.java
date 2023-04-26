import java.util.Arrays;

/*
 *		연산자, 제어문 ==> 형식 , 용도
 *		1) 형식  
 *		   초기값은 한 번만 수행 
 *						 
 *				1 ->  2 -> 3 
 *		   for(초기값;조건식;증가식)	// false이면 조건식2에서 종료
 *		   {
 *				반복 수행 문장		// true이면 반복수행문장에서 반복수행
 *		   }				true일떄
 *		 	초기값 => 조건식 ====> 반복수행문장일떄 ====> 증가식
 *					  |false(종료) / true이면 (반복수행)
 * 		= while = 파일 읽기할 떄 많이 쓰인다.
 * 		초기값 ======== 1 
 * 		while(조건문) = 2
 * 		{
 *			수행문장 
 *			증가식
 *		} 
 *
 * 		필요에 의해 반복문 제어
 * 		-----------------
 * 		break / continue
 * 		break => 반복문 중단할떄 사용 (조건)
 * 		----------------- 반복문 , switch
 * 		continue ==> 반복문에서만 사용 가능
 * 					 종료하는 것이 아니라 => 이동하는 것
 * 					 for => 증가식으로 이동 
 * 					 while => 조건식으로 이동 
 * 		** break / continue 아래에서는 소스코딩을 할 수가 없다.!!
 * 
 * 		주의점)
 * 			break.continue => 밑에는 소스 코딩이 불가능하다.
 * 			break.continue => 자신 소속 반복문만 제어한다.
 * 
 * 		for() -1
 * 		{
 * 			for() - 2
 * 			{
 * 				if{}
 * 					{
 * 					break,continue // if을 가지고 있는 for문만 제어, 2차for문 제어
 *	 		{	
 *		break,continue // 1차 for문에서 break,continue가 있다면 모든 for문에 적용된다.
 * 			
 * 		if()
 * 		------ 
 * 		if()
 *		------ 
 * 		if()
 * 		else
 * 		------
 *	
 *		
 * 
 * 
 */
public class 제어문_2 {
	public static void main(String[] args) {
		
//		int i=1;
//		while (i<=10)
//		{
//			if(i%2==0)
//			{
//				i++;
//				continue; // 1에세 계속 멈춰있다.// 무한루프 
//			}
//				System.out.println(i);
//				i++; // 1씩 더해줘야지 2가 되서 값이 증가한다. 
//		}
	
;		int[] arr= {1,2,3,4,5};
		System.out.println(arr); // arr주소
		System.out.println(Arrays.toString(arr)); // arr 배열값
		int[] arr2=arr;
		System.out.println(arr2); // arr=arr2 주소값이 동일하다.
		// 주소값이 동일하다는 것은 같은 메모리를 공유한다는 것이다.
		// 즉 arr1의 값이 바뀌면 arr2도 바뀌고 arr2의 값을 바꿔도 arr1의 값은 바뀐다.
		arr2[0]=10;
		System.out.println(arr[0]);
		
		int[] arr3=arr.clone(); // 주소갑이 다르다.
		// arr 크기의 새로운 배열을 만들어라 .
		System.out.println(arr3); // 주소값이 다르다. 다른 영역을 제어한다.
		// 주소애 의한 참조 == 메모리 주소를 이용해서 실제 데이터를 관리
		// 
		
		
		
		
		
		
	}
}






























