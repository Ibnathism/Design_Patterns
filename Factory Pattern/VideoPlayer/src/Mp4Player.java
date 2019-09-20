public class Mp4Player implements VideoPlayer {
    private String typeName;

    public Mp4Player() {
        this.setTypeName();
    }

    @Override
    public void display() {
        System.out.println("The video file is an mp4 file. The video player is: MP4_player.");
    }

    @Override
    public void setTypeName() {
        this.typeName = "mp4";
    }

    @Override
    public String getTypeName() {
        return typeName;
    }
}
