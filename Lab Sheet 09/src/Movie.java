//2013111089 ÇÑªÃ¾Å ¾§ÉìÇÔÅÑÂ
public class Movie {
	private String id;
	private String name;
	private Director director;

	public Movie(String id, String name, Director director) {
		this.id = id;
		this.name = name;
		this.director = director;
	}

	public Movie() {
		this(null, null, null);
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public Director getDirector() {
		return this.director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public String toString() {
		return this.id + this.name + " direct by " + this.director;

	}

}
