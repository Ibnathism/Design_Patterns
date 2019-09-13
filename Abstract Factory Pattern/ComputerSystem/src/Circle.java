public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double calcSurfaceArea() {
        return 3.1416*radius*radius;
    }

    @Override
    double calcPerimeter() {
        return 2*3.1416*radius;
    }
}
