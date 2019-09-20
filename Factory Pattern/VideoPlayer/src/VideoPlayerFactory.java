public class VideoPlayerFactory {
    public VideoPlayer getPlayer(String type){
        if (type.equalsIgnoreCase("flv")){
            return new FlvPlayer();
        }
        else if (type.equalsIgnoreCase("mp4")){
            return new Mp4Player();
        }
        else if (type.equalsIgnoreCase("wmv")){
            return new WmvPlayer();
        }
        else return null;
    }
}
