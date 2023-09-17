import java.util.Arrays;

public class Playlist {
	// Instance data
	private Song[] songs;
	private int numSongs = 0;
	private static final int MIN_CAPACITY = 3;

	// Constructors
	public Playlist() {
		this.songs = new Song[MIN_CAPACITY];
		numSongs = 0;

	}

	public Playlist(int capacity) {
		if (capacity > MIN_CAPACITY) {
			this.songs = new Song[capacity];
		}
		if (capacity < MIN_CAPACITY) {
			this.songs = new Song[MIN_CAPACITY];
		}
		numSongs = 0;
	}

	public int getCapacity() {
		return this.songs.length;
	}

	public int getNumSongs() {
		return this.numSongs;
	}

	public Song getSong(int index) {

		if ((index < 0) || (index > numSongs- 1)) {
			return null;
		}
		return songs[index];
	}

	public Song[] getSongs() {

		Song[] copy = Arrays.copyOf(songs, numSongs);
		return copy;
	}

	public boolean addSong(int index, Song song) {
		
		if ((songs.length == numSongs || (index < 0) || (index > numSongs) || (song == null)))
		{
			return false;
		}
		else {
			for (int i = numSongs ; i > index ; i--) {
				songs[i] = songs[i -1];
			
			}
			songs[index] = song;
			numSongs++;
			return true;
			
		}
	}

	public boolean addSong(Song song) {
		return addSong(numSongs, song);

	}

	public int addSongs(Playlist playlist) {
		if (playlist == null)
		{
			return 0;
		}
		int num = 0;
		Song[] SongPlayList = playlist.getSongs();
		for (int index = numSongs; index < songs.length && num < SongPlayList.length; index++)
		{
			songs[index] = SongPlayList[num];
			numSongs++;
			num++;
		}
		return num;
	}
	
	public Song removeSong()
	{
		Song newSong = removeSong(numSongs - 1);
		return newSong;
	}
	
	public Song removeSong(int index)
	{
		{
			if (index < 0|| index > numSongs || songs[index] == null)
			{
				return null;
			}
			
			
			else {
				numSongs--;
				Song temp = songs[index];
				songs[index] = null;
			
				for (int i = index; i < numSongs; i++)
			{
				songs[i] = songs[i + 1 ];
			}
				
			return temp;
			}
		}
	}
}


