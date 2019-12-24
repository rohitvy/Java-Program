import java.util.*;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    } 
    public static void inputThenPrintSumAndAverage() {
        // Initializing Variables
        int number,sum=0;
        long average;
        double n=0;
        boolean isInt;
        // Creating Scanner class object
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            // Check if input is integer
            isInt=sc.hasNextInt();
            if(!isInt)  break;
            number=sc.nextInt();    // Storing input
            sum+=number;            // Increasing sum
            n++;                    // Increasing counter
        }
        // Closing scanner object
        sc.close();
        // For printing error free output
        if(n==0)    average=0;
        else        average=Math.round(sum/n);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}