package 음악프로그램;

import java.io.*;
import java.util.*;
import 음악프로그램.GenieMusicVO;

public class MusicSystem {

	private static List<GenieMusicVO> list=new ArrayList<GenieMusicVO>();
	//지니뮤직 list에서 Vo빼기 
	
	static 
	{
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		// ??먼저 static으로 위에다가 선언을 해준 이유는
		// final가 받을 수 있게 만들어주는 것이다. final가 받을 수 있도록 
		try
		{
			fis=new FileInputStream("c:\\java_datas\\genie_music.txt");
			ois=new ObjectInputStream(fis);
			list=(List<GenieMusicVO>)ois.readObject();
			//list 객체단위로 저장한다. 객체단위로 저장하기 때문이다. 
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try 
			{
				fis.close();
				ois.close();
			}catch(Exception ex) {}
		}
	}
	public List<GenieMusicVO> musicCategoryData(int cno)
	{
		List<GenieMusicVO> mList=new ArrayList<GenieMusicVO>();
		
		for(GenieMusicVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				mList.add(vo);
			}
		}
		return mList;
	}
	
	public List<GenieMusicVO> musicFindDate(String title)
	{
		List<GenieMusicVO> mList=
				new ArrayList<GenieMusicVO>();
		for(GenieMusicVO vo:list)
		{
			if(vo.getTitle().contains(title))
			{
				mList.add(vo);
			}
		}
		return mList;
	}
	public static void main(String[] args) {
		MusicSystem ms=new MusicSystem();
		try
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("가요(1),POP(2),OST(3),트롯(4),JAZZ(5),CLASSIC(6)");
			String cno=in.readLine();
			//한줄 씩 저장
			ms.musicCategoryData(Integer.parseInt(cno));
			// ms에 music카테고리데이터의 정수형변형 cno 번호를 정수형으로변환 
		}catch(Exception ex) {}
	}
}