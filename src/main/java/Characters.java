// shows that we us a scanner
import java.util.Scanner;
public class Characters {
    public static void main(String[] args)
    {
        // creates our scanner
        Scanner input = new Scanner(System.in);

        // creates our input for making the quote
        System.out.print("What is the quote?");
        String quote = input.nextLine();

        // creates the input for telling who says the quote
        System.out.print("Who said it?");
        String name = input.nextLine();

        String outString = name + " says ,"  + quote;

        // Prints our string
        System.out.println(outString);
    }
}
