package Homework3_Lesson2;

import java.util.Scanner;

public class Main {
    /*
    есть классы Круг, Овал, Прямоугольник, Фигура, Квадрат, Треугольник. Создайте логически правильную иерархию данных классов.
    Реализуйте метод, который возвращает площадь фигуры и периметр фигуры. Подумайте, какие поля нужны в каждом классе.
    Создайте мини-приложение - справочник по геометрии. Суть приложения - пользователь с клавиатуры выбирает нужную фигуру
     и задаёт её параметры, в результате получает ответ, чему равна площадь и периметр выбранной фигуры.
     */
    public static void main(String[] args) {

//        Figures figures = new Quadrate();

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите геометрическую фигуру");
        String fig = sc.nextLine();
//        System.out.println("Введите длину стороны.");
 //       double a = sc.nextDouble();


        if (fig.equals("Квадрат")) {
            Figures figures = new Quadrate();
            System.out.print("Введите длину стороны: ");
            double a = sc.nextDouble();
            figures.setA(a);
            System.out.println("Площадь квадрата равна " + figures.findSquare() + "кв.см.");
            System.out.println("Периметр квадрата равен " + figures.findPerimeter() + "см.");
        } else if (fig.equals("Прямоугольник")) {
            Figures figures2 = new Rectangle();
            System.out.print("Введите ширину стороны: ");
            double a = sc.nextDouble();
            System.out.print("Введите длину стороны: ");
            double b = sc.nextDouble();
            figures2.setA(a);
            figures2.setB(b);
            System.out.println("Площадь прямоугольника равна " + figures2.findSquare() + "кв.см.");
            System.out.println("Периметр квадрата равен " + figures2.findPerimeter() + "см.");
        } else if (fig.equals("Круг")) {
            Figures figures3 = new Circle();
            System.out.print("Введите радиус круга: ");
            double r = sc.nextDouble();
            figures3.setR(r);
            System.out.println("Площадь круга равна " + figures3.findSquare() + "кв.см.");
            System.out.println("Периметр круга равен " + figures3.findPerimeter() + "см.");
        } else if (fig.equals("Овал")) {
            Figures figures4 = new Ellipse();
            System.out.print("Введите длину малой полуоси овала: ");
            double a = sc.nextDouble();
            System.out.print("Введите длину большой полуоси овала: ");
            double b = sc.nextDouble();
            figures4.setA(a);
            figures4.setB(b);
            System.out.println("Площадь овала равна " + figures4.findSquare() + "кв.см.");
            System.out.println("Периметр овала равен " + figures4.findPerimeter() + "см.");
        } else if (fig.equals("Треугольник")) {
            Figures figures5 = new Triangle();
            System.out.println("Введите длину стороны: ");
            double a = sc.nextDouble();
            System.out.println("Введите длину стороны: ");
            double b = sc.nextDouble();
            System.out.println("Введите длину стороны: ");
            double c = sc.nextDouble();
            figures5.setA(a);
            figures5.setB(b);
            figures5.setC(c);
            System.out.println("Площадь треугольника равна " + figures5.findSquare() + "кв.см.");
            System.out.println("Периметр треугольника равен " + figures5.findPerimeter() + "см.");
        } else {
            System.out.println("Нет такой геометрической фигуры.");
        }

    }
}




