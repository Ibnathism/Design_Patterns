import java.util.List;
import java.util.Scanner;

public class FullyDownState implements State {
    private Company context;
    private String name;

    public FullyDownState() {
        this.name = "FullyDown";
    }

    @Override
    public void setContext(Company context) {
        this.context = context;
    }

    @Override
    public void stateBehaviour() {
        List<User> users = context.getUsers();
        Scanner sc = new Scanner(System.in);
        String choice;
        if (context.getPreviousState() instanceof PartiallyDownState){
            for (User u:users
            ) {
                if (u instanceof PremiumUser){
                    u.update("From_Both");
                }
            }
        }
        else if (context.getPreviousState() instanceof OperationalState){
            for (User u:users
            ) {
                if (u instanceof RegularUser){
                    u.update("Ready_To_Pay");
                }
                else if (u instanceof PremiumUser){
                    u.update("Inform_About_DEF");
                }
                else System.out.println("Invalid User");
            }
        }
        else {
            System.out.println("Invalid Previous State name");
        }
    }




}
