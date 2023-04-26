package 프로그램_만들기;
/*	프로그래밍 순서

 * 	1. VO  
 * 	2. DAO
 * 	3. 전송 (관련된 데이터를 묶어서 전송한다 VO)
 * 
 * 	VO => JSP => Bean (핵심 기능) 
 * 	
 * 
 */
import java.util.*;
import java.io.*;
public class SeoulSystem {
	private static SeoulLocationVO[] datas=new SeoulLocationVO[273];
	//모든 사용자가 데이터를 공통으로 사용 
	//들어가는 데이터가 모두 동일해야하기 때문에 static을 붙였다. 

/*전역변수
 현재페이지와 총페이지는 유지
 == 사라지면 안되는 변수 존재해야 한다. == 
 프로그램이 종료하면 사려져도 돼는 함수가 있고 프로그램이 종료되어도
 존재해야하는 변수들이 필요하다.
 */
	private int curpage; 	// 프로그램 종료시까지 유지한다.  
	private int totalpage; 	// 프로그램 종료시까지 유지된다.
	
	static 
	{
		//데이터를 읽어서 메모리에 저장해준다. => 초기화 
		try
		{
			StringBuffer sb=new StringBuffer();
			// StringBuffer sb=new StringBuffer()
			// sb에다가 StringButter로 객체를 만들고 StringBuffer()로 생성자까지 생성ㄹ해준것이다.
			int i=0; 
			// int i=0을 저장해준다. i값은 VO에 저장된 값의 순서를 -0으로 지정해준것이다. 
			FileReader fr=new FileReader("c:\\javaDev\\seoul_location.txt");
			//location 텍스트 파일을 읽어오는것이다.
			while((i=fr.read())!=-1)
			//fr.read는 이게 순서대로 쭉 읽다가 더이상 읽을게 업으면 i 값은 -1이 됀다
			// 즉 읽을 값이 없는 마지막 값까지전부다 읽었으면 끝내라 
			{
				sb.append(String.valueOf((char)i)); // i를 char형태로 바꾼 후에 valueof 문자열로 바꾼다.
				// sb파일은 읽어온 파일인데 거기다가 value = 값은 문자열로 바꿔주는 것이다 .
				
			}
			fr.close();
			//close는 gc가 알아서 메모리해제를 해주지만 close메소드를 통해서 자원을 그만 사용한다고 알려줄 수 있다.
			
			String[] locations=sb.toString().split("\n");
			int k=0;
			for (String s : locations) 
			{
				StringTokenizer st=new StringTokenizer(s,"|");
				// st를 StringTokenizer을 만든 것이다. st라는 것에다가 s: location을 |단위로 나눠라 
				datas[k]=new SeoulLocationVO();
				//Seoullcoationvo() 정보를 매개변수 없이 datas[k]의 정보를 만들어준다.
				datas[k].setNo(Integer.parseInt(st.nextToken()));
				// VO에 있는 getter/setter의 정보를 받아와준다,
				// No는 지금 int형이므로 parseInt로 받아와야 한다. 
				datas[k].setName(st.nextToken());
				datas[k].setContent(st.nextToken());
				datas[k].setAddress(st.nextToken());
				k++;
			}
			// k?? datas = 안에는 270개의 정보
			// datas[k] datas의 순서
			
		}catch(Exception ex) {}
	}
// 페이지별 데이터 출력
	public SeoulLocationVO[] seoulList(int page)
	{
		SeoulLocationVO[] data= new SeoulLocationVO[10];
		//data라는 변수를 SeoulLocationVO에서 데이터를 가져오고 생성자를 10개 만들어준다 10개 데이터 
		int j=0; // j번째는 10개씩 나눠주는 변수이다.
		// j는 10개씩 나눠줄 수 있께 해주는 것 j=0으로 지정 
		int start=(page*10)-10; // 시작점 어디부터 데이터가 돌지 추가해준다.
		/*
		 * 	1page = 0~9
		 * 	2page = 10~19
		 * 	3page = 20~29
		 */
		for (int i = 0; i < datas.length; i++) 
		{
			int k=0;
			if(j<10 && i>=start) // j가 10보다 작거나 j가 start보다 클 때 start가 10을 넘을때마다 1씩 늘어난다? 
			{
				data[k]=datas[i];
				k++;
				j++;
			}
		}
		return data;
	}
	
	public int seoulTotalPage()
	{
		return (int)(Math.ceil(datas.length/10.0));
	}
	
	
	
	
// 메뉴
	public int menu()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("=======메뉴=======");
		System.out.println("1. 목록 출력(페이지별)");
		System.out.println("2. 상세보기");
		System.out.println("3. 명소검색");
		System.out.println("4. 주소검색");
		System.out.println("===================");
		System.out.print("메뉴 선택");
		return scan.nextInt();
	}

