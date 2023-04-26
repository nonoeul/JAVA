import java.util.Arrays;

// 6개의 난수 발생 => 1~45 => 중복된 수가 발생
// 중복된 수를 없애야한다.!!
public class 배열응용_3_풀이_6개의난수발생2 {
	public static void main(String[] args) {
		
		int lotto[]=new int[10];
		int su=0; // 난수 저장
	
		boolean bCheck=false;
		for (int i = 0; i < args.length; i++) 
		{
			bCheck=true;
			while(bCheck)
			{
				su=(int)(Math.random()*45)+1;
				bCheck=false;
				for (int j = 0; j < i; j++) 
				{
					if(lotto[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			lotto[i]=su;
		}
		System.out.println(su);
			
	}
}
