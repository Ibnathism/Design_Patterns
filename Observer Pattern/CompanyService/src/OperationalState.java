import java.util.List;


public class OperationalState implements State {
    private Company context;

    @Override
    public void setContext(Company context) {
        this.context = context;
    }

    @Override
    public void stateBehaviour() {
        List<User> users = context.getUsers();
        if (context.getPreviousState() instanceof PartiallyDownState
        || context.getPreviousState() instanceof FullyDownState){
            for (User u:users
                 ) {
                if (u instanceof RegularUser){
                    u.update("Total_Bill");
                }
            }
        }
        else {
            System.out.println("Invalid Previous State name");
        }
    }



}
