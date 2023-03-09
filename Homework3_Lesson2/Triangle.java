package Homework3_Lesson2;

public class Triangle extends Figures {
    double c;

    @Override
    public double getC() {
        return c;
    }

    @Override
    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double findSquare() {
//        double halfPer = (a + b + c) / 2;
        return Math.sqrt((a + b + c) / 2 * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
    }

    @Override
    public double findPerimeter() {
        return a + b + c;
    }
}
