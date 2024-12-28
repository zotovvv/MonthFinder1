import java.util.Scanner;

public class MonthFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] months = {
                "Январь", "Февраль", "Март", "Апрель",
                "Май", "Июнь", "Июль", "Август",
                "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };

        while (true) {
            try {
                System.out.print("Введите номер месяца (1-12): ");
                String input = scanner.nextLine();


                int monthNumber = Integer.parseInt(input);


                if (monthNumber < 1 || monthNumber > 12) {
                    throw new IllegalArgumentException("Номер месяца должен быть в диапазоне от 1 до 12.");
                }


                System.out.println("Месяц: " + months[monthNumber - 1]);
                break;

            } catch (NumberFormatException e) {

                System.out.println("Ошибка: Введите только целое число.");
            } catch (IllegalArgumentException e) {

                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
