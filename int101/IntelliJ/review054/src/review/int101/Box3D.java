package review.int101;

public class Box3D {
    private double width;
    private double height;
    private static double length;
    private static String color;

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public static double getLength() {
        return length;
    }
    public static String getColor() {
        return color;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public static void setLength(double length) {
        Box3D.length = length;
    }
    public static void setColor(String color) {
        Box3D.color = color;
    }

    public Box3D(double width,double height){
        this.width=width;
        this.height=height;
    }

    public double computeVolume(){
        return width * height * length ;
    }
    public boolean canCover(Box3D daw){
        return this.height >= daw.height && this.width >= daw.width ;
    }

    @Override
    public String toString() {
        return "Box3D{" + "width=" + width + ", height=" + height + ", length=" + length + '}';
    }
}
