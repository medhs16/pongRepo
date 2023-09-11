//class header
public class Song {
	
	//Attributes
	private String title;
	private String artist;
	
	public Song() {
		title = "";
		artist = "";
	}
	
	//Constructors
	public Song(String initTitle, String initArtist) {
		title = initTitle;
		artist = initArtist;
	}
	
	//Methods + behaviors
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public static void main(String[] arg) {
		 
		
		
		
	}
	
}
