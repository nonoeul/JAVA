
public class ppt_11_짝수의갯수 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=10;i++)
		{
			int num=(int)(Math.random()*100)+1;
			System.out.println("num:"+num);
			if(num%2==0)
				count++;
		}
		System.out.println("짝수의 갯수는"+count);
	}
}
