
public class 배열_1_배열을안쓰면 {
	public static void main(String[] args) {
		int a1=(int)(Math.random()*100)+1;
		int a2=(int)(Math.random()*100)+1;
		int a3=(int)(Math.random()*100)+1;
		int a4=(int)(Math.random()*100)+1;
		int a5=(int)(Math.random()*100)+1;
		
		int a6=(int)(Math.random()*100)+1;
		int a7=(int)(Math.random()*100)+1;
		int a8=(int)(Math.random()*100)+1;
		int a9=(int)(Math.random()*100)+1;
		int a10=(int)(Math.random()*100)+1;
		
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);
		System.out.println("a3="+a3);
		System.out.println("a4="+a4);
		System.out.println("a5="+a5);
		
		System.out.println("a6="+a6);
		System.out.println("a7="+a7);
		System.out.println("a8="+a8);
		System.out.println("a9="+a9);
		System.out.println("a10="+a10);
		
		// 만약 여기서 최대값 최솟값을 구하라고 하면 if변수가 18개가 필요
		
		int max=a1;
		
		if(max<a2)
			max=a2;
		if(max<a3)
			max=a3;
		if(max<a4)
			max=a4;
		if(max<a5)
			max=a5;
		if(max<a6)
			max=a6;
		if(max<a7)
			max=a7;
		if(max<a8)
			max=a8;
		if(max<a9)
			max=a9;
		if(max<a10)
			max=a10;
		
		System.out.println("최대값은"+max);
	}
}
