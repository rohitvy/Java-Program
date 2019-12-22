public class NumbertoWords
{
    public static void main(String[] args) {
        numbertoWords(100);
        System.out.println();
        numbertoWords(134340);
        System.out.println();
        numbertoWords(34);
    }
    public static void numbertoWords(int number)
    {
        int n1=number,i;
        if(number >= 0)
        {
            for (i = reverse(number); i > 0; i/=10) 
            {
                switch(i%10)
                {
                    case 0: System.out.print("Zero "); break;
                    case 1: System.out.print("One "); break;
                    case 2: System.out.print("Two "); break;
                    case 3: System.out.print("Three "); break;
                    case 4: System.out.print("Four "); break;
                    case 5: System.out.print("Five "); break;
                    case 6: System.out.print("Six "); break;
                    case 7: System.out.print("Seven "); break;
                    case 8: System.out.print("Eight "); break;
                    case 9: System.out.print("Nine "); break;
                }
            }
            int n2=reverse(number);
            n1=getDigitCount(n1);
            n2=getDigitCount(n2);
            if(n1 != n2)
            {
                for(i = Math.abs(n1-n2);i>0;i--)
                {
                    System.out.print("Zero ");
                }
            }
        }
        else
        {
            System.out.println("Invalid Value");
        }
    }
    public static int reverse(int number)
    {
        int i=number, sum=0;
        if(number < 0)  i = number * -1;
        for(; i>0; i/=10)
        {
            sum= sum*10 + (i%10);
        }
        if(number < 0)  return (sum * -1);
        else            return sum;
    }
    public static int getDigitCount(int number)
    {
        int i=number , digit=0;
        if(number >= 0)
        {
            for(;i>0;i/=10)
            {
                digit++;
            }
            return digit;
        }
        return -1;
    }
}