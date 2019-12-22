public class LargestPrime {
    public static void main(String[] args) {
        System.out.print(getLargestPrime(7));
    }
    public static int getLargestPrime(int number)
    {
        int i,j,k;
        if(number>1)
        {
            for(i=number;i>1;i--)
            {
                for(j=i-1;j>=1;j--)
                {
                    if(i%j == 0)
                    {
                        break;
                    }
                }
                if(j==1)
                {
                    for(k=1;k*i <= number; k++)
                    {
                        if(k*i == number)
                        {
                            return i;
                        }
                    }
                }
            }
        }
        return -1;
    }
}