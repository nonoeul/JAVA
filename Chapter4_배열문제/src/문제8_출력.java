import java.util.Arrays;

public class 문제8_출력 {
	public static void main(String[] args) {
		
	int[] arr=new int[5];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i]=(int)((Math.random()*10)+1);
	}
		System.out.println(Arrays.toString(arr));
	
System.out.println("================");
	
	char[] arrc=new char[10];
	
	for (int i = 0; i < arrc.length; i++) {
		arrc[i]=(char)((Math.random()*26)+65);
		
		}
		System.out.println(Arrays.toString(arrc));
		
System.out.println("================");
	
	int[] arr2=new int[10];

		for(int i = 0; i < arr2.length; i++)
		{
			arr2[i]=(int)((Math.random()*10)+1);
		}
		System.out.print(Arrays.toString(arr2));
		System.out.println();
		System.out.println("세번쨰: "+arr2[2]);
		System.out.println("다섯번쨰: "+arr2[4]);
		System.out.println("마지막번쨰: "+arr2[9]);
	
System.out.println("================");

	int[] arr3=new int[10];
	int max=0;
	for(int i = 0; i < arr3.length; i++)
	{
		arr3[i]=(int)((Math.random()*10)+1);
		if (max>arr3[i])
	
	}
	
	System.out.print(Arrays.toString(arr3));
	System.out.println();
	
	System.out.println("제일 큰 값: "+arr3);



	
	}
}






















