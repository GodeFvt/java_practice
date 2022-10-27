package starterpack27;

public class Bmi {

    public static void main(String[] args) {
        double heightInCm = 175.0;
        double weightInKg = 60.0;
        System.out.println("Height = " + heightInCm + " cm.");
        System.out.println("Weight = " + weightInKg + " kg.");
        System.out.println("BMI = " + bmi(heightInCm, weightInKg));
    }

    public static double bmi(double heightCm, double weightKg) {
        double heightM = heightCm / 100.0;
        return weightKg / heightM / heightM;
    }
}
