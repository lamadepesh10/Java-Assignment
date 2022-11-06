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



}
