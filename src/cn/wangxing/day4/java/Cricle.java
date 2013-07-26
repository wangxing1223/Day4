package cn.wangxing.day4.java;

/**
 * Created by Administrator on 13-7-24.
 */
public class Cricle extends Shape{

    double radius = 2;

    public void getArea(){
        double area = 3.14*radius*radius;
        System.out.print("The cricle of area is:");
        System.out.println(area);
    }

    public void  getPerimeter(){
        double perimeter = 2* 3.14 * radius;
        System.out.print("The cricle of perimeter is:");
        System.out.println(perimeter);
    }
}
