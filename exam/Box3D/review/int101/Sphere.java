package review.int101;

public class Sphere {
    private double radius ;
    public Sphere(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double computeVolume(){
        return Math.PI * 4.0/3.0 * Math.pow(radius,3) ;
    }
    public double computeSurface(){
        return Math.PI * 4.0 * Math.pow(radius,2) ;
    }
    public double compareVolume(Sphere s) {
        return this.computeVolume() / s.computeVolume()  ;
    }
}
