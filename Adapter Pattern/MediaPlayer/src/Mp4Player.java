public class Mp4Player implements AdvancesMediaPlayer {

    @Override
    public void playMp4(MusicFile musicFile) {
        System.out.println();
        System.out.println("Playing mp4 file");
        System.out.println("Name : "+musicFile.getName());
        System.out.println("Type : "+musicFile.getType());
        System.out.println("Size : "+musicFile.getSize());
        System.out.println("Duration : "+musicFile.getDuration());
    }

    @Override
    public void playVlc(MusicFile musicFile) {

    }

    @Override
    public void playFlv(MusicFile musicFile) {

    }
}
