
public class övningBoolean {

    public static void main(String[] args) {
        boolean id = args[0].equals("true");
        //boolean id = Boolean.parseBoolean(args[0]);
        int dayOfTheWeek = Integer.parseInt(args[1]);
        int age = Integer.parseInt(args[2]);
        boolean isFull = Boolean.parseBoolean(args[3]);

        if (id && !isFull) {
            if (age < 18) {
                System.out.println("Tyvärr!Du får inte komma in eftersom din ålder tillåter dig inte!");

            } else if (dayOfTheWeek == 6 || dayOfTheWeek == 7) {
                if (age >= 18) {
                    {
                        System.out.println("Du får komma idag!");
                    }
                }

            } else if (dayOfTheWeek > 0 && dayOfTheWeek <= 5) {
                if (age >= 21) {
                    {
                        System.out.println("Du får komma in!");
                    }
                } else if (age >= 18 && age < 21) {
                    {
                        System.out.println("Tyvärr!Du får inte komma på vardagar!");
                    }
                }
            }
        } else if (!id || isFull) {
            if (!id && isFull) {
                System.out.println("Tyvärr!Du får inte komma in eftersom eftersom din id är ogiltig och lokalen är ocså full!");
            } else if (isFull) {
                System.out.println("Tyvärr!Du får inte komma in eftersom eftersom lokalen är full!");
            } else if (!id) {
                System.out.println("Tyvärr!Du får inte komma in eftersom din id är ogiltig!");
            }
        }
    }
}
