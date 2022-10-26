
package geometry;

public class GeometryUtil {
    
      public static double computeCircleArea(double radius){
        return Math.PI * radius * radius ;
    }
      public static double computeCirclePerimeter (double radius){
        return Math.PI * 2 * radius ;
    }
       public static double computeRightTrianggleSide (double side1,double side2){
        return Math.sqrt((side1 * side1) + (side2 * side2));
    }
}
