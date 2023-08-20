import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
             /*
            Задача 1. Даны две даты в виде String:
            String start_date = "09/24/2021";
            String end_date = "10/17/2021"
            Найти кол-во дней между этими датами. Результат вывести типом int.
            */

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

         /*
        Задача 2.
        Задана определенная дата экзамена: например, 18.04.2022.
        С консоли вводится дата в виде String в таком же формате(dd.MM.yyyy)(System.IN).
        Требуется сравнить дату экзамена и введенную дату.
        Если дни равны, вывести ответ: "Экзамен сегодня";
        Если введенная дата раньше, вывести: "До экзамена осталось " + кол-во  оставшихся дней.
        Если дата позже, то вывести: "Экзамен был " + кол-во прошедших дней  + " назад."
        */
        //Date dateExam = new Date(18.04.2022);
        LocalDate examDate = LocalDate.of(2022,05,20);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String userDate = scanner.next();



    }
}