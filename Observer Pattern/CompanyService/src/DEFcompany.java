import java.util.ArrayList;
import java.util.List;

public class DEFcompany implements Company {

    private List<User> users = new ArrayList<>();
    private List<User> partials = new ArrayList<>();


    @Override
    public void addNewUser(User user) {
        users.add(user);
        System.out.println("Now DEF company is giving service to the client \""+user.getName()+"\".");
    }

    public void addPartial(User user) {
        partials.add(user);
        System.out.println("Now DEF company is giving partial service to the client \""+user.getName()+"\".");
    }

    @Override
    public void removeUser(User user) {
        users.remove(user);
    }


    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void notifyUser(State next) {

    }

    @Override
    public User searchClient(String name) {
        return null;
    }

    @Override
    public void setPreviousState(State state) {

    }

    @Override
    public void setCurrentState(State state) {

    }

    @Override
    public State getPreviousState() {
        return null;
    }

    @Override
    public State getCurrentState() {
        return null;
    }
}
