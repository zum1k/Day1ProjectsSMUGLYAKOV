package by.javatr.scanner;
import java.util.Scanner;

public class ConsoleInput {
    public int getConsoleInt(Scanner sc) {
        return sc.nextInt();
    }

    public double getConsoleDouble(Scanner sc) {
        return sc.nextDouble();
    }

    public String getConsoleString(Scanner sc) {
        return sc.nextLine();
    }
}
