public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double calcSurfaceArea() {
        return side*side;
    }

    @Override
    double calcPerimeter() {
        return 4*side;
    }
}
