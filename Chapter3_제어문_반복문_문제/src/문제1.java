
public class 문제1 {
	public static void main(String[] args) {
			
		int sum=0;
		int count=0;		
		
		for (int i = 100; i < 999; i++)
		{
			if(i%7==0)
			{
			sum+=i;
			count+=1;
			}
		}
			System.out.println("7의 배수 갯수는:"+count+"입니다");
			System.out.println("7의 뱌수의 합은:"+sum+"입니다");
			
	}
}
