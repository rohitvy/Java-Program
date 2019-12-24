import java.util.*;

class ScannerInput
{
    public static void main(String[] args) {
        int i,j;
        String str;
        boolean isInt;
        // Creating object of scanner class
        Scanner sc=new Scanner(System.in);
        // Asking for interger input
        System.out.print("Enter a no. : ");
        // Checking if enter input is interger
        isInt=sc.hasNextInt();
        if(isInt)
        {
            i=sc.nextInt();
            System.out.print("Enter a no. : ");
            // Checking if enter input is interger
            isInt=sc.hasNextInt();
            if(isInt)
            {
                j=sc.nextInt();
                // Skipping next line error because of pressing enter
                sc.nextLine();
                // Asking for String input
                System.out.print("Enter a string : ");
                str=sc.nextLine();
                // Closing scanner class
                sc.close();
                // Pringting messege
                System.out.println(i);
                System.out.println(j);
                System.out.println(str);
            }
            else
            {
                System.out.println("Enter an Integer.....");
            }
        }
        else
        {
            System.out.println("Enter an Integer.....");
        }
    }
}