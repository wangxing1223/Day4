package cn.wangxing.day4.java;

/**
 * Created by Administrator on 13-7-24.
 */
public class Triangle extends Shape {

    double a = 3;
    double b = 4;
    double c = 5;

    public void getArea(){
        double p = (a + b + c)/2;
        double area =Math.pow(p * (p-a)*(p-b)*(p-c),0.5);
        System.out.print("The triangle of area is:");
        System.out.println(area);
    }

    public  void getPerimeter(){
        double perimeter = a + b + c;
        System.out.print("The triangle of perimeter is:");
        System.out.println(perimeter);
    }

}
