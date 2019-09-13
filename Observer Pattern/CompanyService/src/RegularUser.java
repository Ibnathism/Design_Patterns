import java.util.Scanner;

public class RegularUser implements User {
    private boolean isPaying;
    private boolean isLimited;
    private String userName;
    private Company backUp = new DEFcompany();


    public void setPaying(boolean paying) {
        isPaying = paying;
    }

    public void setLimited(boolean limitedOrPay) {
        this.isLimited = limitedOrPay;
        if (isLimited) setPaying(false);
        else setPaying(true);
    }

    public RegularUser(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String str) {
        Scanner sc = new Scanner(System.in);
        String choice;
        if (str.equalsIgnoreCase("Total_Bill")){
            if (isPaying){
                System.out.println("Notification For "+this.getClass().getName()+"   "+userName+"  : Here's your total bill . . . . $x");
            }
        }

        if (str.equalsIgnoreCase("Limited_Or_Pay")){
            System.out.println("Notification For "+this.getClass().getName()+"   "+userName+"  : Do you want to pay $20 per hour for additional functionality? (y/n)");
            choice = sc.next();
            if (choice.equalsIgnoreCase("y")){
                this.setLimited(false);
            }
            else setLimited(true);


            if (isLimited){
                System.out.println("Notification For "+this.getClass().getName()+"   "+userName+"  : You are using limited functionality");
            }
            else {
                backUp.addNewUser(this);
                System.out.println("Notification For "+this.getClass().getName()+"   "+userName+"  : You are paying $20 per hour to enjoy the " +
                        "full functionality taking service from the server DEF. " +
                        "All your data have been copied to the server of DEF");
            }
        }

        if (str.equalsIgnoreCase("Ready_To_Pay")){
            if (isLimited) System.out.println("Notification For "+this.getClass().getName()+"   "+userName+"  : The service is fully down");
            else {
                backUp.addNewUser(this);
                System.out.println("Notification For "+this.getClass().getName()+"   "+userName+"  : You are paying $20 per hour to enjoy the" +
                        "full functionality taking service from the server DEF. " +
                        "All your data have been copied to the server of DEF");
            }
        }





    }

    @Override
    public void setName(String name) {
        userName = name;
    }

    @Override
    public String getName() {
        return userName;
    }

}
