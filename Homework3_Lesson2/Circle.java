package Homework3_Lesson2;

public class Circle extends Figures {
    double r;

    @Override
    public double getR() {
        return r;
    }

    @Override
    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double findSquare() {
        return Math.PI * r * r;
    }

    @Override
    public double findPerimeter() {
        return 2 * Math.PI * r;
    }
}
