package messages;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("Enter your message: ");
        String messageText=scanner.nextLine();
        Message message = new Message(messageText, name);
        MessageProcessing messageProcessing = new MessageProcessing();
        messageProcessing.print(message);

        scanner.close();
    }
}

