public class FlvPlayer implements VideoPlayer {

    private String typeName;

    public FlvPlayer() {
        this.setTypeName();
    }

    @Override
    public void display() {
        System.out.println("The video file is an flv file. The video player is: FLV_player.");
    }

    @Override
    public void setTypeName() {
        this.typeName = "flv";
    }

    @Override
    public String getTypeName() {
        return typeName;
    }


}
