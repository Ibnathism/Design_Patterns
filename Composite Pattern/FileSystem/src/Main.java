import java.util.Scanner;

public class Main {

    private static void menu(){
        System.out.println("Enter your choice : ");
        System.out.println("1. Create       2. Add          3. Remove           4. EnterInto");
        System.out.println("5. GoToParent   6. PrintList    7. PrintDetails     8. Exit");
    }

    private static void menu2(){
        System.out.println("Enter your choice : ");
        System.out.println("1. Drive        2. Folder       3. File");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice, choice2;
        String current="", name;
        FileSystemElement fileSystemElement = null, fileSystemElement1 = null;

try {
    while (true){
        Main.menu();
        choice = scanner.nextInt();
        switch (choice){
            case 1 :
                Main.menu2();
                choice2 = scanner.nextInt();
                switch (choice2){
                    case 1 :
                        System.out.println("Enter the name : ");
                        current = scanner.next();
                        fileSystemElement = new Drive(current);
                        break;
                    case 2 :
                        System.out.println("Enter the name : ");
                        current = scanner.next();
                        fileSystemElement = new Folder(current);
                        break;
                    case 3 :
                        System.out.println("Enter the name : ");
                        current = scanner.next();
                        fileSystemElement = new File(current);
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                System.out.println("Entered into "+current);
                break;
            case 2 :
                Main.menu2();
                choice2 = scanner.nextInt();
                switch (choice2){
                    case 1 :
                        System.out.println("Can't add drive");
                        break;
                    case 2 :
                        System.out.println("Enter the name : ");
                        name = scanner.next();
                        fileSystemElement1 = new Folder(name);
                        break;
                    case 3 :
                        System.out.println("Enter the name : ");
                        name = scanner.next();
                        fileSystemElement1 = new File(name);
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                if (fileSystemElement!=null&&fileSystemElement1!=null){
                    fileSystemElement.add(fileSystemElement1);
                    System.out.println(fileSystemElement1.getName()+" added to "+fileSystemElement.getName());
                }

                else System.out.println("Can't add");

                break;
            case 3 :
                Main.menu2();
                choice2 = scanner.nextInt();
                switch (choice2){
                    case 1 :
                        System.out.println("Enter the name : ");
                        name = scanner.next();
                        System.out.println("Can't remove drive");
                        break;
                    case 2 :
                        System.out.println("Enter the name : ");
                        name = scanner.next();
                        fileSystemElement1 = fileSystemElement.search(name);
                        break;
                    case 3 :
                        System.out.println("Enter the name : ");
                        name = scanner.next();
                        fileSystemElement1 = fileSystemElement.search(name);
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                if (fileSystemElement1!=null&&fileSystemElement!=null){
                    fileSystemElement.remove(fileSystemElement1);
                    System.out.println(fileSystemElement1.getName()+" removed from "+fileSystemElement.getName());
                }
                else System.out.println("Can't remove");
                break;
            case 4 :
                System.out.println("Enter the name : ");
                name = scanner.next();
                fileSystemElement1 = fileSystemElement.search(name);
                if (fileSystemElement1!= null) {
                    System.out.println("Entered into "+name);
                    fileSystemElement = fileSystemElement1;
                }
                else System.out.println(name+ " doesn't exist");

                break;
            case 5 :
                if (fileSystemElement.getType().equalsIgnoreCase("Drive")) System.out.println("Drive don't have a parent");
                else if (fileSystemElement.getType().equalsIgnoreCase("Folder")) {
                    fileSystemElement = ((Folder)fileSystemElement).getParent();
                    System.out.println("Entered into "+fileSystemElement.getName());
                }
                else if (fileSystemElement.getType().equalsIgnoreCase("File")) {
                    fileSystemElement = ((File)fileSystemElement).getParent();
                    System.out.println("Entered into "+fileSystemElement.getName());
                }
                break;
            case 6 :
                System.out.println(FilePrinter.printList(fileSystemElement));
                break;
            case 7 :
                System.out.println(FilePrinter.printDetails(fileSystemElement));
                break;
            case 8 :
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        if (choice==8) break;
    }
} catch (Exception e){
    System.out.println("Invalid Input");
}

    }
}
