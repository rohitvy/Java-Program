package Shapes;

/**
 * CalculateArea
 */
public class CalculateArea {
    // Parameters
    private Parameter parameters;
    private double a = parameters.getParameterA();
    private double b = parameters.getParameterB();
    private double c = parameters.getParameterC();

    // Method to calculate Area
    public double getArea(int shape) {
        switch(shape) {
            case 1: // Square
                return Math.pow(a, 2);
            case 2: // Rectangle
                return (a * b);
            case 3: // Circle
                return (Math.PI * Math.pow(a, 2));
            case 4: // Cube
                return (6 * Math.pow(a, 2));
            case 5: // Cuboid
                return (2 * (a*b + b*c + a*c));
            case 6: // Cylinder
                return (2 * Math.PI * (a+b));
            case 7: // Cone
                // Calculating slant height
                b = Math.sqrt(a*a + b*b);
                return (Math.PI * a * (a+b));
            case 8: // Sphere
                return (4 * Math.PI * Math.pow(a,2));
            case 9: // Semi-Sphere
                return (3 * Math.PI * Math.pow(a,2));
            case 10: // Funel
                // Calculating slant height
                c = Math.sqrt(Math.pow(c, 2) + Math.pow(b-a, 2));
                return ((Math.PI * c * (a+b)) + (Math.PI * a * a) + (Math.PI * b * b));
        }
        return 0;
    }
}