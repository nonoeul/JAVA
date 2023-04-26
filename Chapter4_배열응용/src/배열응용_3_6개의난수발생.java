import java.util.Arrays;

// 6개의 난수 발생 => 1~45 => 중복된 수가 발생
// 중복된 수를 없애야한다.!!
public class 배열응용_3_6개의난수발생 {
	public static void main(String[] args) {
		
		int[] lotto=new int[6];
		for (int i = 0; i < lotto.length; i++) 
		{
			lotto[i]=(int)(Math.random()*45)+1;
				for (int j = 0; j < i; j++) 
				{					
					if(lotto[i]==lotto[j])
					{
						i--; // 중복이 나오면 i을 더했던 것을 1을 빼고 
							 // for문을 다시 돌리라는 의미이다.
						break;
					}
				}
		}
			System.out.println(Arrays.toString(lotto));
			
	}
}
