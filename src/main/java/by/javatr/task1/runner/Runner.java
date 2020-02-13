package by.javatr.task1.runner;


/*Написать программу, позволяющую по последней цифре числа определить последнюю цифру его
квадрата.
*/


import by.javatr.scanner.ConsoleInput;
import by.javatr.task1.util.DigitSquare;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Runner runner = new Runner();
        System.out.println("Введите число.");
        String s = runner.run();
        System.out.println(s);

    }

    public String run() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            ConsoleInput console = new ConsoleInput();
            int number = console.getConsoleInt(sc);
            DigitSquare ds = new DigitSquare();
            int lastDigitSquare = ds.getSquareLastDigit(number);
            return "Квадрат последней цифры целого числа равен:  " + lastDigitSquare;
        }
        return "Ошибка! Вы ввели не целое число, ведите целое число.";
    }
}
