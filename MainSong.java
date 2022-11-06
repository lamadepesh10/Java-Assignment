import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
  
class MainSong extends Process{
    public static void main(String[] args) 
    {
        while(true)
        {
            System.out.println("Choose an option");
            System.out.println("1. Add New Song\n2. Remove a Song\n3. Print all songs\n4. Print Song for number of plays");
            Scanner scan = new Scanner(System.in); 
            
            int option = scan.nextInt();
            Process p = new Process();
            
            switch (option)
            {
                case 1:
                    p.inputSong();
                    break;
                case 2:
                    p.removeSong();
                    break;
                case 3:
                    p.printAllSongs();
                    break;
                case 4:
                    p.printForPlays();
                    break;

                default:
                    System.out.println("Please select a valid option!");
                    continue;
    
            }
        }
    }

    

}



  

