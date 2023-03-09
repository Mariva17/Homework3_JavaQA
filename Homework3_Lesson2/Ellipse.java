package Homework3_Lesson2;

public class Ellipse extends Figures {
    @Override
    public double findSquare() {
        return Math.PI * a * b;
    }

    @Override
    public double findPerimeter() {
        return 4 * ((Math.PI * a * b + (a - b)) / (a + b));
    }
}
