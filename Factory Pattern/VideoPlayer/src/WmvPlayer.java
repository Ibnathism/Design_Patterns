public class WmvPlayer implements VideoPlayer {
    private String typeName;

    public WmvPlayer() {
        this.setTypeName();
    }

    @Override
    public void display() {
        System.out.println("The video file is a wmv file. The video player is: WMV_player.");

    }

    @Override
    public void setTypeName() {
        this.typeName = "wmv";
    }

    @Override
    public String getTypeName() {
        return typeName;
    }
}
