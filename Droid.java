class Droid {
  public int batteryLevel;
  
  public Droid() { 
    batteryLevel = 100;
  }
  
  //method that starts the droid
  public void activate() {
    System.out.println("Doid Activated. How may I assit you?");
    //each action uses battery
    batteryLevel = batteryLevel - 5;
    System.out.println("Battery level is: " + batteryLevel + " percent.");
  }
  
  //method to charge the rbot for a certain # of hours
  public void chargeBattery(int hours) {
    System.out.println("Droid charging...");
    batteryLevel = batteryLevel + hours;
    //makes sure the droid doesn't over charge
    if (batteryLevel > 100) {
      batteryLevel = 100;
      System.out.println("Battery level is: " + batteryLevel + " percent.");
    }
    
   	else {
      System.out.println("Battery level is: " + batteryLevel + " percent.");
    }
  }
  
  //method to check the battery level
  public int checkBatteryLevel() {
    System.out.println("Battery level is: " + batteryLevel + " percent.");
    return batteryLevel;
  }
  
  //method to make the doid "hover"
  public void hover(int feet) {
    if (feet > 2) {
      System.out.println("Error: I cannot hover above 2 feet.");
    }
    
    else {
      System.out.println("Hovering...");
      batteryLevel = batteryLevel - 20;
      System.out.println("Battery level is: " + batteryLevel + " percent.");
    }
  }
  
  public static void main(String[] args) {
    Droid Droid = new Droid();
    //calling our methods
    Droid.activate();
    Droid.chargeBattery(5);
    Droid.hover(1);
  }
}
