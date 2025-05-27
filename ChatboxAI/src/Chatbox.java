import java.util.Scanner; // Import Scanner class

class Chatbox {

// Communication conditions
    private static String newoutput(String userResponse) {
        if (userResponse.toLowerCase().contains("hello")) {
            return "Chatbox : Hello! How can I assist you?";
        } else if (userResponse.toLowerCase().contains("how are you")) {
            return "Chatbox : Doing fine :) What about you?";
        } else if (userResponse.toLowerCase().contains("my name")) {
            return "Chatbox : Your name sounds Good buddy :) ";
        } else if (userResponse.toLowerCase().contains("joke")) {
            return "Chatbox : Why dont skeletons fight each other? Because they dont have the guts!";
        } else if (userResponse.toLowerCase().contains("ok")) {
            return "Chatbox : Great! Let me know if you need anything else.";
        } else if (userResponse.toLowerCase().contains("good morning")) {
            return "Chatbox : Good morning! Hope you have a great day!";
            } else if (userResponse.toLowerCase().contains("thank you")) {
            return "Chatbox : Welcome. ";
        } else if (userResponse.toLowerCase().contains("good night")) {
            return "Chatbox : Sleep well! Sweet dreams!";
        } else if (userResponse.toLowerCase().contains("music")) {
            return "Chatbox : I love music! Do you have a favorite genre?";
        } else if (userResponse.toLowerCase().contains("sad")) {
            return "Chatbox : Be happy :)";
        } else {
            return "Chatbox : I’m not sure how to respond to that.";
        }
    }

// Main function
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("\nChatbox : Hi! I’m your friendly chatbot. Ready for some fun conversations?");

        while (true) {
            System.out.print("User : "); 
            String input = scan.nextLine(); // Read user input

// Exit condition
            if (input.equals("exit") || input.equals("bye")) { 
                System.out.println("Chatbox : See you again :) ");
                break;
            }

            String output = newoutput(input); 
            System.out.println(output); 
        }

        scan.close(); // Close scanner
    }
}