package cn.wangxing.day4.java;

/**
 * Created by Administrator on 13-7-24.
 */
public class Rectangle extends Shape {

     double length = 5;
     double width = 10;

    public void getArea(){
        double area = length * width;
        System.out.print("The rectangle of area is:");
//        System.out.println(area);
    }

    public void getPerimeter(){
        double perimeter = 2 * (length + width);
        System.out.print("The rectangle of perimeter is:");
        System.out.println(perimeter);
    }
}
