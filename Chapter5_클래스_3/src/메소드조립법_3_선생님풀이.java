import java.util.Scanner;
public class 메소드조립법_3_선생님풀이 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] com=new int[3];
        int[] user=new int[3];
        for(int i=0;i<3;i++)
        {
        	com[i]=(int)(Math.random()*9)+1; //1~9
        	for(int j=0;j<i;j++)
        	{
        		if(com[i]==com[j])
        		{
        			i--;// 현재 저장된 데이터에 다시 난수 발생을 한다 
        			break;
        		}
        	}
        }
        //System.out.println(Arrays.toString(com));
        Scanner scan=new Scanner(System.in);
        // 사용자 입력 
        while(true)
        {
        	System.out.print("세자리 정수 입력:");
        	int input=scan.nextInt();
        	// 정상 입력 => && 
        	// 오류 => ||
        	if(input<100 || input>999)
        	{
        		System.out.println("잘못된 입력입니다!!");
        		//while의 조건식으로 이동 => 처음부터 다시 시작 
        		continue;
        	}
        	// 369
        	user[0]=input/100;// 369/100 => 3
        	user[1]=(input%100)/10;// (369%100) => 69/10 => 6
        	user[2]=input%10;
        	
        	if(user[0]==user[1]|| user[1]==user[2] || user[0]==user[2])
        	{
        		System.out.println("같은 숫자는 사용이 불가능합니다!!");
        		continue;
        	}
        	
        	if(user[0]==0 || user[1]==0 || user[2]==0)
        	{
        		System.out.println("0을 입력할 수 없습니다");
        		continue;
        	}
        	// 123 132
        	// 123 1S-2B
        	// 비교
        	int s=0,b=0;
        	// s= 같은 자리의 수가 동일 , b=다른 자리에 있는 수가 동일 
        	for(int i=0;i<3;i++)//com
        	{
        		for(int j=0;j<3;j++)//user
        		{
        		   if(com[i]==user[j])// 같은 수가 있는지 
        		   {
        			   if(i==j) // 같은 자리수면 
        				   s++;
        			   else //다른 자리수면
        				   b++;
        		   }
        		}
        	}
        	// 힌트
        	System.out.printf("Input:%d,\nResult:%dS-%dB\n",
        			input,s,b);
        	//종료 여부
        	if(s==3)
        	{
        		System.out.println("Game Over!!");
        		break;
        	}
        }
        
	}
}
