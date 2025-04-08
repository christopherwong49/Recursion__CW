import java.util.Scanner;
import java.util.ArrayList;

public class As1_Main {

    public static Scanner input = new Scanner( System.in );

    public static void run() {
        System.out.println("Assign 1 Network Messages");

        ArrayList <As1_Message> allMessages = new ArrayList<>();

        allMessages.add(new As1_Message("Client3: repeated login failure"));
        allMessages.add(new As1_Message("Client2:filed password reset on file"));
        allMessages.add(new As1_Message("Server1: file not found"));
        allMessages.add(new As1_Message("Server3: ping not returned"));
        allMessages.add(new As1_Message("Server1:write file error on disk DSK1"));
        allMessages.add(new As1_Message("Server2:disk failure on DSK2"));
        allMessages.add(new As1_Message("Server2:diskette diskette"));
        allMessages.add(new As1_Message("Client3:    diskette disk"));
        allMessages.add(new As1_Message("Router1: missing packet"));
        allMessages.add(new As1_Message("PC4: power surge detected"));

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Add Message");
            System.out.println("2. Print All Messages");
            System.out.println("3. Scan for Error Messages");
            System.out.println("4. EXIT");
            int option = input.nextInt();
            input.nextLine();
            System.out.println();

            if (option == 1) {
                System.out.println("Input message");
                allMessages.add(new As1_Message(input.nextLine()));
            } else if (option == 2) {
                System.out.println("Security Message    Machine ID    Machine Type");
                for (As1_Message message: allMessages) {
                    System.out.println(message.getMachineType() + "___" + message.getMachineId() + "___" + message.getWarning() + ".");
                }
            } else if (option == 3) {
                System.out.println("Input error");
            } else if (option == 4) {
                break;
            } else {
                System.out.println("That is not an available option");
            }
            System.out.println("Logging out. Good Bye.");        }//while

    }//main

}//class