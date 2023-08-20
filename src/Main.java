import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String start_date = "09/24/2021";
        String end_date = "10/17/2021";

        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

        Date dateStart = null;
        Date dateEnd = null;
        try {
            dateStart = format.parse(start_date);
            dateEnd = format.parse(end_date);

            System.out.println(format.format(dateStart));
            System.out.println(format.format(dateEnd));

        } catch (ParseException exception) {
            exception.printStackTrace();
        }
        long raznica = dateEnd.getTime() - dateStart.getTime();
        int days = (int) (raznica/(1000 * 60 * 60 *24));
        System.out.println(days);
    }
}