// 검색 => 이름 
	public SeoulLocationVO[] nameFind(String fd)
	// SeoulLocationVo에 클래스에서 nameFind라는 메서드에 fd매개변수를 지정한다 fd는 내가 ㅇ입력한 값 
	{
		int count=0;
		// count = ㄴ가 검색하는 숫자를 찾을 수 있께 해준다. 
		for(SeoulLocationVO vo:datas)
		{
			if(vo.getName().contains(fd))
			{
				count++;
				//내가 검색한 fd의 이름이 getname에 포함되어 이쓴지
				//검색할 수 있게 만들어준다.
			}
		}
		
		// 고정 => 가변으로 변경 (컬렉션)
		SeoulLocationVO[] seoul=new SeoulLocationVO[count];
		
		int i=0;
		for(SeoulLocationVO vo:datas)
		{
			if(vo.getName().contains(fd))
			{
				seoul[i]=vo;
				i++;
			}
		}
		return seoul;
	}
	
	
// 주소검색	
	public SeoulLocationVO[] AddressFind(String addr)
	// SeoulLocationVo에 클래스에서 nameFind라는 메서드에 fd매개변수를 지정한다 fd는 내가 ㅇ입력한 값 
	{
		int count=0;
		// count = ㄴ가 검색하는 숫자를 찾을 수 있께 해준다. 
		for(SeoulLocationVO vo:datas)
		{
			if(vo.getAddress().contains(addr))
			{
				count++;
				//내가 검색한 fd의 이름이 getname에 포함되어 이쓴지
				//검색할 수 있게 만들어준다.
			}
		}
		// 고정 => 가변으로 변경 (컬렉션)
		SeoulLocationVO[] seoul=new SeoulLocationVO[count];
		
		int i=0;
		for(SeoulLocationVO vo:datas)
		{
			if(vo.getAddress().contains(addr))
			{
				seoul[i]=vo;
				i++;
			}
		}
		return seoul;
	}
//상세보기
	public void process()
	{
		System.out.println("★★★★★★★영화★★★★★★★");
		while(true)
		{
			int menu=menu();
			if(menu==9)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==3)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("검색어 입력:");
				String name=scan.next();
				SeoulLocationVO[] data=nameFind(name);
				System.out.println(name+"검색은 총"+data.length+"건입니다");
				for(SeoulLocationVO vo:data)
				{
					System.out.println(vo.getNo()+"."+vo.getName());
				}
			}
			
			else if(menu==4)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("검색어 입력:");
				String name=scan.next();
				SeoulLocationVO[] data=AddressFind(name);
				System.out.println(name+"검색은 총"+data.length+"건입니다");
				for(SeoulLocationVO vo:data)
				{
					System.out.println(vo.getNo()+"."+vo.getAddress());
				}
			}
			
			else if(menu==1)
			{
				Scanner scan=new Scanner(System.in);
				//scan만들고
				while(true)
				{
				System.out.print("페이지 입력(1~28): ");
				//페이지입력하려고 씌엊고
				curpage=scan.nextInt();
				//curpage
				if(curpage<1 || curpage>28)
				//curpage가 페이지에 없는 페이지가출력되면 ㅇ류
					{
					System.out.println("없는 페이지입니다");
					continue;
					// 계속해라 
					}
					break;
				}
				totalpage=seoulTotalPage();
				System.out.println(curpage+"page/"+totalpage+"pages");
				SeoulLocationVO[] data=seoulList(curpage);
				for(SeoulLocationVO vo:data)
				{
					if(vo!=null)
					{
					System.out.println(vo.getNo()+"."+vo.getName());
					}
				}
			}
			
			else if(menu==2)
			{
				Scanner scan=new Scanner(System.in);
				System.out.print("상세 볼 명소 번호 입력(1~273)");
				int no=scan.nextInt();
				System.out.println("번호: "+datas[no-1].getNo());
				System.out.println("명소: "+datas[no-1].getName());
				System.out.println("주소: "+datas[no-1].getAddress());
				System.out.println("소개: "+datas[no-1].getContent());
			}
			
			
		}
	}
	
	
//	public static void main(String[] args) {
//		SeoulSystem ss=new SeoulSystem();
//		for (SeoulLocationVO vo : datas) 
//		{
//			System.out.println(vo.getNo());	
//			System.out.println(vo.getName());	
//			System.out.println(vo.getAddress());	
//			System.out.println("=============");
	}
	















