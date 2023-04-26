import java.util.Arrays;
import java.util.Iterator;

/*
 * 
 *	  리턴형   매개변수
 * 1.	O		O
 * 2.	O		X
 * 3. 	X		O
 * 4. 	X		X
 * -----------------
 * 1) 2단 ~ 9단까지 구구단을 출력 (4)
 * 	static void gugudan()
 * 	{
 * 	}
 * 
 * 2) ID,PWD를 받아서 로그인이면 true, false (1)
 * 	static boolean isLogin(String id,String pwd)
 * 
 * 3) 검색어를 입력받아서 검색된 노래명을 출력 (3) 
 * 	static void find(String fd)
 * 	=> 검색어를 입력받아서 검색된 노래명등을 받아서 출력해라
 * 
 * 	static String[] find(String fd)
 * 
 * 4) 5개의 정수를 넘겨주고 정렬된 정수를 받는다.
 * 	static (int[]) sort(int a, int b, int c, int d,int e)
 * 	// 리턴형이 배열형[]으로 한 번에 넘길 수 있다.
 * 	static (int[]) sort(int[] arr)
 * 	// 이런 식으로 데이터를 배열형탤 묶을 수 있다. 
 *  // 결과값이 여러 개일 경우에는 배열을 이용한다.
 * 	
 * 
 * 
 */
// 6개의 난수를 발생해서 => 전송을 받은 다음 => 총합 , 평균을 구해라 

public class 메소드_4_랜덤 {
	
	static int[] rand()
	{
		int[] arr=new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	
	//최대값
	static int max(int[] arr)
	{
		int m=arr[0];
		for (int a:arr) 
		{
			if(m<a)
				m=a;
		}
		return m;
	}
	
	//최솟값
	static int min(int[] arr)
	{
		int m=arr[0];
		for (int a:arr) 
		{
			if(m>a)
				m=a;
		}
		return m; // 아래에서 바로 출력만 한다면 void로 받아도 된다.
	}			  // void 리턴값이 없다. 
	
	// 프로세스
	static void process()
	{
		int[] arr=rand();
		int total=0;
		for (int a:arr)
		{
			total+=a;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총합:"+total);
		System.out.printf("평균:%.2f\n",total/(double)arr.length);
		System.out.println("최대값:"+max(arr)); 
		// 만약 최솟값 min의 값의 변동을 줘야 한다면?
		// max와 min의 변수를 만들어줘야 한다.
		int min=min(arr);
		int max=max(arr);
		// 출력만 한다면 int max=max(arr)이런 식으로 변수를 만들지 않고
		// 바로 ("최솟값:"+min(arr))이런식으로 바로 사용가능하지만
		// 입력 후 값을 활용해서 출력한다면 변수를 생성해야 한다.
	
		System.out.println("최솟값:"+min);
		System.out.println("최대값과 최솟값의 차는 "+(max-min));
	}
	
	public static void main(String[] args) {
		
		process();
		
	}
}

















