import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SongList {
    private ArrayList<Song> Songs = new ArrayList<>();


    public boolean add(Song pSong) {
        return Songs.add(pSong);
    }

    public Song get(int index) {
        return Songs.get(index);
    }

    public void removeSong(int index)
    {
        Songs.remove(index);
        System.out.println("The song has been removed sucessfully");
    }
   

}