import java.util.ArrayList;
import java.util.List;

public class ABCcompany implements Company {
    private List<User> users = new ArrayList<>();
    private State previous;
    private State current;


    @Override
    public void addNewUser(User user) {
        users.add(user);
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
        this.setPreviousState(this.current);
        this.previous.setContext(null);
        this.setCurrentState(next);
        this.current.setContext(this);
        this.current.stateBehaviour();
    }


    @Override
    public User searchClient(String name){
        for (User u : users
             ) {
            if (u.getName().equalsIgnoreCase(name)) return u;
        }
        return null;
    }

    @Override
    public void setPreviousState(State state) {
        this.previous = state;
    }

    @Override
    public void setCurrentState(State state) {
        this.current = state;
    }

    @Override
    public State getPreviousState() {
        return previous;
    }

    @Override
    public State getCurrentState() {
        return current;
    }
}
