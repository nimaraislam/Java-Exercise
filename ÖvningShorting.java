
import java.util.Arrays;
import java.util.Random;

public class ÖvningShorting {

    public static void main(String[] args) {

        // Random random = new Random();
        int randomNumber;
        int inputNumLimit = Integer.parseInt(args[0]);
        int[] randomNumbersArray = new int[inputNumLimit];

        for (int i = 0; i < inputNumLimit; i++) {
            randomNumber = new Random().nextInt(200) + 1;
            randomNumbersArray[i] = randomNumber;
            System.out.println(randomNumber);
        }

        for (int j = 0; j < randomNumbersArray.length - 1; j++) {
            boolean swapped = false;

            for (int k = 0; k < randomNumbersArray.length - 1; k++) {
                if (randomNumbersArray[k] > randomNumbersArray[k + 1]) {
                    int temp = randomNumbersArray[k];
                    randomNumbersArray[k] = randomNumbersArray[k + 1];
                    randomNumbersArray[k + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
            System.out.println(Arrays.toString(randomNumbersArray));
        }

        //for (int i = 0; i < randomNumbersArray.length; i++) {
        //   System.err.println(randomNumbersArray[i]);
        //}
    }

}
