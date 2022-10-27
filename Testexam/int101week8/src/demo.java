public class demo {

    public static void main(String[] args) {
        System.out.println(product(2,1,6));
        System.out.println(computeProduct(2,1,6));

    }

    public static double computeProduct(int s,int i,int e){
        int x = 1;
        while(s<=e){
            if(s%2!=0){
                x *= s;
            }
            s += i;
        }
        return x;
    }

    public static double product2(double v1,double v2,int step){
        double x = 1 ;
        while (v1 <= v2){
            x = x * v1;
            v1 = v1+step;
        }
        return x;
    }
}
