/*
 * 
 * 	for의 형식
 * 	for(초기값;조건식;증가식)
 * 	{
 * 		반복 실행 문장3
 * 	} 
 * 
 *  새로운 for문 // 새로운 for문을 만들면 위에 썻던 첫번쨰 
 *  for문의 i문을 다시 쓸 수 없다. i는 한 개의 for문 안에서만 사용가능
 *  괄호가 닫히는 순간 사라진다. 
 *  
 *  
 */

public class 문제8_2의배수의합 {
public static void main(String[] args) {
	
	int sum=0;
	for (int i = 0; i <= 100; i+=2) {
		sum+=i;
	}
		System.out.println("2의 배수의 합은:"+sum);
}
	
	
}
