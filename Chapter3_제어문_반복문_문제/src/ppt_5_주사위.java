import java.util.Iterator;

public class ppt_5_주사위 {
	public static void main(String[] args) {
		for (int i = 0; i <=6; i++) 
		{
			for (int j = 1; j <= 6; j++) {
				if(i+j==6)
					System.out.println(i+"+"+j+"="+(i+j));
			}
		}				
	}
}
