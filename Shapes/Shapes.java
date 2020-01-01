package Shapes;
import java.util.*;

/**
 * Shapes
 */
public class Shapes {
    private Scanner sc = new Scanner(System.in);
    private Parameter parameter;
    private CalculateArea area;
    private CalculateVolume volume;

    public void Square() {
        System.out.print("Enter the Side : ");
        parameter.setParameterA(sc.nextInt());
        System.out.println("Area : " + area.getArea(1));
    }
    public void Rectangle() {
        System.out.print("Enter the Length & Breath : ");
        parameter.setParameterA(sc.nextInt());
        parameter.setParameterB(sc.nextInt());
        System.out.println("Area : " + area.getArea(2));
    }
    public void Circle() {
        System.out.print("Enter the Radius : ");
        parameter.setParameterA(sc.nextInt());
        System.out.println("Area : " + area.getArea(3));
    }
    public void Cube() {
        System.out.print("Enter the Side : ");
        parameter.setParameterA(sc.nextInt());
        System.out.println("Area : " + area.getArea(4));
        System.out.println("Volume : " + volume.getVolume(4));
    }
    public void Cuboid() {
        System.out.print("Enter the Length & Breath & height : ");
        parameter.setParameterA(sc.nextInt());
        parameter.setParameterB(sc.nextInt());
        parameter.setParameterC(sc.nextInt());
        System.out.println("Area : " + area.getArea(5));
        System.out.println("Volume : " + volume.getVolume(5));
    }
    public void Cylinder() {
        System.out.print("Enter the Radius & Height : ");
        parameter.setParameterA(sc.nextInt());
        parameter.setParameterB(sc.nextInt());
        System.out.println("Area : " + area.getArea(6));
        System.out.println("Volume : " + volume.getVolume(6));
    }
    public void Cone() {
        System.out.print("Enter the Radius & Height : ");
        parameter.setParameterA(sc.nextInt());
        parameter.setParameterB(sc.nextInt());
        System.out.println("Area : " + area.getArea(7));
        System.out.println("Volume : " + volume.getVolume(7));
    }
    public void Sphere() {
        System.out.print("Enter the Radius : ");
        parameter.setParameterA(sc.nextInt());
        System.out.println("Area : " + area.getArea(8));
        System.out.println("Volume : " + volume.getVolume(8));
    }
    public void SemiSphere() {
        System.out.print("Enter the Radius : ");
        parameter.setParameterA(sc.nextInt());
        System.out.println("Area : " + area.getArea(9));
        System.out.println("Volume : " + volume.getVolume(9));
    }
    public void Funel() {
        System.out.print("Enter the Smaller_radius , Bigger_radius & Height : ");
        parameter.setParameterA(sc.nextInt());
        parameter.setParameterB(sc.nextInt());
        parameter.setParameterC(sc.nextInt());
        System.out.println("Area : " + area.getArea(10));
        System.out.println("Volume : " + volume.getVolume(10));
    }
}