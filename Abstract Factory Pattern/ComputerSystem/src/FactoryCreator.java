public class FactoryCreator {


    public static ComputerFactory getFactory(String name){
        if (name.equalsIgnoreCase("ComputerA")){
            return new ComputerAFactory();
        } else if (name.equalsIgnoreCase("ComputerB")){
            return new ComputerBFactory();
        } else if (name.equalsIgnoreCase("ComputerC")){
            return new ComputerCFactory();
        } else {
            return null;
        }
    }



}
