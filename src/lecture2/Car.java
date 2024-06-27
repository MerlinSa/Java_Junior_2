package lecture2;

public class Car {
   public String name;
  public String price;
  public String engType;
  public String engPower;
  public int maxSpeed;


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(String name) { //конструктор с полем нейм
        this.name = name;
        this.engType = "V8";
        this.engPower = "1000";
        this.maxSpeed = 100;
        this.price = "1000000";

    }

    @Override
    public String toString() {
        return "lecture2.Car{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
