package com.ssafy.ws.step2.dto;

public class Movie {
	private int id;
	private String title;
	private String director;
	private String genre;
	private int runningTime;
	
	public Movie(int id, String title, String director, String genre, int runningTime) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	@Override
	public String toString() {
		return "Movie [영화id = " + id + ", 영화 제목 = " + title + ", 감독 = " + director + ", 장르 = " + genre + ", 상영시간 = "
				+ runningTime + "]";
	}
}