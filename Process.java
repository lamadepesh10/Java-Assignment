import java.util.Scanner;

public class Process {

    private static SongList songList = new SongList();

    // Input Artist, Title and Play Count
    public static void inputSong()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Artist");
        String artist = scan.nextLine();

        System.out.println("Enter Title");
        String title = scan.nextLine();

        System.out.println("Enter Play Count");
        int playCount = scan.nextInt();

        songList.add(new Song(artist, title, playCount));
        
    }

    // Print all the Songs in the list
    public void printAllSongs()
    {
        songList.printSongs();
        
    }

    // Remove song by index
    public void removeSong()
    {
        printAllSongs();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the index to remove: ");
        int index= scan.nextInt();

        songList.removeSong(index);
    }

    // Find Popular Songs 
    public void printForPlays()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Number of plays: ");

        int plays = scan.nextInt();
        songList.getPopular(plays);
    }
}
