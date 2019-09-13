public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    double calcSurfaceArea() {
        double area, s;
        s = (side3+side2+side1)/2;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }

    public boolean checkValidity()
    {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    @Override
    double calcPerimeter() {
        return side1+side2+side3;
    }

    @Override
    boolean isValid(Computer computer) {
        if (!this.checkValidity()) {
            System.out.println("The triangle is not valid");
            return false;
        }
        double area = this.calcSurfaceArea();
        double tempH1 = 2*(area/side1);
        double tempH2 = 2*(area/side2);
        double tempH3 = 2*(area/side3);
        return (side1<=computer.getResolutionX()&&tempH1<=computer.getResolutionY())||
                (side2<=computer.getResolutionX()&&tempH2<=computer.getResolutionY())||
                (side3<=computer.getResolutionX()&&tempH3<=computer.getResolutionY());
    }
}
