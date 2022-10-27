package bmi;

public class Bmi {

    public static void main(String[] args) {
        bmical got = new bmical("got", 170, 60);
        System.out.println(got.toString());
        System.out.println("bmi=" + got.bmi());
    }
}
