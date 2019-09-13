public class MediaAdapter implements MediaPlayer {
    AdvancesMediaPlayer adaptee;

    public MediaAdapter(MusicFile musicFile){
        if (musicFile.getType().equalsIgnoreCase("mp4")){
            adaptee = new Mp4Player();
        }
        else if (musicFile.getType().equalsIgnoreCase("vlc")){
            adaptee = new VlcPlayer();
        }
        else if (musicFile.getType().equalsIgnoreCase("flv")){
            adaptee = new FlvPlayer();
        }
    }
    @Override
    public void play(MusicFile musicFile) {
        if (musicFile.getType().equalsIgnoreCase("mp4")){
            adaptee.playMp4(musicFile);
        }
        else if (musicFile.getType().equalsIgnoreCase("vlc")){
            adaptee.playVlc(musicFile);
        }
        else if (musicFile.getType().equalsIgnoreCase("flv")){
            adaptee.playFlv(musicFile);
        }
    }

}
