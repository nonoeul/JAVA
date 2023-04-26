//7개의 난수발생 중복안되게

public class 나만의배열세계2 {
	public static void main(String[] args) {
			
		int lotto[]=new int[7];
		int su=0;
		
		boolean bCheak=false;
		for (int i = 0; i < lotto.length; i++) 
		{
			bCheak=true;
			while(bCheak)
			{
				su=(int)(Math.random()*45)+1;
				bCheak=false;
				for (int j = 0; j < i; j++) 
				{
					if (lotto[j]==su)
					{
						bCheak=true;
						break;
					}
				}
			}
			lotto[i]=su;
		}
		System.out.println(su);
	}
}
