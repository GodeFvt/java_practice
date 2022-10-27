package bmi;

public class bmical {

    public String name;
    public double heightInCm;
    public double weightInKg;

    public bmical(String name, double heightInCm, double weightInKg) {
        this.name = name;
        this.heightInCm = heightInCm;
        this.weightInKg = weightInKg;
    }

    public String toString() {
        return "bmical{" + "name=" + name + ", heightInCm=" + heightInCm + ", weightInKg=" + weightInKg + '}';
    }

    public double bmi() {
        double heightM = heightInCm / 100.0;
        return weightInKg / heightM / heightM;
    }
}
