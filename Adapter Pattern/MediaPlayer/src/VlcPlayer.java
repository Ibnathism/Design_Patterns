public class VlcPlayer implements AdvancesMediaPlayer {

    @Override
    public void playMp4(MusicFile musicFile) {

    }

    @Override
    public void playVlc(MusicFile musicFile) {
        System.out.println();
        System.out.println("Playing vlc file");
        System.out.println("Name : "+musicFile.getName());
        System.out.println("Type : "+musicFile.getType());
        System.out.println("Size : "+musicFile.getSize());
        System.out.println("Duration : "+musicFile.getDuration());

    }

    @Override
    public void playFlv(MusicFile musicFile) {

    }
}
