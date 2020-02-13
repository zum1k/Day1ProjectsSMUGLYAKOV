package by.javatr.Task8.util;

public class Function {
    public double getValue(int x){
        if( x >= 3){
            return - x * x + 3 * x + 9;
        }
        else {
            return 1 / (Math.pow(x, 3) - 6);
        }

    }
}
