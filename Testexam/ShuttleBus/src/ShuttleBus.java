public class ShuttleBus {
    String busId;
    int frontDoor;
    int rearDoor;
    int noOfPassengers;
    int odometer;
    int money;

    //getsetidbus
    public String getBusId() {
        return busId;
    }
    public void setBusId(String busId) {
        this.busId = busId;
    }
    //frontDoor and rearDoor
    public void closeFrontDoor(){
        frontDoor = 1;
    }
    public void openFrontDoor(){
        frontDoor = 0;
    }
    public void closeRearDoor(){
        rearDoor = 1;
    }
    public void openRearDoor(){
        rearDoor = 0;
    }
    public void lockDoors(){
        frontDoor = 2;
        rearDoor = 2;
    }
    //
    public  void addPassengers(int passengers){
        noOfPassengers += noOfPassengers;
        incrementMoney(passengers);
    }
    public void incrementMoney(int money){
        this.money = money*7;
    }
    public int getMoney() {
        return money;
    }

    public void go(){
        incrementOdometer();
    }
    public void incrementOdometer(){
        this.odometer+=800;
    }

    public ShuttleBus(String busId){
        this.busId=busId;
    }
    public ShuttleBus(String busId,int odometer){
        this.busId=busId;
        this.odometer=odometer;
    }
    public ShuttleBus(String busId,int odometer,int money){
        this.busId=busId;
        this.odometer=odometer;
        this.money=money;
    }

    @Override
    public String toString() {
        return "ShuttleBus{" +
                "busId='" + busId + '\'' +
                ", frontDoor=" + frontDoor +
                ", rearDoor=" + rearDoor +
                ", noOfPassengers=" + noOfPassengers +
                ", odometer=" + odometer +
                ", money=" + money +
                '}';
    }

    public static void main(String[] args) {
        ShuttleBus sb1 = new ShuttleBus("B#001");
        ShuttleBus sb2 = new ShuttleBus("B#002");
        sb1.setBusId("B#001");
        sb2.setBusId("B#002");
        sb1.lockDoors();
        sb2.openFrontDoor();
        sb2.closeRearDoor();
        sb1.addPassengers(7);
        sb2.addPassengers(10);
        sb1.go();
        sb1.go();
        sb1.go();
        sb2.go();
        sb2.go();
        System.out.println(sb1);
        System.out.println(sb2);
    }
}
