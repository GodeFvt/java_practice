public class Q02StaticVariable {
    static final double  rais = 2.529;

    static double phu(double acre){
        return acre * rais;
    }
    static double eang(double rai){
        return rai / rais;
    }

    public static void main(String[] args) {
        String ids = "054";
        double acre =054.0;
        double rai =054.0;
        System.out.println(ids);
        System.out.println("rai = " + phu(acre));
        System.out.println("acre = "+ eang(rai));
    }

}
