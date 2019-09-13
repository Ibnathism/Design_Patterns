import java.util.List;

public class PartiallyDownState implements State {
    private Company context;
    private String name;


    @Override
    public void setContext(Company context) {
        this.context = context;
    }

    @Override
    public void stateBehaviour() {
        List<User> users = context.getUsers();
        if (context.getPreviousState() instanceof OperationalState){
            for (User u:users
            ) {
                if (u instanceof RegularUser){
                    u.update("Limited_Or_Pay");
                }
                else if (u instanceof PremiumUser){
                    u.update("Single_Or_Both");
                }
                else System.out.println("Invalid User");
            }
        }

    }




}
