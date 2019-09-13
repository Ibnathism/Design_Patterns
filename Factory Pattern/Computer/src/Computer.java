public abstract class Computer {

    private String cpu;
    private String mmu;

    abstract void initCPU();
    abstract void initMMU();
    abstract double getResolutionX();
    abstract double getResolutionY();

    abstract double getSurfaceArea(Shape shape);
    abstract double getPerimeter(Shape shape);

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMmu(String mmu) {
        this.mmu = mmu;
    }

    public static void errorMsg(){
        System.out.println("The shape doesn't fit in the computer");
    }
}
