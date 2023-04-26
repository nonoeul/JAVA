package com.sist.main3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MelonMusicSystem extends GeniueMusicSystem{
/*
 * 		GeninuMusicSystem을 static으로 작성하여 상속할 경우 두 개의 메모리가 동일해져
 * 		각각 GeniueMusic과 MelonMusic 두 개를 따로 만들지 못한다. 그래서 static이 아니고
 * 		private가 아닌 protected 아니면 public으로 작성해야한다. protected 상속하면 접근 가능
 * 
 */
	protected String title="멜론 TOP50";
	{
		try
		{
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("div.wrap_song_info div.rank01");
			Elements singer=doc.select("div.wrap_song_info div.rank02");
			Elements album=doc.select("div.wrap_song_info div.rank03");
			
			for (int i = 0; i < 50; i++) 
			{
			System.out.println(i+1);	
			System.out.println(title.get(i).text());
			System.out.println(singer.get(i).text());
			System.out.println(album.get(i).text());
			System.out.println("====================");
			musics[i]=new Music();
			musics[i].setRank(i+1);
			musics[i].setTitle(title.get(i).text());
			musics[i].setSinger(singer.get(i).text());
			musics[i].setAlbum(album.get(i).text());
			}
			// Geniue가 가지고 있는 musics와 melon이 가지고 있는 musics는 서로 다르다 .
			// 서로 다른 공간에 저장되어있다. 만약 두 개가 static함수로 묶여있다면 다른 애기겠지만 
			// 서로 다른 메모리공간을 공유하기 떄문에 해당하지 않는다. 
		
		}catch (Exception ex) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		MelonMusicSystem ms=new MelonMusicSystem();
	}
}



















