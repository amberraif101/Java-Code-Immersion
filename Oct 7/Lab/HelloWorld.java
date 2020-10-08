import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
       //String firstName = "Amber";
       //String lastName = "Raiford";
       // System.out.println("Hello, World\n");
       // System.out.println("Today is awesome\n");

       //System.out.printf("Hello %s!\n", firstName);
       //System.out.printf("Goodbye %s %s!\n", firstName, lastName);

       String Name = "Amber";
       String adj = "lovely";
       String noun = "date";
       String secondnoun = "dance";
       String number = "3";
       String yourname = "George";

       Scanner input = new Scanner(System.in);
       System.out.printf("Dear %s, You are %s and I want to be your %s! I want to go the %s with you in %s days\n", Name, adj, noun, secondnoun, number);
       System.out.printf("Sincerely, %s\n", yourname);
    }
}
