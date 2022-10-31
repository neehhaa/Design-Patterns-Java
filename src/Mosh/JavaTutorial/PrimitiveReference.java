package Mosh.JavaTutorial;

import java.awt.*;

public class PrimitiveReference {
    public static void main(String[] args) {
        //Primitive is independent
        byte a = 1;
        byte b = a;
        a = 2;
        System.out.println(b); //1

        //Reference is dependent
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
