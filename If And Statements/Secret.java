
import java.util.Scanner;

public class Secret
{
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Secret");
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("What's the password?");
        String password = sc.nextLine();
        
        if ("dragon".equals(password)) {
            System.out.println("Correct! My secret is: I am Batman.");
        }
        else {
           System.out.println("Incorrect Password! My secret is still safe ..."); 
        }
    }

}
