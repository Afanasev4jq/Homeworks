
public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW("BMW X5", 2800,"Red");
        Mercedes merc = new Mercedes();
       merc.countOverclocking();
       System.out.println(bmw.maxSpeed);
       bmw.cheepCar();
       merc.cheepCar();
        BMW bmw1 = new BMW("BMW M3", 1400,"BLue");
        System.out.println("Максимальная скорость BMW X7: " + bmw1.getMaxSpeed());
        Car.updateHighestMaxSpeed(bmw1.getMaxSpeed());
    }
}