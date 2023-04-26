import java.util.Iterator;

public class 문제a14_continue사용 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) 
		{
			if(i%3==0)
			continue;
			System.out.println(i);
		}
		
		
	}
}
