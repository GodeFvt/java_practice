package testing;

public class MainTest {
    public static void main(String[] args) {
        testIfStatment();

    }
    private static void testIfStatment(){
        var score = 54.6;
        if (score > 50.0 ) {
            var x = 7.6 ;
            System.out.println("Pass" + x);
        }
        var x = true;
        System.out.println("Finish" + x);
    }
}
