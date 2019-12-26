package Challaenge32;

/**
 * hi
 */
public class Hi {

    public static void main(String[] args) {
        System.out.println("hi..........");
        Point a=new Point(6,5);
        Point b=new Point(3,1);
        System.out.println("distace(0,0) = "+ a.distance());
        System.out.println("distace(second) = "+ a.distance(b));
        System.out.println("distace(2,2) = "+ a.distance(2,2));
        Point ptr=new Point();
        System.out.println("distace() = "+ ptr.distance());
    }
}