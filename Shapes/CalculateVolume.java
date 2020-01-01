package Shapes;

/**
 * CalculateVolume
 */
public class CalculateVolume {
    // Parameters
    private Parameter parameters;
    private double a = parameters.getParameterA();
    private double b = parameters.getParameterB();
    private double c = parameters.getParameterC();

    // To calculate Volume of shape
    public double getVolume(int shape) {
        switch(shape) {
            case 4: // Cube
                return Math.pow(a, 3);
            case 5: // Cuboid
                return (a*b*c);
            case 6: // Cylinder
                return (Math.PI * Math.pow(a,2) * b);
            case 7: // Cone
                return (0.3333 * Math.PI * Math.pow(a,2) * b);
            case 8: // Sphere
                return (4/3 * Math.PI * Math.pow(a,3));
            case 9: // Semi-Sphere
                return (2/3 * Math.PI * Math.pow(a,2));
            case 10: // Funel
                return (1/3 * (Math.PI * c) + (a * a) + (b * b) + (a*b));
        }
        return 0;
    }
}