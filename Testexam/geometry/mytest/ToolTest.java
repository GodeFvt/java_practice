package mytest;
import geometry.*;
import tool.convertion.*;
public class ToolTest {
    public static void main(String[] args) {
        testGeometryUtil();
        Converter c;
        testConverter();
    }

    private static void testGeometryUtil() {
        System.out.println("\nTest GeometryUtil class ==============");
        double r = 5.0;
        System.out.format("Area of Circle with Radius %.2f = %.2f%n", r,
                GeometryUtil.computeCircleArea(r));
        System.out.format("Perimeter of Circle with Radius %.2f = %.2f%n", r,
                GeometryUtil.computeCirclePerimeter(r));
        double s1 = 3.0, s2 = 4.0;
        System.out.format("Opposite Side of Right Triangle with Sides: %.2f x %.2f = %.2f%n",
                s1, s2, GeometryUtil.computeOppositeSideOfRightTriangle(s1, s2));
    }

    private static void testConverter() {
        System.out.println("\nTest Converter class ==============");
        Converter inchToCm = new Converter("Inch-to-Cm", 2.54);
        System.out.println(inchToCm);
        var inch = 3.0;
        var cm = 30.0;
        System.out.format("Convert: %.2f inch = %.2f cm.%n", inch, inchToCm.convert(inch));
        System.out.format("Invert: %.2f cm = %.2f inch.%n", cm, inchToCm.invert(cm));

        var kmToMile = new Converter("Km-to-Mile", 5.0/8.0);
        System.out.println(kmToMile);
        var km = 10.0;
        var mile = 20.0;
        System.out.format("Convert: %.2f km = %.2f mile.%n", km, kmToMile.convert(km));
        System.out.format("Invert: %.2f mile = %.2f km.%n", mile, kmToMile.invert(mile));
    }
}
