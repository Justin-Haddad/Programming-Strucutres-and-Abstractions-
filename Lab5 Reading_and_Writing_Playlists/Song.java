import java.util.Arrays;

public class Song {
	
	private String title;
	private String artist;
	private int[] time;
	
	private static final String INFO_DELIMITER = "; ";
	private static final String TIME_DELIMITER = " : ";
	private static final int IDX_TITLE = 0;
	private static final int IDX_ARTIST = 1;
	private static final int IDX_TIME = 2;
	
	public Song(String title, String artist, int[] time) {
		this.title = title;
		this.artist = artist;
		this.time = Arrays.copyOf(time, time.length);
	}
	
	public Song(String info)
	{
		int[] time = new int[2];
		String[] songInfo = info.split("; ");
        this.title = songInfo[0];
        this.artist = songInfo[1];
        String[] timeArray = songInfo[2].split(":");
        int seconds = Integer.parseInt(timeArray[0]);
        int minutes = Integer.parseInt(timeArray[1]);
        this.time[0] = seconds;
        this.time[1] = minutes;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public int[] getTime() {
		return Arrays.copyOf(time, time.length);
	}
	
	public String toString()
	{
		 String timeStr = String.format("%d:%02d", time[0], time[1]);
	        return String.format("%s; %s; %s", title, artist, timeStr);
	}
}
