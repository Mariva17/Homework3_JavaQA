package Homework3_Lesson2;

public class Quadrate extends Figures {
    double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double findSquare() {
        return Math.pow(a, 2);
    }

    @Override
    public double findPerimeter() {
        return 4 * a;
    }
}
