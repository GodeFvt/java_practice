
public class Q01StaticMethod {

    public static void main(String[] args) {
        String ids = "054";
        double meters =054.0;
        double yard =054.0;
        System.out.println(ids);
        System.out.println("wah = " + phutTinan(meters));
        System.out.println("meters = "+ phakSaweang(yard));
    }
    public static double phutTinan(double meters){
        return meters * 0.5;
    }
    public static double phakSaweang(double yard){
        return yard * 0.91;
    }


}
