
import java.util.Random;
import java.util.Scanner;

public class ÖvningScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;

        System.out.println(randomNumber);
        System.out.print("Enter number (Number must be between 1-6): ");
        number = sc.nextInt();

        if (number < 1 || number > 6) {
            System.out.println("Number should be between 1 and 6");

        } else {
            for (int i = 1; i < 3; i++) {
                if (randomNumber == number) {
                    System.out.println("Congratulations!");
                    break;
                }
                if (randomNumber != number) {
                    System.out.print("Try another number: ");
                    number = sc.nextInt();
                }

            }
            if (randomNumber != number) {
                System.out.println("Sorry!You cannot try anymore.");
            }
        }

    }

}
