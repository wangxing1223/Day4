package cn.wangxing.day4.java;

/**
 * Created by Administrator on 13-7-24.
 */
public class Square extends Shape {

     double sidelength = 2;

    public void getArea(){
        double area = sidelength * sidelength;
        System.out.print("The square of area is:");
        System.out.println(area);
    }

    public void getPerimeter(){
        double perimeter = 4 * sidelength;
        System.out.print("The square of perimeter is:");
        System.out.println(perimeter);
    }

}
