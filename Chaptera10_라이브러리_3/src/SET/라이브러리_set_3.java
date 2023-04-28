package SET;

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 라이브러리_set_3 {
	// 모든 데이터는 메모리 안에 있다.
	// 영구적을 저장되어야 한다.
	// 
	public static Set GeniueMusic()
	{
		Set set=new HashSet(); // HashSet은 순서가 없어서 무작위 추출된다
		//ArrayList는 순서가 있어서 순서대로 출력된다. 
		try {
			for (int i = 0; i <=2; i++) 
			{
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
				Elements title=doc.select("table.list-wrap a.title");
				for (int j = 0; j < title.size(); j++) 
				{
					System.out.println(title.get(j).text());
				}
			}
		}catch(Exception e){}
		return set;
			
	}
	
	
	public static Set MelonMusic()
	{
		Set set=new HashSet();
		try
		{
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("div.wrap_song_info div.rank01 a");
			// a태그를 가지고 와라 
			// <a></a> 하이퍼링크를 걸어주는 태그입니다. 
			// href 클릭시 이동 할 링크이다.
			//System.out.println(title);
			for (int i = 0; i < title.size(); i++) 
				//title의 갯수만큼 계속해서 반복해라
			{
				System.out.println(title.get(i).text());
				// title의 갯수를 한 개씩 계속 얻어와라 
			}
		}catch(Exception ex) {}
		return set;
	}
	
	
	public static void main(String[] args) 
	{
		// MelonMusic();
		//System.out.println(genie);
	
	//지니읽기	
		Set geine=GeniueMusic();
		System.out.println(geine);
		
		System.out.println("==============멜론과 지니 경계선============");
		
	//멜론 읽기
		Set melon=MelonMusic();
		System.out.println(melon);
		
		System.out.println("===========지니뮤직 차집합===========");
		
	//지니뮤직에만 있는 노래 찾기 // 차집합
		//removeAll = 차집합 
		geine.removeAll(melon);
		// melon과 geine뮤직 중에 geine뮤직에 겹치는 내용을 전부 다 출력해줘
		for (Object obj : geine) 
		// geine 뮤직을 Object클래스로 만들어줘 
		// 앞쪽에 geine뮤직에서 차집합된 값만 가지고 온다.
		{
			System.out.println(obj.toString());
		};
		
	//멜론뮤직 있는 교집합만 가지고 오기
		//retainAll = 교집합
		melon.retainAll(geine); // retain 교집합 
		System.out.println("멜론과 지니뮤직의 동일한 곡이 몇?"+melon.size());
		for (Object obj : melon) 
		{
			System.out.println(obj.toString());
		}
	
	//set은 중복이 없다
	//차집합을 구할수도 교집합을 구할 수도있다.
		
		
		



	}
}
