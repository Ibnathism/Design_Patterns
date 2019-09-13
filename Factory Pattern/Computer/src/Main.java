public class Main {
    static int testCase=0;

    public static void print(String computerName, String shapeName, Shape testShape){
        Computer computer = ComputerFactory.getFactory(computerName);
        assert computer != null;
        computer.initCPU();
        computer.initMMU();
        testCase++;

        System.out.println("TEST CASE "+testCase);
        System.out.println("Name of the Computer : "+computerName);
        System.out.println("Name of the Shape : "+shapeName);
        System.out.println("Resolution : "+computer.getResolutionX()+"x"+computer.getResolutionY());
        if (computer.getSurfaceArea(testShape)!=0.0) System.out.println("Surface Area : "+ computer.getSurfaceArea(testShape));
        if (computer.getPerimeter(testShape)!=0.0) System.out.println("Perimeter : "+computer.getPerimeter(testShape));


        System.out.println();
        System.out.println();


    }

    public static void main(String[] args) {
        String computerName, shapeName;
        Shape testShape;

        //TEST CASE 1 (ComputerA, Triangle, side1, side2, side3)
        computerName = "COMPUTER_A";
        shapeName = "Triangle";
        testShape = new Triangle(500,300,400);

        Main.print(computerName, shapeName, testShape);



        //TEST CASE 2 (ComputerC, Circle, radius)
        computerName = "COMPUTER_C";
        shapeName = "Circle";
        testShape = new Circle(5);


       Main.print(computerName, shapeName, testShape);

    }
}
