package by.javatr.Task5.util;

public class PerfectNumber {
    public boolean checkPerfectNumber(int number) {
        int summ = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) summ += i;
        }
        if (summ == number) {
            return true;
        }
        else {
            return false;
        }
    }
}
