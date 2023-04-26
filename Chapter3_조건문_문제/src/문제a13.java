import java.util.Iterator;

public class 문제a13 {
	public static void main(String[] args) {
		
		int sum=0;
		for (int i = 1; i < 5; i++) {
		if(i/2==0) {
			System.out.println(i);
			sum-=i;
		} else {
			System.out.println(i);
			sum+=i;
		}
		System.out.println(sum);
		}
	}
}	
