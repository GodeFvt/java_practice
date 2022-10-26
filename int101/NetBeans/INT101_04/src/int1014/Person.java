package int1014;
public class Person {
    public static void main(String[] args) {
        //demoTypes();
        //demoOperations();
        demoMethods();
    }
    private static void demoTypes() {
        boolean bl = true;
        byte by0 = 0b00001111; //15
        byte by1 = (byte) 0b11110000; //-16
        short sh0 = 0x0FFF;
        short sh1 =  (short) 0x1FFF;
        char c = 'a' ;
        int i = -5 ;
        long ln =7L;
        float f = 0.45F;
        double d = 0.54;
        //System.out.format("bl=%b\n%d\n%d\n%d\n%d\n%d\n%d", bl,by0,by1,sh0,sh1,c,i,ln,f,d);
    }
    
    private static void demoOperations() {
        System.out.println("====DemoOperations====");
        int i = 0;
//        System.out.println("In");
//        System.out.println("i="+i +","+i++ +"," +i);
//        System.out.println("i="+i +","+i-- +"," +i);
//        System.out.println("i="+i +","+ --i +"," +i);
//        System.out.println("i="+i +","+ ++i +"," +i);
//        System.out.println("====String concat====");
//        System.out.println("a"+5*7);
//        System.out.println(5*7+"a");
//        System.out.println("a"+ 5+7);
//        System.out.println(5+7+"a");
        
        i =0xFFFF0000 ;
        System.out.printf("%d,%s,%s\n",i,Integer.toString(i,16),Integer.toString(i,2));
        System.out.printf("%32s\n%16s\n",Integer.toString(i,2),Integer.toString(i >>> 2,2));    
        
        
    }
    private static void demoMethods() {
        emptyMethod();
        withParameter(20);
    }
    private static void emptyMethod(){
        
    }
    private static void withParameter(int x){
        System.out.println("x="+x);
    }
}
