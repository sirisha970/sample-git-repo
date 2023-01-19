package javamoviemanagement.com.cg;

public class moviemanagementsystem {
	private String movieId;
    private String movieName;
	private String movieLanguage;
    public moviemanagementsystem() {
    	
    }
    
    public moviemanagementsystem(String movieId, String movieName, String movieLanguage) {
    	super();
    	this.movieId = movieId;
    	this.movieName = movieName;
    	this.movieLanguage = movieLanguage;
    }
	public String getMovieid() {
		return movieId;
	}
	public void setMovieid(String movieid) {
		this.movieId = movieid;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	@Override
	public String toString() {
		return "MoviemanagementSystem [movieId=" + movieId + ", movieName=" + 
	    movieName + ", movieLanguage=" + movieLanguage + "]";
		

	}

}
