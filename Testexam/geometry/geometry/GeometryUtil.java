package geometry;

public class GeometryUtil {


    /**
     * compute the area of the circle with the given radius.
     * @param radius of the circle.
     * @return the area of the circle, given the radius.
     */
    public static double computeCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * compute the perimeter of the circle with the given radius.
     * @param radius of the circle.
     * @return the perimeter of the circle, given the radius.
     */
    public static double computeCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    /**
     * compute the opposite side to the right angle of a right triangle,
     * given the two sides of the triangle.
     * @param side1
     * @param side2
     * @return the length of the opposite side to the right angle of a right triangle.
     */
    public static double computeOppositeSideOfRightTriangle(double side1, double side2) {
        return Math.sqrt(side1 * side1 + side2 * side2);
    }




}
