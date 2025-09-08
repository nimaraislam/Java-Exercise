
import java.util.Random;
import java.util.Scanner;

public class ÖvningScannerWhileLoop {

    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(1, 7);
        int attemp = 0;
        System.out.println(randomNumber);
        System.out.println("I just rolled a six sides die, guess which number is landed on!");

        while (true) {
            int humanGuess = new Scanner(System.in).nextInt();

            if (randomNumber == humanGuess) {
                System.out.println("You Win!!");
                break;
            }
            attemp++;
            if (attemp >= 3) {
                System.out.println("Sorry!You cannot try anymore.");
                break;
            }

        }

    }
}
