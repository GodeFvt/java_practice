package review.int101;
import java.util.Arrays;
public class ReviewStatic {
    public static double computeSphereVolume(double radius){
        return  (4.0 * Math.PI * Math.pow(radius,3))/3.0;
    }
    public static double computeBoxVolume(double width,double height,double depte){
        return width * height * depte ;
    }

    public static  double findMax(double v1 , double v2 ,double v3){
        double number[] = {v1,v2,v3};
        double max = Arrays.stream( number ).max().getAsDouble();
        return max ;
    }
    public static  double findMax2(double v1 , double v2 ,double v3){
        double max = v1;
        if (max >= v2) max = v2;
        if (max >= v3) max = v3;
        return max;
    }
    public static double positiveSum(double v1 , double v2 ,double v3,double v4){
        double sum = 0;
        if (v1 >= 5) sum += v1;
        if (v2 >= 5) sum += v2;
        if (v3 >= 5) sum += v3;
        if (v4 >= 5) sum += v4;
        return sum;
    }
    public static double positiveSum2(double v1 , double v2 ,double v3,double v4){
        double num[] = {v1,v2,v3,v4};
        double sum = 0;
          for (int i = 0; i < 4; i++){
            if(num[i] >= 5) {
                 sum += num[i];
            }
        }
        return sum;
    }

    public static double product(double v1,double v2,int step){
        double x = 1 ;
        while (v1 <= v2){
            x = x * v1;
            v1 = v1+step;
        }
        return x;
    }
    public static double product2 (double v1 , double v2 , double step){
        double x = 1 ;
        for(double i = v1; i <= v2 ; i += step){
            x *= i;
        }
        return x;
    }
}


