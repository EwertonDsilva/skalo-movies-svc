package skalo.model;

import lombok.Data;

@Data
public class MovieRequest {

	private String title;
    private int year;
    private String director;
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year; 
		System.out.println("Olá");
	}

    
}
