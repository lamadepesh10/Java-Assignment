import java.util.ArrayList;

public class Song{
    
    public static ArrayList<Song> songList;
    public String artist, title;
    public int playCount;

    public Song(String artist, String title, int playCount){
        songList = new ArrayList<Song>(); 
        this.artist = artist;
        this.title = title;
        this.playCount = playCount;

    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getplayCount() {
        return playCount;
    }
}
  