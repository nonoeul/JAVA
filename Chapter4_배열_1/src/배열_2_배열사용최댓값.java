
public class 배열_2_배열사용최댓값 {
	public static void main(String[] args) {
		int[] arr=new int[20];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			System.out.printf("arr[%d]=%d\n",i,arr[i]);
		}
		int max=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("최대값"+max);
		
	}
}
