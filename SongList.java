import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SongList {
    private ArrayList<Song> Songs = new ArrayList<>();

    // Add new Song to List
    public boolean add(Song pSong) {
        return Songs.add(pSong);
    }

    // Get Song by index
    public Song get(int index) {
        return Songs.get(index);
    }

    // Remove song by index
    public void removeSong(int index)
    {
        Songs.remove(index);
        System.out.println("The song has been removed sucessfully");
    }

    // Print all songs in list
    public void printSongs()
    {

        if(Songs.size() == 0)
        {
            System.out.println("There are no songs here!");
            return;
        }
        
        System.out.println("Index\tArtist\tTitle\tPlay Count");
        for (int i = 0; i < Songs.size(); i++)
        {
            Song s = Songs.get(i);
            int index = Songs.indexOf(s);

            System.out.println(index+"\t"+s.getArtist()+"\t"+s.getTitle()+"\t"+s.getplayCount());
        
        }
    }

    // Get Popular song greater or equal to input play count
    public void getPopular(int play)
    {
        List<Song> popularSongs = Songs.stream()
                                        .filter(p -> p.getplayCount() >= play).collect(Collectors.toList());
        for (Song s : popularSongs
                        ) {
                            System.out.println(s.getTitle() + "\t\t\t\t\t" + s.getArtist() + "\t\t\t\t\t" + s.getplayCount());
                        }
    }

}