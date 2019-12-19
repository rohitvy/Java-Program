public class SpeedConverter{
    public static void main(String[] args) {
        printConversion(95.75);
    }
    public static void printConversion(double kilometersPerHour)
    {
        long milesPerHour=toMilesPerHour(kilometersPerHour);
        if(milesPerHour==-1)
            System.out.println("InvalidValue");
        else
            System.out.println(kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
    }
    
    public static long toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour<0)
        {
            return -1;
        }
        else
        {
            return (long)Math.ceil(kilometersPerHour*0.621);
        }
    }
}