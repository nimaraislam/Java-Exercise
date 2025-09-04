
import java.time.LocalTime;

public class övningModolus {

    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0]);
        int minutes = Integer.parseInt(args[1]);

        LocalTime currentTime = LocalTime.now();
        int currentHour = currentTime.getHour();
        int currentMinute = currentTime.getMinute();

        int extraHour = 0;
        int newMinute = 0;
        int newHour = 0;

        newMinute = currentMinute + minutes;
        if (newMinute >= 60) {
            extraHour = (int) Math.floor(newMinute / 60);
            newMinute = newMinute % 60;
        }
        newHour = currentHour + hours + extraHour;
        if (newHour >= 24) {
            newHour = newHour % 24;
        }

        System.out.println(newHour + ":" + newMinute);
    }
}
