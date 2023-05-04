package 음악프로그램;

import java.io.*;
/*
 	<table class="list-wrap">		태그명.클래스명 / 태그명#아이디명
 							*태그명과 클래스를 찾아서 갖고 올때 클래스명이면 .을 붙이고
 							*아이디명을 붙어야할때는 #을 붙여서 처리한다.
 							*태그 선택하는 것만 잘알아도 문제푸는데 용이 
 	*태그를 찾을때 table class="list-wrap" 최상위 계층부터 찾아야한다. 
 	-------태그명   ----------구분자 => class/id
 									 ----- --
 									 중복	중복이 없는상태
 		<tr>
 			<td class="info">
 				<a class="cover"><img src=""></a>
 				*img 이미지값을 가지고 올때 
 				</td>
 					<td class="info">
 						<a class="title aaa">노래명</a>
 					</td>
 					<td class="info">
 					<a class="artist aaa">가수명</a>
 					</td>
 				</tr>
 				</table>
 						
 
  
  
  
  
 */
public class GenieMusicVO implements Serializable{
	
	private int no;
	private String title;
	private String singer;
	private String album;
	private String poster;
	private int idcrement; // 등폭
	private String state; // 유지, 상승, 하강
	private int cno; // 구분자
	private String key; // 동영상
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	
}
