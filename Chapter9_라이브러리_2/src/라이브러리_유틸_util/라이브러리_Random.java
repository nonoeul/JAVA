package 라이브러리_유틸_util;
/*
 *	java.util => 프로그램 개발시 유용하게 사용될 수 있는 클래스의 집합
 * 		=> 반드시 import를 사용한다. (import java.util.*)
 * 		=> java.lang, java.util, java.io, java.net, java.text
 * 
 * 
 */
import java.util.Date;
import java.util.*;
public class 라이브러리_Random {
	public static void main(String[] args) {
		
//??util을 포함하고 있는 클래스??
//	1.Data/ Calender 날짜와 관련 날짜, 시간
		Date date = new Date();
        System.out.println(date); // 오늘 날짜 출력 
    
//	2.Random 난수 발생
        Random random = new Random();
        System.out.println(random.nextInt());
// 	3.Collection
		// List : 순서가 존재, 데이터 중복 허용  			Arraylist 
		 
		// set : 순서가 없다. 데이터 중복을 허용하지 않는다.  HashSet
		
		// Map : 순서가 없다. 저장시에 키, 값 => 동시에 저장 HashMap = 인페이스  
        
        // Arrays = 배열을 제어하는 기능
/*			배열 데이터출력 toString()
			sort : 정렬
			Arrays.asList() => 배열을 ArrayList로 변경
			
	Random => nextInt() => int범위에서 나온다.
			  nextInt(5)=> 	  0~4 
			  nextInt(101) => 0~100까지 사이의 난수를 발생한다.
			  nextInt(100)+1 => 1~100까지 
*/
        System.out.println("=========random=========");
        
    Random r=new Random();
    int a=r.nextInt(100)+1; // 100
    			//0~99까지 사이의 난수 발생
    System.out.println(a);
        
    int[] numbers=new int[10];
    	Random rr=new Random();
    	for (int i = 0; i < numbers.length; i++) 
    	{
			numbers[i]=rr.nextInt(100)+1;
		}
    	System.out.println("정렬전");
    	System.out.println(Arrays.toString(numbers));
    	System.out.println("정렬후(내림차순)");
    	Arrays.sort(numbers);
    	System.out.println(Arrays.toString(numbers));
    
    	
    	System.out.println("=========random=========");
		
//	4.StringTokenizer 문자/분리 (split)
        String str="this string includes default delims";
    	System.out.println(str);
    	System.out.println();
    		
    	System.out.println("==========using split method============");
    	String []tokens=str.split(" ");
    		
    	for(int i=0;i<tokens.length;i++){
    		System.out.println(tokens[i]);
    	}
	}
}
