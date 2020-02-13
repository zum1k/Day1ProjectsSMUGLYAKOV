package by.javatr.Task7.util;

public class Distance {
    private int xo = 0;
    private int yo = 0;

    public double getDistance(int x, int y) {

        return Math.sqrt(Math.pow(x - getXo(), 2) + Math.pow(y - getYo(), 2));
    }

    public String getMinimumPoint(String a, int xa, int ya, String b, int xb, int yb) {
        double distanceA = getDistance(xa, ya);
        double distanceB = getDistance(xb, yb);
        if (distanceA > distanceB) {
            return "A";
        } else {
            return "B";
        }
    }

    public int getXo() {
        return xo;
    }

    public int getYo() {
        return yo;
    }

    public void setXo(int xo) {
        this.xo = xo;
    }

    public void setYo(int yo) {
        this.yo = yo;
    }
}
