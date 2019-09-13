public class Main {
    public static void main(String[] args) {
        String computerName, shapeName;
        double  parameter1, parameter2, parameter3;
        ComputerFactory computerFactory;
        Shape testShape;

        //TEST CASE 1 (ComputerA, Triangle, side1, side2, side3)
        computerName = "ComputerA";
        shapeName = "Triangle";
        parameter1 = 5.0;
        parameter2 = 3.0;
        parameter3 = 4.0;


        testShape = new Triangle(parameter1, parameter2, parameter3);
        computerFactory = FactoryCreator.getFactory(computerName);
        assert computerFactory != null;
        computerFactory.initCPU();
        computerFactory.initMMU();


        System.out.println("TEST CASE 1");
        System.out.println("Name of the Computer : "+computerName);
        System.out.println("Name of the Shape : "+shapeName);
        System.out.println("Resolution : "+computerFactory.getResolution());
        System.out.println("Surface Area : "+ computerFactory.getSurfaceArea(testShape));
        System.out.println("Perimeter : "+computerFactory.getPerimeter(testShape));


        System.out.println();
        System.out.println();



        //TEST CASE 2 (ComputerC, Circle, radius)
        computerName = "ComputerC";
        shapeName = "Circle";
        parameter1 = 5.0;


        testShape = new Circle(parameter1);
        computerFactory = FactoryCreator.getFactory(computerName);
        assert computerFactory != null;
        computerFactory.initCPU();
        computerFactory.initMMU();


        System.out.println("TEST CASE 2");
        System.out.println("Name of the Computer : "+computerName);
        System.out.println("Name of the Shape : "+shapeName);
        System.out.println("Resolution : "+computerFactory.getResolution());
        System.out.println("Surface Area : "+ computerFactory.getSurfaceArea(testShape));
        System.out.println("Perimeter : "+computerFactory.getPerimeter(testShape));





    }
}
