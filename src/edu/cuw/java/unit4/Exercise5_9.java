package edu.cuw.java.unit4;

public class Exercise5_9 {

    public static void main(String[] arg) {
        System.out.println("X and Y set to different numbers");
        Integer x = 15;
        Integer y = 16;

        w(x, y);

        System.out.println("X and Y set to inverse of each other from the first run");
        x = 16;
        y = 15;

        w(x, y);

        System.out.println("X and Y set to the same number");
        x = 3;
        y = 3;

        w(x, y);
    }

    public static void w(Integer x, Integer y) {
        Integer z = 9;
        Integer a = x+z;
        Integer b = y+z;
        Integer c = x-z;
        Integer d = y-z;
        Integer e = x*z;
        Integer f = y*z;
        Integer g = x/z;
        Integer h = y/z;
        Integer i = x%z;
        Integer j = y%z;


        System.out.println("X = " + x.hashCode());
        System.out.println("Y = " + y.hashCode());
        System.out.println("Z = " + z.hashCode() + "\n");
        System.out.println("X+Z: " + a.hashCode());
        System.out.println("Y+Z: " + b.hashCode());
        System.out.println("X-Z: " + c.hashCode());
        System.out.println("Y-Z: " + d.hashCode());
        System.out.println("X*Z: " + e.hashCode());
        System.out.println("Y*Z: " + f.hashCode());
        System.out.println("X/Z: " + g.hashCode());
        System.out.println("Y/Z: " + h.hashCode());
        System.out.println("X mod Z: " + i.hashCode());
        System.out.println("Y mod Z: " + j.hashCode() + "\n");
    }
}
