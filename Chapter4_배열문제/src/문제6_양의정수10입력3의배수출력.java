import java.util.Arrays;
import java.util.Scanner;


public class 문제6_양의정수10입력3의배수출력 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		int count=0;
	
		for (int i = 0; i < arr.length; i++) {
			int random=(int)((Math.random()*100)+1);
			
			if(random%3==0) {
				count+=1;
			System.out.print(""+random+" ");
			}
			
		}
			System.out.println();
			System.out.println("입력받은 3의배수 갯수:"+count);
			
		
		
	}
}