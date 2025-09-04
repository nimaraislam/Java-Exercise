
public class övningLoop {

    public static void main(String[] args) {
        double[] recordsInSeconds = new double[]{10.8, 10.6, 10.5, 10.3, 10.1, 10.0, 9.8, 9.7, 9.6};
        double myRecordInSeconds = Double.parseDouble(args[0]);
        int count = 0;
        for (int i = 0; i < recordsInSeconds.length; i++) {

            if (myRecordInSeconds <= recordsInSeconds[i]) {
                count = count + 1;
            }
        }
        if (count != 0) {
            System.out.println("Du är snabbare än de " + count + " tidigare världsrekordshållare!");
        } else {
            System.out.println("Tyvärr!Du kunde inte slå något rekord");
        }
    }
}
