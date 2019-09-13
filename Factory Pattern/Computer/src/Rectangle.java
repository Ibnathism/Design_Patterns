public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calcSurfaceArea() {
        return length*width;
    }

    @Override
    double calcPerimeter() {
        return 2*(length+width);
    }

    @Override
    boolean isValid(Computer computer) {
        return (length<=computer.getResolutionX() && width<=computer.getResolutionY())||
                (length<=computer.getResolutionY() && width<=computer.getResolutionX());
    }
}
