import java.util.Arrays;
import java.util.Scanner;

public class 메소드_1_1_난수 {
	// 사용자가 원하는 갯수만큼 난수 발생 (1~100)
		// 사용자 => 갯수 (매개변수)
		// 리턴형 => 배열 
		// 예약 가능한 날 / 예약 가능한 시간 
	
	static int[] rand(int count)
	{
		int[] arr=new int[count];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.print("난수 갯수 입력:");
		int count=scan.nextInt();
		int[] arr=rand(count);
//		int[] arr=메소드_1_1_난수.rand(count) // 앞에 클래스 이름 메소드_1_1_난수를 생략할 수 있다.
		// 메소드 호출 (메스드명(매개변수값)) => 자신의 클래스 (클래스명을 생략)
		// 다른 클래스에서 호출할 때는 클래스명, 메소드명(매개변수값)
		 
		System.out.println(Arrays.toString(arr));
	}
}
