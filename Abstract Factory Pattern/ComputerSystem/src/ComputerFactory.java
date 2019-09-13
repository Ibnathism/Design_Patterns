public interface ComputerFactory {
    void initCPU();
    void initMMU();
    String getResolution();

    double getSurfaceArea(Shape shape);
    double getPerimeter(Shape shape);
}
