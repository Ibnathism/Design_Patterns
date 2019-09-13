import java.util.ArrayList;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;
    private ArrayList<Playlist> listOfPlaylist;
    private Playlist currentlyPlaying;

    public AudioPlayer() {
        listOfPlaylist = new ArrayList<>();
    }

    @Override
    public void play(MusicFile musicFile) {
        if (musicFile.getType().equalsIgnoreCase("mp4")
        || musicFile.getType().equalsIgnoreCase("vlc")
        || musicFile.getType().equalsIgnoreCase("flv")){
            mediaAdapter = new MediaAdapter(musicFile);
            mediaAdapter.play(musicFile);
        }
        else {
            System.out.println("Playing mp3 file. Name : "+musicFile.getName());
        }
    }



    public void addNewPlaylist(Playlist playlist, int elapsedTime){
        if (currentlyPlaying!=null)
        {
            if (elapsedTime>currentlyPlaying.countTotalDuration()) {
                listOfPlaylist.add(playlist);
                System.out.println();
                System.out.println("Playlist "+playlist.getName()+" added to the audio player");
                System.out.println("Elapsed Time : "+elapsedTime+"      Total Duration : "+currentlyPlaying.countTotalDuration());
                this.setCurrentlyPlaying(playlist);
            }
            else {
                System.out.println();
                System.out.println("Cannot add playlist because the currently playing playlist "+this.currentlyPlaying.getName()+" will not finish within the elapsed time.");
            }
        }
        else {
            System.out.println();
            System.out.println("The playlist "+playlist.getName()+" added to the audioplayer");
        }
    }

    public void setCurrentlyPlaying(Playlist currentlyPlaying) {
        this.currentlyPlaying = currentlyPlaying;
        for (MusicFile m:currentlyPlaying.getList()
             ) {
            this.play(m);
        }
    }
}
