public class ComputerCFactory implements ComputerFactory {
    private String myCPU;
    private String myMMU;
    private String myResolution;

    public ComputerCFactory() {
        myResolution = "550x430";
    }

    @Override
    public void initCPU() {
        this.setMyCPU("CPU-C");
    }

    @Override
    public void initMMU() {
        this.setMyMMU("MMU-C");
    }

    @Override
    public String getResolution() {
        return this.myResolution;
    }

    @Override
    public double getSurfaceArea(Shape shape) {
        return shape.calcSurfaceArea();
    }

    @Override
    public double getPerimeter(Shape shape) {
        return shape.calcPerimeter();
    }

    public String getMyCPU() {
        return myCPU;
    }

    public void setMyCPU(String myCPU) {
        this.myCPU = myCPU;
    }

    public String getMyMMU() {
        return myMMU;
    }

    public void setMyMMU(String myMMU) {
        this.myMMU = myMMU;
    }

    public void setMyResolution(String myResolution) {
        this.myResolution = myResolution;
    }


}
