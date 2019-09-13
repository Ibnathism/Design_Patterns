public class MusicFile {
    private String name;
    private double size;           //size in MB
    private String type;
    private int duration;          //duration in second

    public MusicFile(String name, double size, String type, int duration) {
        this.name = name;
        this.size = size;
        this.type = type;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }
}
