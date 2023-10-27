import java.util.ArrayList;
import java.util.Scanner;
 
 
public class Song {
    private String artistName;
    private String songTitle;
    private int playCount;
    public Song() {
        // Default constructor
    }
 
    public Song(String artistName, String songTitle) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.playCount = 0; // we will initialize play count to 0
    }
    //Constructor
    public String getArtistName() {
        return artistName;
    }
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    public String getSongTitle() {
        return songTitle;
    }
    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }
    public int getPlayCount() {
        return playCount;
    }
    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }
    public static void main(String[] args) {
        boolean mainloop=true;
        ArrayList<Song> playList = new ArrayList<Song>();
        Song song1=new Song();
        song1.artistName = "Kenya Grace";
        song1.songTitle= "Strangers";
        song1.playCount= 23;
        Song song2=new Song();
        song2.artistName = "Taylor Swift";
        song2.songTitle= "Cruel Summer";
        song2.playCount= 21;
        Song song3=new Song();
        song3.artistName = "SZA";
        song3.songTitle= "Snooze";
        song3.playCount= 18;
        Song song4=new Song();
        song4.artistName = "Miley Cyrus";
        song4.songTitle= "Used to be young";
        song4.playCount= 11;
        Song song5=new Song();
        song5.artistName = "Dua Lipa";
        song5.songTitle= "Dance the night";
        song5.playCount= 81;
        Song song6=new Song();
        song6.artistName = "David Kushner";
        song6.songTitle= "Daylight";
        song6.playCount= 14;
        Song song7=new Song();
        song7.artistName = "Selena Gomez";
        song7.songTitle= "Single Soon";
        song7.playCount= 19;
        Song song8=new Song();
        song8.artistName = "Olivia Rodrigo";
        song8.songTitle= "Vampire";
        song8.playCount= 10;
        Song song9=new Song();
        song9.artistName = "Tate Mcrae";
        song9.songTitle= "Greedy";
        song9.playCount= 17;
        Song song10=new Song();
        song10.artistName = "Noah Kahan";
        song10.songTitle= "Dial Drunk   ";
        song10.playCount= 41;
        playList.add(song1);
        playList.add(song2);
        playList.add(song3);
        playList.add(song4);
        playList.add(song5);
        playList.add(song6);
        playList.add(song7);
        playList.add(song8);
        playList.add(song9);
        playList.add(song10);
        while(mainloop) {
            System.out.printf("======================================================%n");
            System.out.printf("|                       Main Menu                    |%n");
            System.out.printf("======================================================%n");
            System.out.printf("| 1. Add Song To Playlist                            |%n");
            System.out.printf("| 2. Remove Song From Playlist                       |%n");
            System.out.printf("| 3. View Playlist                                   |%n");
            System.out.printf("| 4. Print List of songs over given number of plays  |%n");
            System.out.printf("| 5. Exit                                            |%n");
            System.out.printf("======================================================%n");
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
 
            switch (choice) {
            case 1:
                Addsong(playList);
                System.out.println("Add a song: ");
                break;
            case 2:
                Removesong(playList);
                System.out.println("Remove a song: ");
                break;
            case 3:
                Viewplaylist(playList);
                System.out.println("Print a list of all the songs stored: ");
                break;
            case 4:
                ViewSongBasedOnPlaycount(playList);
                break;
            case 5:
                System.exit(0);
                break;
 
            default:
                System.out.println("Invalid choice");
            }
 
        }
 
    }
 
    public static void Viewplaylist (ArrayList<Song> playList) {
        System.out.printf("================================================================================%n");
        System.out.printf("| %-30s | %-20s | %-20s |%n", "SONG NAME", "ARTIST NAME", "PLAYCOUNT");
        System.out.printf("================================================================================%n");
        for (int i = 0; i < playList.size(); i++) {
            if (playList.get(i) != null) {
                System.out.printf("| %-30s | %-20s | %-20d |%n", playList.get(i).getSongTitle(), playList.get(i).getArtistName(),  playList.get(i).getPlayCount());
            }
 
        }
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    public static void Removesong (ArrayList<Song>playList) {
        System.out.print("Enter the title of the song to be removed: ");
        Scanner scanner = new Scanner(System.in);
        String songToRemove = scanner.nextLine();
        for(int i = 0; i< playList.size(); i++) {
            if(songToRemove.equals(playList.get(i).getSongTitle())) {
                playList.remove(i);
                break;
            }
        }
        System.out.println("Press \"ENTER\" to continue...");
        scanner.nextLine();
 
    }
    public static void Addsong (ArrayList<Song>playList) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the title of the song: ");
        String songTitle = scanner.nextLine();
        System.out.print("Enter the artist of the song: ");
        String artistName = scanner.nextLine();
        System.out.print("Enter the playcount of the song: ");
        int playCount = scanner.nextInt();
        Song xyz=new Song();
        xyz.songTitle=songTitle;
        xyz.playCount=playCount;
        xyz.artistName=artistName;
        playList.add(xyz);
        System.out.println("Press \"ENTER\" to continue...");
        scanner.nextLine();
    }
    public static void ViewSongBasedOnPlaycount (ArrayList<Song>playList) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the playcount of the song: ");
        int playCount = scanner.nextInt();
        System.out.printf("================================================================================%n");
        System.out.printf("| %-30s | %-20s | %-20s |%n", "SONG NAME", "ARTIST NAME", "PLAYCOUNT");
        System.out.printf("================================================================================%n");
        for(int i = 0; i< playList.size(); i++) {
            if(playCount == playList.get(i).getPlayCount()) {
                System.out.printf("| %-30s | %-20s | %-20d |%n", playList.get(i).getSongTitle(), playList.get(i).getArtistName(),  playList.get(i).getPlayCount());
            }
        }
        System.out.println("Press \"ENTER\" to continue...");
        scanner.nextLine();
    }
}