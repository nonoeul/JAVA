package exam;

import java.util.Scanner;

public class Membersystem {
	static Member[] members=new Member[10]; // Member의 변수의 크기를 결정해준다. 변수이 크기만 결정되어 있고 값은 할당 x, null로 들어가 있다.
	static int index=0; // Member 배열은 1번 2번.. 3번 이런식으로 증가하면서 값이 할당되어야 하는데 이 순서값을 할당하기 위해 index변수를 지정해준다. 
	// Usermain에서 배열의 크기 즉 배열의 순서를 알아서 순서에 맞게 출력하기 위해서는 index번호와 배열읰 크기를 공유해줘야 한다. 그렇기 떄문에 
	// static 정적변수를 통해서 공유해줘서 다른 클래스에서 사용할 수 있게 공유변수를 만들어줘야 한다,. 
	// 한 개의 정보를 공유해줘여 한다 = static // 따로따로 써야한다 각각의 값을 작성해줘서 넣어줘야 한다 = instance
	
	public void join()
	{	
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디, 이름, 성별 입력(hong 홍길동 남자):");
		members[index]=new Member(); // 주소를 할당한다. 
		members[index].setId(scan.next());
		members[index].setName(scan.next());
		members[index].setSex(scan.next());
		index++;
	}
		public void print()
		{
			for(Member m:members)
			{
				if(m!=null)
				{
					System.out.println(m.getId()+" "+m.getName()+" "+m.getSex());
				}
			}
		}
	}
	

