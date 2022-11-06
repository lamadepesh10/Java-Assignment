import java.util.Scanner;

public class Process {
    private static SongList songList = new SongList();

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

    public void printAllSongs()
    {
        songList.printSongs();
        
    }

    public void removeSong()
    {
        printAllSongs();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the index to remove: ");
        int index= scan.nextInt();

        songList.removeSong(index);
    }

    public void getData()
    {
        Song song = songList.get(1);
        System.out.println(song);
        
    }

    public void printForPlays()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Number of plays: ");

        int plays = scan.nextInt();
        songList.getPopular(plays);
    }


}
