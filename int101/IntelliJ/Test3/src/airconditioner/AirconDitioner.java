package airconditioner;

import java.util.Scanner;
public class AirconDitioner {

    int targetTemperature;
    int fanSpeed;
    boolean airOn ;
    boolean fanOn ;
    int MIN_TEMPERATURE = 20;
    int MAX_TEMPERATURE = 30;
    int MAX_FAN_SPEED = 2;
    int MIN_FAN_SPEED = 0 ;
    String Status ="";
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a =new Scanner(System.in);

        int targetTemperature = a.nextInt();
        System.out.println("Temperature is " + targetTemperature);
        int fanSpeed = a.nextInt();
        System.out.println("fanspeed is " + fanSpeed);
        AirconDitioner bai = new AirconDitioner(targetTemperature,fanSpeed);
        System.out.println(bai.toString());
    }

    public AirconDitioner(int targetTemperature, int fanSpeed) {

        this.targetTemperature = targetTemperature;
        this.fanSpeed = fanSpeed;

    }
    public int getTargetTemperature() {
        return targetTemperature;
    }
    public boolean isAirOn( boolean airOn){
        airOn = "on".equals(Status);
        return airOn;//????
    }
    public void turnAirOnOff() {
        if (airOn == false && fanOn == false){
            Status ="on";
            //System.out.println("on");
        }
        else{
            Status ="off";
            //  System.out.println("air condiner is off");
        }
    }

    public void increaseTemperature (int MAX_TEMPERATURE) {
        if (targetTemperature>=MAX_TEMPERATURE){
            targetTemperature = MAX_TEMPERATURE;
        }
    }
    public void decreaseTemperature(int MIN_TEMPERATURE) {
        if (targetTemperature>=MIN_TEMPERATURE){
            targetTemperature=MIN_TEMPERATURE;
        }
    }
    public void cheangeFanspeed(int MIN_FAN_SPEED,int MAX_FAN_SPEED) {
        if(fanSpeed==MIN_FAN_SPEED){
            fanSpeed=Integer.parseInt("Low");
        }
        else if(fanSpeed==1){
            fanSpeed =Integer.parseInt("Medium");
        }
        else if(fanSpeed==MAX_FAN_SPEED){
            fanSpeed =Integer.parseInt("High");
        }
        else{fanSpeed =Integer.parseInt("High");}
    }
    @Override
    public String toString() {
        return "AirconDitioner{" + "targetTemperature=" + targetTemperature + ", fanOn=" + fanOn + ", Status=" + Status + '}';
    }


}


