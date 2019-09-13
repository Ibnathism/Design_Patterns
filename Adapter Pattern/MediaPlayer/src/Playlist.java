import java.util.ArrayList;

public class Playlist {
    private ArrayList<MusicFile> list;
    private String name;



    public Playlist(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    public void addMusic(MusicFile musicFile){
        list.add(musicFile);
        System.out.println();
        System.out.println("Music \""+musicFile.getName()+"\" added to the playlist "+this.getName());
    }

    public ArrayList<MusicFile> getList() {
        return list;
    }

    public String getName() {
        return name;
    }

    public int countTotalDuration(){
        int count = 0;
        for (MusicFile m :list
             ) {
            count = count + m.getDuration();
        }
        return count;
    }


}
