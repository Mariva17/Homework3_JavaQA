package Homework3_Lesson2;

public class Rectangle extends Figures {
    double a;
    double b;

    @Override
    public double getA() {
        return a;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getB() {
        return b;
    }

    @Override
    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double findSquare() {
        return a * b;

    }

    @Override
    public double findPerimeter() {
        return (a + b) * 2;
    }
}
