public class ComputerBFactory implements ComputerFactory {
    private String myCPU;
    private String myMMU;
    private String myResolution;


    public ComputerBFactory() {
        myResolution = "350x250";
    }

    @Override
    public void initCPU() {
        this.setMyCPU("CPU-B");
    }

    @Override
    public void initMMU() {
        this.setMyMMU("MMU-B");
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
