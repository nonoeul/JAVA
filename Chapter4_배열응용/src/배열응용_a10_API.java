import java.util.Arrays;

public class 배열응용_a10_API {
	public static void main(String[] args) {
		int[] arr=new int[5];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
			System.out.println("=== 정렬전 ===");
			System.out.println(Arrays.toString(arr));
			
			System.out.println("=== 정렬후(ASC) ===");
			Arrays.sort(arr); // API.정렬을 해준다. //ASC만 된다.
			System.out.println(Arrays.toString(arr));

			System.out.println("=== 정렬후(DESC) ===");	
			for (int i=arr.length-1;i>=0;i--) // -로 해서 DESC정렬한다
			{
				System.out.print(arr[i]+" ");
			}
	}
}
