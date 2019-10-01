
import java.util.Scanner;

public class GradeBot
{
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("GradeBot");
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("What was your test out of?");
        int total = sc.nextInt();
        System.out.println("What did you get?");
        double score = sc.nextDouble();
        double percent = (score/total) * 100;
        if (percent <= 100 && percent >= 86) {
            System.out.println("You got "+ percent +"%! That's an A ... keep up the good work.");

        }
        else if (percent< 86 && percent >= 73) {
            System.out.println("You got "+ percent +"%! That's a B ... not too bad.");

        }
        else if (percent< 73  && percent >= 67) {
            System.out.println("You got "+ percent +"%!  That's a C+ ... you passed, but you can do better!");

        }
        else if (percent< 67 && percent >= 60) {
            System.out.println("You got "+ percent +"%! That's a C ... you passed but not by much!");
        } else if (percent< 60 && percent >= 50) {
            System.out.println("You got "+ percent +"%! That's a C- ... careful there.");
        }
        else if (percent< 50 && percent >= 0) {
            System.out.println("You got "+ percent +"%! That's an F ... study harder and maybe you'll pass next time.");
        } else if (percent < 0 || percent > 100){
            System.out.println("Silly human, that's not possible. Quit joking around.");
        }
    }
}
