import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VideoPlayerFactory vpfactory = new VideoPlayerFactory();
        Scanner scanner = new Scanner(System.in);
        String input;
        String[] fullInput;
        VideoPlayer player;
        while (true){
           input = scanner.next();
           fullInput = input.split("\\.");
           player = vpfactory.getPlayer(fullInput[1]);
           if (player==null){
               System.out.println("The input file extension is invalid. Please enter a valid file extension.");
           }
           else player.display();

        }
    }
}
