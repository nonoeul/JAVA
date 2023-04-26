
public class 문제2_1 {
	public static void main(String[] args) {
		
		for (int i = 0; i <=3; i++) 
		{
			for (int j = 0; j <=3; j++) 
			{
				// i=1 j=1,2,3
				// i=2 j=1,2,3
				// i=3 j=1,2,3
				if(j==2) // (1차) i-포문을 그대로 돌아온다 / (2차) j-포문에서 2개 제어된다.
					break; 
				System.out.println("i="+i+",j="+j);
			}
		}
		
		
		
		
		
	}
}
