package cn.wangxing.day4.java;

/**
 * Created by Administrator on 13-7-24.
 */
public class Test {

    public static void main(String[] args) {

        Shape cricle = new Cricle();
        cricle.getArea();
        cricle.getPerimeter();

        Shape square = new Square();
        square.getArea();
        square.getPerimeter();

        Shape rectangle = new Rectangle();
        rectangle.getArea();
        rectangle.getPerimeter();

        Shape triangle = new Triangle();
        triangle.getArea();
        triangle.getPerimeter();

    }
}
