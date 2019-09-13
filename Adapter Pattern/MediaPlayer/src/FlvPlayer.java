public class FlvPlayer implements AdvancesMediaPlayer {

    @Override
    public void playMp4(MusicFile musicFile) {

    }

    @Override
    public void playVlc(MusicFile musicFile) {

    }

    @Override
    public void playFlv(MusicFile musicFile) {
        System.out.println();
        System.out.println("Playing flv file");
        System.out.println("Name : "+musicFile.getName());
        System.out.println("Type : "+musicFile.getType());
        System.out.println("Size : "+musicFile.getSize());
        System.out.println("Duration : "+musicFile.getDuration());
    }
}
