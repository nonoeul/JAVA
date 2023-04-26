package com.sist.main3;

public class Music {
	private int rank;
	private String title;
	private	String singer;
	private	String album;
	private	String state;
	private String idcrment;	// 등록
	private String like;
//		기능상으로는 읽기/쓰기를 가지고 있다. 
// 		하지만 private으로 다른 대에서 읽기/쓰기 기능을 갖다쓰지 못한다.
// 		읽기, 쓰기 기능을 넣어줘야 한다. 다른 클래스에서 사용이 가능하도록 만들어줘야 한다.
// 		getter/setter	
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
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
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getIdcrment() {
		return idcrment;
	}
	public void setIdcrment(String idcrment) {
		this.idcrment = idcrment;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	
	// 다른 클래스와 연결하기 위해서 사용되낟. 
	// 읽기 / 쓰기 => 다른 클래스와 연결 (데이터 저장, 데이터 읽기) = 데이터형 
	
	
}
