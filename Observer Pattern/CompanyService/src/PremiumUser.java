import java.util.Scanner;

public class PremiumUser implements User {

    private boolean isBoth;
    private String userName;
    private Company backUp = new DEFcompany();

    public void setBoth(boolean both) {
        isBoth = both;
    }

    public PremiumUser(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String str) {
        Scanner sc = new Scanner(System.in);
        String choice;
        if (str.equalsIgnoreCase("Single_Or_Both")){
            System.out.println("Notification For "+this.getClass().getName()+"   "+userName+"  : Do you want to use service from two servers? (y/n)");
            choice = sc.next();
            if (choice.equalsIgnoreCase("y")) {
                this.setBoth(true);
            }
            else setBoth(false);

            if (isBoth) {
                System.out.println("Notification For "+this.getClass().getName()+"   "+userName+"  :  Now you are having services partially from " +
                        "the server of ABC and partially from the server of DEF");
                ((DEFcompany)backUp).addPartial(this);
            }
            else {
                backUp.addNewUser(this);
                System.out.println("Notification For "+this.getClass().getName()+"   "+userName+"  : You are having service from the server of DEF");
            }
        }

        if (str.equalsIgnoreCase("Inform_About_DEF")){
            System.out.println("Notification For "+this.getClass().getName()+"   "+userName+"  : The service is now provided by our partner DEF company");
            backUp.addNewUser(this);
        }

        if (str.equalsIgnoreCase("From_Both")){
            if (!isBoth) System.out.println("Notification For "+this.getClass().getName()+"   "+userName+"  : All your data have been shifted to DEF");
            backUp.addNewUser(this);
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
