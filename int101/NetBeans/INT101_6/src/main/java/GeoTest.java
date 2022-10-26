import geometry.*;
import tool.*;
public class GeoTest {
  public static void main(String[] args) {
        var radius = 5.0;
        var side1 = 5;
        var side2 = 6;
        System.out.println("Area="+GeometryUtil.computeCircleArea(radius));
        System.out.println("Perimeter="+GeometryUtil.computeCirclePerimeter(radius));
        System.out.println("RightTrianggle="+GeometryUtil.computeRightTrianggleSide(side1,side2));
        convertorTest();

    }
    private static void convertorTest (){
        Convertor inchTocm = new Convertor(2.54,"InchTocm");
        Convertor kgTopound = new Convertor(2.20,"kgToPound");
        System.out.println(inchTocm);
        System.out.println(kgTopound);
        var kg = 5.0;
        var lbs =220.0;
    }
}
