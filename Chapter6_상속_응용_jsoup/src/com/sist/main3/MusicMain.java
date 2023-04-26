package com.sist.main3;
import java.util.*;
public class MusicMain {
	
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.print("선택(Genie(1),Melon(2)):");
		int select=scan.nextInt();
		// 상속 =>클래스를 통합할 수 있다는 장점이 있다. 
		/*
		 * 	상속
		 * 		=> 객체 생성
		 * 		=> 상위클래스 = 하위클래스 
		 * 		  ------------------
		 * 
		 */
		GeniueMusicSystem ms=null; // 초기값 아무것도 넣지 않는 상태?
		
		if(select==1)
			ms=new GeniueMusicSystem();
		else
			ms=new MelonMusicSystem();
		
		// 1.목록 출력
		Music[] music=ms.musicAllData();
		for(Music m:music)
		{
			System.out.println(m.getRank()+"."+m.getTitle());
		}
		
	}
}
