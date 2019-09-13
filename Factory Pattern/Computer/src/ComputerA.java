public class ComputerA extends Computer {


    @Override
    public void initCPU() {
        this.setCpu(ComputerName.COMPUTER_A.getCpu());
    }

    @Override
    public void initMMU() {
        this.setMmu(ComputerName.COMPUTER_A.getCpu());
    }

    @Override
    public double getResolutionX() {
        return Resolution.RESOLUTION_A.getX();
    }

    @Override
    public double getResolutionY() {
        return Resolution.RESOLUTION_A.getY();
    }

    @Override
    public double getSurfaceArea(Shape shape) {
        if (shape.isValid(this)) return shape.calcSurfaceArea();
        else {
            Computer.errorMsg();
            return 0;
        }
    }

    @Override
    public double getPerimeter(Shape shape) {
        if (shape.isValid(this)) return shape.calcPerimeter();
        else {
            Computer.errorMsg();
            return 0;
        }
    }


}
