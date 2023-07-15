import java.util.Scanner;
public class chartbot {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);  
		        System.out.println("Welcome to the Educational Chatbot!");
		        System.out.println("How can I assist you today?");
		        while (true) {
		            System.out.print("User: ");
		            String userQuery = scanner.nextLine();
		            String response = processUserQuery(userQuery);		            
		            System.out.println("Chatbot: " + response);
		            if (response.equalsIgnoreCase("Goodbye!") || response.equalsIgnoreCase("Bye!"))
		                break;
		        } 
		       
		        System.out.println("Educational Chatbot has exited.");
		        scanner.close();
		    }
		    
		    public static String processUserQuery(String userQuery) {
		      
		        if (userQuery.contains("math")) {
		            return "Mathematics is an important subject for problem-solving and logical reasoning.";
		        } else if (userQuery.contains("science")) {
		            return "Science helps us understand the natural world through observation and experimentation.";
		        } else if (userQuery.contains("resources")) {
		            return "You can find educational resources on websites like Khan Academy, Coursera, and edX.";
		        } else if (userQuery.equalsIgnoreCase("Goodbye!") || userQuery.equalsIgnoreCase("Bye!")) {
		            return "Goodbye!";
		        } else {
		            return "I'm sorry, I don't have information on that topic. Can I help you with something else?";
		        }
		    }
		}