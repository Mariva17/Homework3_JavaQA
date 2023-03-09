package Homework3_Lesson2;

public abstract class Figures {

    double a;
    double b;
    double r;
    double c;

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public abstract double findSquare();

    public abstract double findPerimeter();
}
