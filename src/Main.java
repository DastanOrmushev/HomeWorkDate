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

        SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");

        Date dateStart = null;
        Date dateEnd = null;
        try {
            dateStart = format1.parse(start_date);
            dateEnd = format1.parse(end_date);

            System.out.println(format1.format(dateStart));
            System.out.println(format1.format(dateEnd));

        } catch (ParseException exception) {
            exception.printStackTrace();
        }
        long raznica = dateEnd.getTime() - dateStart.getTime();
        int days = (int) (raznica/(1000 * 60 * 60 *24));
        System.out.println(days);

         /*
        Задача 2.
        Задана определенная дата экзамена: например, 18.10.2023.
        С консоли вводится дата в виде String в таком же формате(dd.MM.yyyy)(System.IN).
        Требуется сравнить дату экзамена и введенную дату.
        Если дни равны, вывести ответ: "Экзамен сегодня";
        Если введенная дата раньше, вывести: "До экзамена осталось " + кол-во  оставшихся дней.
        Если дата позже, то вывести: "Экзамен был " + кол-во прошедших дней  + " назад."
        */

       // Date dateExam = new Date();
        //dateExam.getTime(18.04.2023);
       // LocalDate examDate = LocalDate.of(2022,05,20);

        String examDate = "18.10.2023";



        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String userDate = scanner.next();
        System.out.println("User date: " + userDate);

        SimpleDateFormat format2 = new SimpleDateFormat("dd.MM.yyyy");

        Date userDateFormat = null;
        Date examDateFormat = null;

        try {

            examDateFormat = format2.parse(examDate);
            userDateFormat = format2.parse(userDate);

            System.out.println(format2.format(examDateFormat));
            System.out.println(format2.format(userDateFormat));
//     //       throw new RuntimeException("Введите в формате dd.mm.yyy ");
//        }catch (RuntimeException exp),ParseException exception1); {
//        exception1.printStackTrace();
//           System.err.println(exception1.getMessage());
//            Throwable exp = null;
//            System.out.println(exp.getMessage());
//
//        }

        } catch (ParseException exception1) {
            exception1.printStackTrace();
            System.err.println(exception1.getMessage());
       }
        long difDays = examDateFormat.getTime() - userDateFormat.getTime();
        int res = (int) (difDays/(1000 * 60 * 60 *24));

        System.out.println(res);
        if (res == 0){
            System.out.println("Экзамен сегодня");
        }else if(res > 0){
            System.out.println("До экзамена осталось " + res + " д.");
        }else if (res < 0) {

            System.out.println("Экзамен был " + Math.abs(res) + " д. назад.");
        }
    }
}