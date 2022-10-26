package review.main;
import review.int101.Box3D;
import review.int101.Sphere;
import review.int101.ReviewStatic;

public class ReviewMain {
    public static void main(String[] args) {
        testBox3D();

    }
    public static void testStatic(){
        System.out.println(ReviewStatic.computeSphereVolume(5));
        System.out.println(ReviewStatic.computeBoxVolume(5,5,5));
        System.out.println(ReviewStatic.findMax2(5,9,6));
        System.out.println(ReviewStatic.product(2,6,2));
        System.out.println(ReviewStatic.product2(2,6,2));
        System.out.println(ReviewStatic.positiveSum(3,2,5,5));
        System.out.println(ReviewStatic.positiveSum2(3,2,5,5));
    }
    public static void testSphere(){
        Sphere s1 = new Sphere(5.0);
        Sphere s2 = new Sphere(10.0);
    }
    public static void testBox3D(){
        Box3D.setLength(5.0);
        Box3D.setColor("Red");
        Box3D b1 = new Box3D(5.0,10.0);
        Box3D b2 = new Box3D(10.0,15.0);
        Box3D b3 = new Box3D(15.0,20.0);
        b1.computeVolume();
        b2.computeVolume();
        System.out.println(b1.canCover(b2));
    }
}
