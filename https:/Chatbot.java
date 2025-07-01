import java.util.Scanner;



public class ChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input;

        System.out.println("ChatBot: Hello! I'm a simple chatbot. Type 'bye' to exit.");



        while (true) {

            System.out.print("You: ");

            input = sc.nextLine().toLowerCase();



            if (input.contains("hi") || input.contains("hello")) {

                System.out.println("ChatBot: Hello there! How can I help you?");

            } else if (input.contains("how are you")) {

                System.out.println("ChatBot: I'm just a program, but I'm doing great!");

            } else if (input.contains("bye")) {

                System.out.println("ChatBot: Goodbye! Have a nice day!");

                break;

            } else {

                System.out.println("ChatBot: I'm not sure how to respond to that.");

            }

        }

    }

}

