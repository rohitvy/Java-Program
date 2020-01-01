package Shapes;
import java.util.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int counter = 0, select;
        Shapes shape = new Shapes();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter \n\t 1 for Square \n\t 2 for Rectangle \n\t 3 for Circle \n\t 4 for Cube \n\t 5 for Cuboid \n\t 6 for Cylinder \n\t 7 for Cone \n\t 8 for Sphere \n\t 9 for Semi-Sphere \n\t 10 for Funnel \n\n\t\t Chose Option : ");
            select = sc.nextInt();
            switch(select){
                case 1: shape.Square(); break;
                case 2: shape.Rectangle(); break;
                case 3: shape.Circle(); break;
                case 4: shape.Cube(); break;
                case 5: shape.Cuboid(); break;
                case 6: shape.Cylinder(); break;
                case 7: shape.Cone(); break;
                case 8: shape.Sphere(); break;
                case 9: shape.SemiSphere(); break;
                case 10: shape.Funel(); break;
                default : System.out.println("Invalid Input.....");
            }
            System.out.print("Enter 1 to continue : ");
            counter = sc.nextInt();
        } while (counter == 1);
        sc.close();
    }
}