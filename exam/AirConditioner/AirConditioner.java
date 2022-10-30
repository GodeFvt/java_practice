public class AirConditioner {
    int MIN_TEMPERATURE = 20;
    int MAX_TEMPERATURE = 30;
    int MAX_FAN_SPEED = 2;
    int MIN_FAN_SPEED = 0;
    boolean airOn;
    boolean fanOn;
    int targetTemperature;
    int fanSpeed;
    //constructor
    public AirConditioner(int targetTemperature,int fanSpeed){
      if (targetTemperature >= MAX_TEMPERATURE){
          this.targetTemperature=MAX_TEMPERATURE;
      }else if (targetTemperature <= MIN_TEMPERATURE){
          this.targetTemperature=MIN_TEMPERATURE;
      }else {
          this.targetTemperature=targetTemperature;
      }
      if(fanSpeed >= MAX_FAN_SPEED) {
          this.targetTemperature = MAX_FAN_SPEED;
      }else if(fanSpeed <= MIN_FAN_SPEED) {
          this.targetTemperature = MIN_FAN_SPEED;
      }else{
          this.fanSpeed = fanSpeed;
      }
    }
    //
    public boolean isAirOn(){
        return  airOn;
    }

    public int getTargetTemperature() {
        return targetTemperature;
    }

    public void turnAirOnOff(){
        if(isAirOn() == false){
            airOn = true;
            fanOn = true;
        }else {
            airOn = false;
            fanOn = false;
        }

    }

    public void increaseTemperature(){
        if (targetTemperature < MAX_TEMPERATURE) targetTemperature++;
    }

    public void decreaseTemperature(){
        if (targetTemperature > MIN_TEMPERATURE)targetTemperature--;
    }

    public void changeFanSpeed() {
        fanSpeed++;
        if(fanSpeed > MAX_FAN_SPEED) {
            fanSpeed = MIN_FAN_SPEED;
        }
    }

    @Override
    public String toString() {
        String speed = "";
        if (fanSpeed == 0) speed = "low";
        else if (fanSpeed == 1) speed = "medium";
        else if (fanSpeed == 2) speed = "high";
        if(isAirOn() == false){
            return "Air Conditioner {Status: off}";
        }else {
            return "Air Conditioner {Status: on, Temp: " + targetTemperature + ", Fan:" + speed + "}";
        }
    }

    public static void main(String[] args) {
        AirConditioner air =new AirConditioner(15,1);
        air.turnAirOnOff();
        System.out.println(air);
        air.turnAirOnOff();
        System.out.println(air);
    }
}
