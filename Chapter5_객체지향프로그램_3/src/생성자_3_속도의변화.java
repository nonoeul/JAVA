import java.io.FileReader;

/*
 * 1|
 * 쇼생크 탈출|
 * 드라마|
 * https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2
 * |팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)
 * |2016 .02.24 재개봉, 1995 .01.28 개봉
 * |15세 관람가
 * |프랭크 다라본트
 * 
 * 
 */
class Movie{
	String no;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String director;
	
}

class MovieSystem { // 생성자는 클래스 내부에서 만든다
	//  class 안에서는 제어문,연산자를 구현할 수 없기 때문에 생성자 생성
	Movie[] movies=new Movie[1938];
	public MovieSystem() {
		String data="";
		StringBuffer sb=new StringBuffer();
		try
		{
				FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
				int i=0;
				while((i=fr.read())!=-1)
				{
					data=String.valueOf((char)i);
					sb.append(data);
				}
				fr.close();
				System.out.println(sb.toString());
		}catch(Exception ex) {}
	
		String msg=sb.toString();
		String[] movie=msg.split("\n");
		int i=0;
		for (String m : movie) 
		{
			String[] ss=m.split("\\|");
			movies[i]=new Movie();
			movies[i].no=ss[0];
			movies[i].title=ss[1];
			movies[i].genre=ss[2];
			movies[i].poster=ss[3];
			movies[i].actor=ss[4];
			movies[i].regdate=ss[5];
			movies[i].grade=ss[6];
			movies[i].director=ss[7];
			i++;
			
		}
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	