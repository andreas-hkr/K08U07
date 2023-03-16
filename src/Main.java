import java.util.Calendar;

public class Main {
    static String date() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = 1 + Calendar.getInstance().get(Calendar.MONTH);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        return String.format("%d-%02d-%02d",year, month, day);
    }

    public static void main(String[] args) {
        // Skapa och anropa en metod som returnerar dagens datum
        // på formatet yyyy-mm-dd

        System.out.println("Dagens datum: " + date());
    }
}