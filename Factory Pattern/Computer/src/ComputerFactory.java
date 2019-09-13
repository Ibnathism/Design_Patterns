public class ComputerFactory {

    public static Computer getFactory(String name){
        if (name.equalsIgnoreCase(String.valueOf(ComputerName.COMPUTER_A))){
            return new ComputerA();
        } else if (name.equalsIgnoreCase(String.valueOf(ComputerName.COMPUTER_B))){
            return new ComputerB();
        } else if (name.equalsIgnoreCase(String.valueOf(ComputerName.COMPUTER_C))){
            return new ComputerC();
        } else {
            return null;
        }
    }

}
