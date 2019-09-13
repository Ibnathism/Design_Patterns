import java.util.List;

public interface Company {

    void addNewUser(User user);
    void removeUser(User user);

    List<User> getUsers();

    void notifyUser(State next);

    User searchClient(String name);

    void setPreviousState(State state);
    void setCurrentState(State state);
    State getPreviousState();
    State getCurrentState();
}
