
public class PaintJob {
    public static void main(String[] args) {
        int i=getBucketCount(1.5, 13.5, 1.5, 5);
        System.out.println(i);
        i=getBucketCount(1.5, 13.5, 1.5);
        System.out.println(i);
        i=getBucketCount(13.5, 1.5);
        System.out.println(i);
    }
    // Method for width,height,areaPerBucket,extraBuckets
    public static int getBucketCount(double width,double height, double areaPerBucket, int extraBuckets)
    {
        // Checking validity of input
        if(width>0 && height>0 && areaPerBucket>0 && extraBuckets>=0)
        {
            // Getting no. of buckets required
            double numberOfBuckets=(width*height)/areaPerBucket;
            return ((int)(Math.ceil(numberOfBuckets)) - extraBuckets);
        }
        return -1;
    }
    // Method for width,height,areaPerBucket
    public static int getBucketCount(double width,double height, double areaPerBucket)
    {
        // Checking validity of input
        if(width>0 && height>0 && areaPerBucket>0)
        {
            // Getting no. of buckets required
            double numberOfBuckets=(width*height)/areaPerBucket;
            return ((int)(Math.ceil(numberOfBuckets)));
        }
        return -1;
    }
    // Method for area,areaPerBucket
    public static int getBucketCount(double area, double areaPerBucket)
    {
        // Checking validity of input
        if(area>0 && areaPerBucket>0)
        {
            // Getting no. of buckets required
            double numberOfBuckets=(area)/areaPerBucket;
            return ((int)(Math.ceil(numberOfBuckets)));
        }
        return -1;
    }
}