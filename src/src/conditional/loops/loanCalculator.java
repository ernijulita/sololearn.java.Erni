package conditional.loops;
import java.util.Scanner;
public class loanCalculator {
    public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            //your code goes here
            int payment = (amount * 271) /1000;

            int remaining = (amount - payment);

            System.out.println(remaining);
        }
    }


