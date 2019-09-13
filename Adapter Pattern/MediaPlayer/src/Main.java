import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
	// write your code here
        MusicFile m1 = new MusicFile("Alone",2.30, "mp4", 120);
        MusicFile m2 = new MusicFile("Song",2.30, "vlc", 120);

        Playlist p1 = new Playlist("MyPlaylist");
        p1.addMusic(m1);
        p1.addMusic(m2);
        audioPlayer.addNewPlaylist(p1, 0);
        audioPlayer.setCurrentlyPlaying(p1);

        MusicFile m3 = new MusicFile("new",2.30, "flv", 25);
        Playlist p2 = new Playlist("feel");
        p2.addMusic(m3);
        audioPlayer.addNewPlaylist(p2, 10);
        MusicFile m4 = new MusicFile("myMusic", 3.30, "mp4", 100);
        p2.addMusic(m4);

        audioPlayer.addNewPlaylist(p2, 100000);







    }
}
