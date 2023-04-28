package SET;

import java.util.*;
public class 라이브러리_set_5 {
	public static void main(String[] args) {
		
		Set set=new HashSet();
		
		for (int i = 0; i < 10; i++) 
		{
			int r=(int)(Math.random()*100)+1;
			set.add(r);
		}
		//출력
		System.out.println(set);
		
		// 50보다 작은 수
		for (Object obj : set) 
		// 형변환을 시켜야한다. 왜냐하면 obj는 Object로써 형변환을 해줘서 int 값을 받을 수 있도록 해줘야 한다.
		{
			int a=(int)obj;
		// a는 int로 지정되어 있는데 obj는 Object로 되어있다. 그래서 
			if(a>50)
			{
				System.out.print(a+" ");
			}
		}	
		
		System.out.println();
		
		// 50보다 큰 수
		for (Object obj : set) 
		{
			int a=(int)obj;
			if(a<50)
			{
				System.out.print(a+" ");
			}
		}
		
		System.out.println("=================");
		//1. 정렬
		
		//2. 검색이 빠르다.
		TreeSet tSet=new TreeSet();
		for (int i = 0; i < 10; i++) 
		{
			int r=(int)(Math.random()*100)+1;
			tSet.add(r);
		}
		System.out.println(tSet);
		System.out.println("50보다 작은 수	"+tSet.headSet(50));
		System.out.println("50보다 큰 수	"+tSet.tailSet(50));
		
		
		
		
		// for문 돌려도 되지만 구지 for문을 돌릴 필요가 없다
		System.out.println("=========불필요한 for문===========");
		for (Object obj : tSet) 
		{
			int a=(int)obj;
			if(a>50)
				System.out.print(a+" ");
		}
		
		
	}
}
























