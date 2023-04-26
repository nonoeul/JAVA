// 16비트 => 0,1 

import java.util.Scanner;
public class 배열_4_비트출력_index중요 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력");
		int input=scan.nextInt();
		// 저장공간 (0,1)
		int[] binary=new int[16]; 
		int index=15; // index가 가는 것은 수당을 할당하는 것
		// 뒤에서부터 채우기 떄문에 15
		// 15->14-13 ... index-- 1씩빼면서 자리를 이동해준다.
		while(true)
		{
			binary[index]=input%2;
			input=input/2;
			if(input==0)
				break;
			index--;
		}
		for (int i = 0; i < binary.length; i++) {
			if(i%4==0 && i!=0)
			{
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
		
		
		
	}
}
