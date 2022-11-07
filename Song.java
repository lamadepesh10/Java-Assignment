import java.util.ArrayList;

public class Song{
    
    // List of Song Objects
    public static ArrayList<Song> songList;
    public String artist, title;
    public int playCount;

    // Constructor
    public Song(String artist, String title, int playCount){
        songList = new ArrayList<Song>(); 
        this.artist = artist;
        this.title = title;
        this.playCount = playCount;

    }

    // Getter for Title
    public String getTitle() {
        return title;
    }

    // Getter for Artist
    public String getArtist() {
        return artist;
    }

    // Getter for PlayCount
    public int getplayCount() {
        return playCount;
    }
}
  