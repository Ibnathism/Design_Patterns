import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ShakeBuilder sb;
        System.out.println("Shake Shack");
        Scanner sc = new Scanner(System.in);
        String name="";
        int choice;
        boolean isLactoseFree=false, withCandy=false, withCookie=false;
        while (true){
            sb = new ShakeBuilder();
            System.out.println("Enter 'O' to open order and 'E' to exit");
            String input = sc.next();
            if (input.equals("O")){
                System.out.println("Order opened --- Choose one");
                System.out.println("1.Chocolate Shake   2.Coffee Shake      3.Strawberry Shake");
                System.out.println("4.Vanilla Shake     5.Zero Shake");
                choice = sc.nextInt();
                System.out.println("Do you want to add Almond milk instead of milk to have the shake lactose free ? (y/n)");
                input = sc.next();
                System.out.println(input);
                if (input.equals("y")) isLactoseFree = true;
                System.out.println("Do you want to add candy? (y/n)");
                input = sc.next();
                if (input.equals("y")) withCandy = true;
                System.out.println("Do you want to add cookie? (y/n)");
                input = sc.next();
                if (input.equals("y")) withCookie = true;
                System.out.println("Here's your bill:");
                if (isLactoseFree) sb.setBaseIng1("Almond Milk");
                else sb.setBaseIng1("Milk");
                switch (choice){
                    case 1 :
                        name = "ChocolateShake" ;
                        sb.setBaseIng2("Sugar");
                        break;
                    case 2 :
                        name = "CoffeeShake";
                        sb.setBaseIng2("Sugar");
                        break;
                    case 3 :
                        name = "StrawberryShake";
                        sb.setBaseIng2("Sugar");
                        break;
                    case 4 :
                        name = "VanillaShake";
                        sb.setBaseIng2("Sugar");
                        break;
                    case 5 :
                        name = "ZeroShake";
                        sb.setBaseIng2("Sweetener");
                        break;
                }
                sb.produceShake(name, isLactoseFree, withCandy, withCookie);
                System.out.println(sb.getMyShake());


            } else if (input.equals("E")){
                return;
            } else {
                System.out.println("Invalid Input");
            }
        }

    }
}
