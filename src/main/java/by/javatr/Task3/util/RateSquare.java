package by.javatr.Task3.util;

public class RateSquare {

    public double getOuterInnterRate(double area) {
        SquareLogic sq = new SquareLogic();
        sq.getInnerSquareArea(area);
        return area / sq.getInnerSquareArea(area);
    }
}
