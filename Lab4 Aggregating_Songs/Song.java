import java.util.Arrays;

public class Song {

	// Instance Data 
	private String title;
	private String artist;
	private int[]  time;
	
	public Song(String title, String artist, int[] time) {

		this.title = title;
		this.artist = artist;
		
	
		int[] copy = Arrays.copyOf(time, time.length);
		this.time = copy;
	}
	
	
	public String getTitle()
	{
		return title;
	}
	
	public String getArtist()
	{
		return artist;
	}
	
	public int[] getTime()
	{
		int[] copy = Arrays.copyOf(time, time.length);
		return copy;
	}
			
	
}
