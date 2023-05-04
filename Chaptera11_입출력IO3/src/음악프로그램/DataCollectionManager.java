package 음악프로그램;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.*;
import java.net.*;
/*
 <table class="list-wrap">
                ***전체적인 정보는 전부다 여기에 저장되어 있다.
                *** list-wrap에 들어있는 정보중에 필요한 정보를 가지고 와라 = 크롤링    
                        <tbody>
                        
                            <tr class="list" songid="101268096">
                                <td class="check"><input type="checkbox" class="select-check" title="I AM"></td>
                                <td class="number">1
                                        
                                    <span class="rank">
                                        
                                            
                                            
                                                <span class="rank"><span class="rank-none"><span class="hide">유지</span></span></span>
                                            
                                            
                                            
                                        
                                    </span>
                                </td>
                                <td><a href="#" class="cover" onclick="fnViewAlbumLayer('83665559');return false;"><span class="mask"></span>***<img src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/083/665/559/83665559_1681116738103_1_140x140.JPG/dims/resize/Q_80,0" onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';"***[이미지] alt="I've IVE"></a></td>
                                <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo('101268096');return false;">곡 제목 정보 페이지</a></td>
                                <td class="info">
                                    
                                    
                                    <a href="#" class="title ellipsis" title="재생" onclick="fnPlaySong('101268096','1');return false;">                                            
		I AM</a> 
	<a href="#" class="artist ellipsis" onclick="fnViewArtist('81271496');return false;">IVE (아이브)</a>
                                        
	<div class="toggle-button-box">
	<button type="button" class="btn artist-etc" onclick="fnRelationArtistList('101268096');">외</button>
	<ul class="list" id="RelationArtist_101268096"></ul>
	</div>
                                        
                                        <i class="bar">|</i>
                                        <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('83665559');return false;">I've IVE</a>
                                </td>
 */
public class DataCollectionManager {
	public static void main(String[] args) {
		
		List<GenieMusicVO> list=new ArrayList<GenieMusicVO>();
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try
		{
			fos=new FileOutputStream("c:\\java_datas\\genie_music.txt");
			oos=new ObjectOutputStream(fos);
			// 사이트 연결 
			String[] urls= {
				"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0100",
				"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0200",
				"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0300",
				"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0107",
				"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0500",
				"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0600",
			};
			/*
				private int no;
				private String title;
				private String singer;
				private String album;
				private String poster;
				private int idcrement; // 등폭
				private String state; // 유지, 상승, 하강
				private int cno; // 구분자
				private String key; // 동영상
			 */
			int k=1; // 고유번호 
			for (int i = 0; i < urls.length; i++) 
			{
				Document doc=Jsoup.connect(urls[i]).get();
				Elements title=doc.select("table.list-wrap td.info a.title");
				//table안에 있는 것중에 노래 제목을 가지고 와라 
				Elements single=doc.select("table.list-wrap td.info a.artist");
				Elements album=doc.select("table.list-wrap td.info a.title");
				Elements poster=doc.select("table.list-wrap a.cover img");
				Elements etc=doc.select("table.list-wrap span.rank");
				
				for (int j = 0; j < title.size(); j++) 
				{
					System.out.println("고유번호:"+k);
					System.out.println("카테고리번호:"+i);
					System.out.println(title.get(j).text());	
					System.out.println(single.get(j).text());	
					System.out.println(album.get(j).text());	
					System.out.println(poster.get(j).attr("src")); // 속성값 attr이라고 한다.
					String ss=etc.get(j).text();
					String state="";
					String id=""; // 등폭 
					if(ss.contains("유지"))
					{
						state="유지";
						id="0";
					}
					else if(ss.contains("new"))
					{
						state="NEW";
						id="0";
					}
					else
					{
						state=ss.replaceAll("[0-9]", ""); // 상승만 가지고온다. 
						id=ss.replaceAll("[가-힣]", ""); // 4
					}
					
					System.out.println("상태:"+state);	
					System.out.println("등폭:"+id);
					System.out.println("동영상:"+youtubeKeyData(title.get(j).text()));
					System.out.println("======================");
					
					GenieMusicVO vo=new GenieMusicVO();
					vo.setNo(k);
					vo.setCno(i+1);
					vo.setTitle(title.get(j).text());
					vo.setTitle(single.get(j).text());
					vo.setTitle(album.get(j).text());
					vo.setTitle(poster.get(j).attr("src"));
					vo.setTitle(state);
					vo.setIdcrement(Integer.parseInt(id));
					vo.setKey(youtubeKeyData(title.get(j).text()));
					list.add(vo);
					k++;
				}
			}
			
			oos.writeObject(list);
			System.out.println("저장 완료!!");
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally 
		{
			try
			{
				fos.close();
				oos.close();
			}catch(Exception ex) {}
		}
	}
	public static String youtubeKeyData(String title)
	{
		String key="";
		try
		{
			String url="https://www.youtube.com/results?search_query=" + URLEncoder.encode(title, "UTF-8");
			Document doc=Jsoup.connect(url).get();
			String data=doc.toString();
			Pattern p = Pattern.compile("/watch\\?v=[^가-힣]+");
			//페이지소스보기를 보면 한글은 없고 특수문자,영어,숫자로만 구성되어 있다. 그러므로 한글을 제외하고 가져와라 
			Matcher m=p.matcher(data);
			while(m.find())
			{
				String s=m.group();
				s=s.substring(s.indexOf("=")+1,s.indexOf("\""));
				key=s;
				break;
			}
					
			
		}catch(Exception ex) {}
		return key;
		
	}
}




















