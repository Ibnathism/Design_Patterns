import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static void order(String shake){

        ShakeDirector shakeDirector;
        boolean isLactoseFree=false, withCandy=false, withCookie=false;

        String[] splittedShake = shake.split(",");
        if (splittedShake[1].equalsIgnoreCase("y")) withCandy = true;
        if (splittedShake[2].equalsIgnoreCase("y")) withCookie = true;
        if (splittedShake[3].equalsIgnoreCase("y")) isLactoseFree = true;
        shakeDirector = new ShakeDirector(withCookie, withCandy, isLactoseFree);
        Shake myShake = shakeDirector.produceShake(splittedShake[0]);


        System.out.println("\nName : "+splittedShake[0]+"   Base Price : "+shakeDirector.getMyShakeBasePrice()+"  Tk");
        System.out.println(myShake);
        System.out.println("Total Price = "+ shakeDirector.getMyShakePrice());




    }

    private static void showMenu(){
        System.out.println("Shake Shack");
        System.out.println("Available Shakes : ");
        System.out.println("1.Chocolate Shake   2.Coffee Shake      3.Strawberry Shake");
        System.out.println("4.Vanilla Shake     5.Zero Shake");
        System.out.println("Do you want? -----  (a)Extra Candy   (b)Extra Cookie   (c)Make my shake lactose free");
        System.out.println("Input Format = Name_of_your_shake,y/n,y/n,y/n");

        System.out.println();
        System.out.println();



    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String input, shake;
        ArrayList<String> myInputs = new ArrayList<>();
        Main.showMenu();

        while (true){
            System.out.println("Enter 'O' to start order and 'E' to end order");
            input = sc.next();
            if (input.equalsIgnoreCase("O")){
                shake ="";
                while (!shake.equalsIgnoreCase("E")){
                    shake = sc.next();
                    if (shake.equalsIgnoreCase("O")) System.out.println("You can't start another order without exiting the running one, " +
                            "press 'E' if you want to exit.");
                    if (!shake.equalsIgnoreCase("E"))myInputs.add(shake);
                }
                while (!myInputs.isEmpty()) {

                    Main.order(myInputs.get(0));
                    myInputs.remove(0);


                }

            }
        }



    }
}
