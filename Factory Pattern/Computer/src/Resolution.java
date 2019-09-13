public enum Resolution {
    RESOLUTION_A(200, 200), RESOLUTION_B(350, 250), RESOLUTION_C(550,430);

    private double x;
    private double y;
    Resolution(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
