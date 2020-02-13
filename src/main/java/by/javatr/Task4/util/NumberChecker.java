package by.javatr.Task4.util;

public class NumberChecker {
    public boolean checkNumbers(int a, int b, int c, int d){
        int[]numbers = new int[]{a,b,c,d};
        int evenCounter = 0;
        for (int i:numbers) {
            if(i%2==0){
                evenCounter++;
            }
        }
        if(evenCounter>=2){
            return true;
        }
        return false;
    }
}
