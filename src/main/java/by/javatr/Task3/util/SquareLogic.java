package by.javatr.Task3.util;

public class SquareLogic {
    public double getInnerSquareArea(double area) {
        double sideOuterSquare = Math.sqrt(area);
        double sideInnterSquare = sideOuterSquare / Math.sqrt(2);
        return Math.pow(sideInnterSquare, 2);
    }

}
