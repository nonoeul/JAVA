package 영화_movie;

import java.util.*;
import java.io.*;
import java.security.PublicKey;

public class MovieSystem 
{
	private static ArrayList list=new ArrayList(); // 모든 사람들이 동일한 데이터를 사용해야한다.
	// static변수로 가야한다. 데이터모음은 전부 다 static모음이다. 배열, 데이터 등 모든 정보는 static
	static
	{
		try
		{
			// 파일읽기
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0; // 한글자 읽기 => A => 65
			StringBuffer sb=new StringBuffer(); // sb변수를 선언 StringBuffer로 생성자까지 생성
			while((i=fr.read())!=-1) // fr파일 읽는게 마지막까지 읽다가 더 이상 읽을게 없으면 -1이되는데 -1되면 그만
			{
				sb.append((char)i); // sb추가해라 char= 한글자씩 // FileReader은 char 한글자씩 읽어온다.
			}
			fr.close(); // FileReader로 파일을 읽어오기 위해 파일을 열었으면 그 다음은 무조권 닫아야한다.
			
			System.out.println(sb.toString()); // 영화값 출력하가ㅣ
			String[] movies=sb.toString().split("\n"); // movies를 배열로 묶어서 나눠준다음 
			
			for (String m : movies)  //m이 한줄이다. m이라는 string문자열을 반복해라
			{
				StringTokenizer st=new StringTokenizer(m,"|"); // st를 m에 |단위로 나눠라
				/*
				1
				|쇼생크 탈출
				|드라마
				|https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2
				|팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)
				|2016 .02.24 재개봉, 1995 .01.28 개봉
				|15세 관람가
				|프랭크 다라본트
			 */
				//이것을 하나씩 나눠라는 의미이다.
				MovieVO vo=new MovieVO();	// MovieVo 클래스를 vo 변수에 선언하고 생성자까지 생성 
				
				vo.setNo(Integer.parseInt(st.nextToken()));
				vo.setTitle(st.nextToken());
				vo.setGenre(st.nextToken());
				vo.setPoster(st.nextToken());
				vo.setActor(st.nextToken());
				vo.setRegdate(st.nextToken());
				vo.setGrade(st.nextToken());
				vo.setDirector(st.nextToken());
				// nexToken은 다음 토큰을 가지고 오는거다.
				list.add(vo); // list에다가 vo를 계속해서 추가해라 반복저그올 
			}
		}catch (Exception e) {
	}
}
	
//메뉴보기
	public int movieMenu()
	{
		System.out.println("=======영화메뉴=======");
		System.out.println("1. 목록출력");
		System.out.println("2. 상세보기");
		System.out.println("3. 영화검색");
		System.out.println("9. 시스템 종료");
		System.out.println("==================");
		Scanner scan=new Scanner(System.in);
		System.out.println("메뉴선택");
		return scan.nextInt();
	}

//목록 출력 (페이지)
	public ArrayList movieListData(int page)
	{
		int totalpage=(int)(Math.ceil(list.size()/10.0));
		// size()=1938 총 1938페이지에서 10을 나눠서 반올림한다 193.8=1941! totalpage=104
		// totalpage을 설정해서 ceil반올림하는데 list.size 리스트의 갯수의 10을 나눠서 반올림해서 구해라 
		int start=(page-1)*10;
		// 0, 10, 20, 30, 40
		int end=page*10;
		// 0~10, 10~20, 20~30
		if(page==totalpage)
		{
			end=(page*10)-(10-list.size()%10);
			// 1938개인데 맨 10 단위로 나눴을때 마지막은 8개이다
			// 근데 8개밖에없는데 9개를 달라고 하면 오류가 발생ㅎ낟
			// 그래서 마지막에 오류가 발생했을때를 처리해줘야한다. 
		}
		ArrayList movieList=new ArrayList(list.subList(start, end));
		return movieList; // 위에다가 ArrayList movieListData에 있는 intpage에 movieList값을 리턴해라 
		
	}
//상세보기
	public MovieVO movieDetailDate(int no)
	{
		return (MovieVO)list.get(no-1);
		// 영화는 1번인데 인덱스번호는 0번부터 가지고 있으므로 1을 빼야하낟
		// get.no는 no는 번호를 가지고 오는 것은 영화번호는 1번부터이다
	//** 주의 라이브러리 list는 거의 다 Object 객체를 가지고 있다 그러다보니
	//	 리턴형이 Object인데 리턴받아야 하는 값 int이므로 MovieVo로 형변환을해주고 해야하낟.
	// 	 제네릭를 사용해주면은 리턴형 자체를 바꿔주고 들어가기 떄문에 제네릭을 통해 형변환을
	//		한번에 하고 들어갈 수 있따. 매우 좋다!! 데이터형이 안맞으니깐 형변환을 계속 하기
	//	불편하니깐 제네릭스를 써서 한 번에 형변환을 해주고 리턴까지 한번 에 하게 해준다. 
	}
	
	
//영화검색
	
//조립 
	public void process()
	{
		while(true)
		{
			int menu=movieMenu();
			if(menu==9)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==1)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("페이지 입력:");
				int page=scan.nextInt();
				ArrayList mList=movieListData(page);
				// mList에만 8개가 들어갈 것이다.
				for (int i = 0; i < mList.size(); i++)
				// mList보다 작다면 
				{
					MovieVO vo=(MovieVO)mList.get(i);
				//mList는 Object의 객체를 상속받고 있는데 Object객체에는
				//아무런 데이터가 들어있지 않다. 그래서 MovieVO로 형변환을 해서 
				//MovieVo의 데이터를 받아올수 있게 해준다.
				//get(i) 해당하는 인덱스번호를 가지고 올 수 있게 해준다. 
					System.out.println(vo.getNo()+"."+
				vo.getTitle());
				}
			}
			else if(menu==2)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("상세볼 영화번호 입력(1~1938):");
				int no=scan.nextInt();
				MovieVO vo=movieDetailDate(no);
				System.out.println("==== 상세보기 ====");
				System.out.println("순위:"+vo.getNo());
				System.out.println("영화명:"+vo.getTitle());
				System.out.println("감독"+vo.getDirector());
				System.out.println("출연"+vo.getActor());
				System.out.println("장르"+vo.getGenre());
				System.out.println("개봉일"+vo.getRegdate());
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
