import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запит на введення двох рядків від користувача
        System.out.println("Введіть перший рядок:");
        String firstString = scanner.nextLine();

        System.out.println("Введіть другий рядок:");
        String secondString = scanner.nextLine();

        // Визначення довжини кожного рядка та порівняння їх
        int lengthFirst = firstString.length();
        int lengthSecond = secondString.length();

        // Виведення результату порівняння
        if (lengthFirst > lengthSecond) {
            System.out.println("Перший рядок має більше символів.");
        } else if (lengthSecond > lengthFirst) {
            System.out.println("Другий рядок має більше символів.");
        } else {
            System.out.println("Рядки мають однакову кількість символів.");
        }

        scanner.close();
    }
}
