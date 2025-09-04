
public class ÖvningSkottÅr {

    public static void main(String[] args) {
        long år = Long.parseLong(args[0]);

        if ((år % 4 == 0 && år % 100 != 0) || (år % 400 == 0)) {
            System.out.println("Det är skottår");
        } else {
            System.out.println("Det är inte skottår");
        }
    }

}
