package com.sist.main3;

import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeniueMusicSystem {
	protected static Music[] musics=new Music[50]; // 모든 사람들에게 공유를 하겠다.
	protected String title="지니뮤직 Top50";
	
	
	// static 공유변수 
	
	//1. 초기화
	/*
	 *	인스턴스 블록
	 *	static 블록	// 초기화를 할 때 우리가 호출하는 방법이 2개가 있다.
	 *				// static같은 경우는 메모리에 할당되므로 자동으로 호출이된다. 생성자가 필요없다.
	 *				// 생성자를 만들어서 호출할지, static을 만들어서 호출 할지 
	 *	-------------------자동 호출 
	 *	생성자 	
	 *
	 *	예외처리
	 *	-------
	 *	   |
	 *	  에러 => 소스상에서 처리 할 수 없는 심각한에러 
	 *			 메모리 공간 부족 , 심각하다!!!
	 *	  예외 => 수정이 가능한 오류, 가벼운 에러이다. 가볍다!!, 예외
	 *	      => 예외복구 / 예외회피, 둘 중에 하나를 선택, 피해갈거냐 선택할거냐  
	 *		  => 비정상 종료를 방지하고 정상 수행이 가능하게 한다. 
	 *		예외에러 예시) 파일, 경로명, 파일명등.. 파일,경로명,파일명 정도는 쉽게 수정이 가능하다.
	 *					사용자가 잘못 입력했을 떄 에러 발생 띠용띠용!! 
	 *
	 *
	 */
	static 
	{
		try
		{
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			// Document는 문서를 저장하는 공간이다. doc은 웹 url안에 있는 웹정보를 가져와준다 html,css
			// 이것을 웹크롤링이라고 한다. 웹사이트 데이터를 가지고 오는 라이브러리 =Jsoup
			/*
			 * 	HTML	 => tag <> => Markup language
			 *  <a>값</a>
			 * 	Element	 => tag
			 * 	Elements =>	같은 태그 여러 개를 모아준것 
			 */
			// 노래명 <table class="list-wrap">
			// 구분자 => 모든 태크 class / id 
			Elements title= doc.select("table.list-wrap td.info a.title");
			
			//가수명
			Elements singer=doc.select("table.ist-wrap td.info a.artist");
			
			//앨범명
			Elements album=doc.select("table.list-wrap td.info a.albumtitle");
			
			Elements etc=doc.select("table.list-wrap td.number span");
			System.out.println(etc);
			
			for (int i = 0; i < musics.length; i++) 
			{
				System.out.println("노래명"+title.get(i).text()+ " "+singer.get(i).text());
				System.out.println("가수명"+title.get(i).text()+ " "+singer.get(i).text());
				System.out.println("앨범:"+title.get(i).text()+ " "+singer.get(i).text());
				System.out.println("등폭:"+title.get(i).text()+ " "+singer.get(i).text());
				String s=etc.get(i).text();
				String value="";
				if(s.equals("유지"))
						{
							state="유지";
							value="0";
						}
				else
				{
					state=s.replaceAll("[0-9]", "");
					value=s.replaceAll("[가-힝]", "");
					/*
					 * split
					 * replaceAll
					 * -----------정규식(한글형태)
					 * 
					 */
					
				}
				System.out.println("상태"+state);
				System.out.println("등록"+value);
				System.out.println("======================");
				
				musics[i]=new Music();
				musics[i].setRank(i+1);
				musics[i]=setTitle(title.getset(i);
				musics[i]=new Music();
				musics[i]=new Music();
				musics[i]=new Music();
				musics[i]=new Music();
		
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		// 문법이다 jsoup은 try/catch을 쓰지 않으면 오류가 발생한다.
		// 반드시 사용해야돼는 예외가 존재하기 떄문이다. 
		// 자바내에서 url을 입력하면 파일 경로명, 파일명등에 에러가 발생할 수 있어 예외처리를 해주고 가야한다.!! 
			// TODO: handle exception
		}
		
	
			
	
	// 2. 기능 (어떤 기능) ==> 메소드 
	public Music[] musicAllData()
	{
		return musics;
	}

	// 2-1. 목록 출력 
	public Music[] musicTitleFind(String fd,int type)
	{
		int i=0;
		for(Music m:musics)
		{
			boolean bCheak=false;
			if(type==1) 
			{
			bCheak=m.getTitle().contains(fd);
			}
			else
			{
				bCheak=m.getSinger().contains(fd);
				i++;
			}
		Music[] mm=new Music[i];
		// 찾은 갯수를 넘겨주는 것이다. 몇 개를 찾았는지 넘겨주는 것 
		}
		
		
		/*
		 * 	A a=new 
		 * 
		 * 
		 */
		i=0;
		for(Music mm:musics)
		{
			boolean bCheak=false;
			if(type==1) 
			{
			bCheak=mm.getTitle().contains(fd);
			}
			else
			{
				bCheak=mm.getSinger().contains(fd);
			}
			if(bCheak==false)
			{
				mm[i]=m;
				i++;
			}
		}
	
	/*
	 * 	결과값을 전송? : 리턴형 존재 
	 * 	자체 출력 : void 
	 * 	== 서버창에서 출력한다. // 웹에서는 void가 거의 없다. 
	 * 	== 
	 */
	
	// 2-2. 검색
	/*
	 * 
	 */
	
	public static void main(String[] args) {
		GeniueMusicSystem g=new GeniueMusicSystem();
		Music[] aa=g.musicTitleFind("사", 1);
		for (Music a:aa) 
		{
			System.out.println(a.getSinger());
		}
		
	}
}
		
	
	
	
	









