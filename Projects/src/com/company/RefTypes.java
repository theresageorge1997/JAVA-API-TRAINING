package com.company;


import java.awt.*;
import java.util.Date;

public class RefTypes {
    public static void main(String args[]) {
    byte age=30;
    Date now = new Date();
    System.out.println(now);

    //primitive storage
    byte x=1;
    byte y=x;
    x=2;
    System.out.println(x);
    System.out.println(y);

    //reference storage
        Point point1 = new Point(1,1);
        Point point2 = point1;
        System.out.println(point2);
        point1.x=2;
        System.out.println(point2);

    }
}
