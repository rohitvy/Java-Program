public class DecimalComparator{
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(1.4321, 1.4322);
    }
    public static boolean areEqualByThreeDecimalPlaces(double d1,double d2)
    {
        int t,e;
        d1=d1*1000;
        d2=d2*1000;
        t=(int)d1;
        e=(int)d2;
        d1=t/1000.0;
        d2=e/1000.0;
        if (d1==d2) {
            return true;
        }
        else{
            return false;
        }
    }
}