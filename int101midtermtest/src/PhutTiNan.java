public class PhutTiNan {
    private double mass;
    private double volume;
    private final double density;
    public PhutTiNan(double mass , double volume ){
        this.mass=mass;
        this.volume=volume;
        this.density=mass/volume;
    }
    public PhutTiNan(double density){
        this.density=density;
    }
    public double getDensity() {
        return density;
    }
    public double getMass() {
        return mass;
    }
    public double getVolume() {
        return volume;
    }
    public void setMass(double mass) {
        this.mass = mass;
        volume =mass/density;

    }
    public void setVolume(double volume) {
        this.volume = volume;
        mass = volume*density;
    }
    @Override
    public String toString() {
        return "Phuttinan{" +
                "mass=" + mass +
                ", volume=" + volume +
                ", density=" + density +
                '}';
    }
}
