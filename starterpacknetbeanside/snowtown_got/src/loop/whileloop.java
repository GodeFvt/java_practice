package loop;

public class whileloop {

    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        while (true) {
            System.out.println(a);
            a++;
            if (a == 25000) {
                break;
            }
        }
    }
}
