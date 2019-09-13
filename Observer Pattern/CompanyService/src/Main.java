import java.util.Scanner;

public class Main {

    private static void menu(){
        System.out.println("Enter your choice : ");
        System.out.println("1. Create New Client            2. Add Client         3. Remove");
        System.out.println("4. Change State of ABC              5. Exit");
    }

    private static void userMenu(){
        System.out.println("Enter your choice : ");
        System.out.println("1. Premium       2. Regular");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice, choice2;

        Company company = new ABCcompany();


        try {
        while (true) {
                Main.menu();
                choice = scanner.nextInt();
                User user;
                State state;
                String name;
                switch (choice) {
                    case 1:
                        Main.userMenu();
                        choice2 = scanner.nextInt();
                        System.out.println("Enter name of the User : ");
                        name = scanner.next();
                        switch (choice2) {
                            case 1:
                                user = new PremiumUser(name);
                                break;
                            case 2:
                                user = new RegularUser(name);
                                break;
                            default:
                                System.out.println("Invalid Input");
                                user = null;
                        }
                        if (user != null) System.out.println("New client Created. Name : " + user.getName());
                        else System.out.println("No new client created");

                        break;
                    case 2:
                        Main.userMenu();
                        choice = scanner.nextInt();
                        System.out.println("Enter the name : ");
                        name = scanner.next();
                        user = company.searchClient(name);
                        if (user == null) {
                            switch (choice) {
                                case 1:
                                    user = new PremiumUser(name);
                                    company.addNewUser(user);
                                    break;
                                case 2:
                                    user = new RegularUser(name);
                                    company.addNewUser(user);
                                    break;
                                default:
                                    System.out.println("Invalid Input");
                                    user = null;
                            }
                            if (user!=null)System.out.println("New Client Added. Name : "+user.getName());
                            else System.out.println("Invalid User");
                        } else System.out.println("Client already exists");

                        break;
                    case 3:
                        System.out.println("Enter the name : ");
                        name = scanner.next();
                        user = company.searchClient(name);
                        if (user != null) {
                            company.removeUser(user);
                        } else System.out.println("Can't remove, Client Doesn't exist");
                        break;
                    case 4:
                        state = company.getCurrentState();
                        if (state == null) {
                            System.out.println("Enter Current State : ");
                            Main.stateMenu();
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    state = new OperationalState();
                                    break;
                                case 2:
                                    state = new PartiallyDownState();
                                    break;
                                case 3:
                                    state = new FullyDownState();
                                    break;
                                default:
                                    System.out.println("Invalid Input");
                                    state = null;
                                    break;
                            }
                            if (state != null) company.setCurrentState(state);
                            else System.out.println("Invalid State");
                        } else System.out.println("Current state of the company is " + state.getClass().getName());

                        System.out.println("Enter Next State");
                        Main.stateMenu();
                        choice2 = scanner.nextInt();


                        switch (choice2) {
                            case 1:
                                state = new OperationalState();
                                break;
                            case 2:
                                state = new PartiallyDownState();
                                break;
                            case 3:
                                state = new FullyDownState();
                                break;
                            default:
                                System.out.println("Invalid Input");
                                state = null;
                                break;
                        }
                        if (state != null) {
                            company.notifyUser(state);
                        } else System.out.println("Invalid State");

                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                if (choice == 5) break;
            }
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }


    }

    private static void stateMenu() {
        System.out.println("Enter your choice : ");
        System.out.println("1. Operational State       2. Partially Down State      3. Fully Down State");
    }
}
