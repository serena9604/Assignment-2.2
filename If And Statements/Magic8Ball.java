
import java.util.Scanner;

public class Magic8Ball
{
 
        public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Magic 8 Ball");
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("Ask me a yes or no question");
        String question = sc.nextLine();

        int answer = (int) (Math.random()*20 + 1);
        if (answer == 1) {
            System.out.println("As I see it, yes.");
        } else if (answer == 2) {
            System.out.println("Ask again later.");
        } else if (answer == 3) {
            System.out.println("Better not tell you now.");
        }else if (answer == 4) {
            System.out.println("Cannot predict now.");
        }else if (answer == 5) {
            System.out.println("Concentrate and ask again.");
        }else if (answer == 6) {
            System.out.println("Don’t count on it.");
        }else if (answer == 7) {
            System.out.println("It is certain.");
        }else if (answer == 8) {
            System.out.println("It is decidedly so.");
        }else if (answer == 9) {
            System.out.println("Most likely.");
        }else if (answer == 10) {
            System.out.println("My reply is no.");
        }else if (answer == 11) {
            System.out.println("My sources say no.");
        } else if (answer == 12) {
            System.out.println("Outlook not so good.");
        } else if (answer == 13) {
            System.out.println("Outlook good.");
        }else if (answer == 14) {
            System.out.println("Reply hazy, try again.");
        }else if (answer == 15) {
            System.out.println("Signs point to yes.");
        }else if (answer == 16) {
            System.out.println("Very doubtful.");
        }else if (answer == 17) {
            System.out.println("Without a doubt.");
        }else if (answer == 18) {
            System.out.println("Yes.");
        }else if (answer == 19) {
            System.out.println("Yes – definitely.");
        }else if (answer == 20) {
            System.out.println("You may rely on it.");
        }

  
}
}
