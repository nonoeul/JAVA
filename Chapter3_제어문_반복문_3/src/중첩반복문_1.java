// 2차 for
/*
 *		중첩
 *		조건문
 *		if()
 *		{
 *			if()
 *			{
 *			}
 *		}
 *
 *		switch()
 *		{
 *			case 값:
 *				switch()
 *				{
 *				}
 *		}
 *		
 *		for()		=======> 줄수
 *		{
 *			for{}   =======> 출력 갯수
 *			{	
 *			}
 *		}
 * 
 * 		for(초기값;조건식;증감식) ==========> 줄수
 * 		{
 * 			for(초기값;조건식;증감식) ==========> 실제 출력물
 * 			{
 * 				반복 수행문장
 * 			}
 * 			다음줄로 내려준다.
 * 		}
 * 			(1)   (2)  (4)
 * 		for(초기값;조건식;증가식)
 * 		{
 * 			반복 수행문장(3) 
 * 		}
 * 		====> 2번에서 false ====> 1차 for문 증가식으로 이동
 * 		--------------------------------------------
 * 		다음줄로 내려준다.
 * }
 * 	
 * 
 * 
 * 		
 */
public class 중첩반복문_1 {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
        {
        	char c='A';
        	for(int j=1;j<=5;j++)
        	{
        		System.out.print(c++ +" ");
        	}
        	System.out.println();
        }	
	
	}
}












