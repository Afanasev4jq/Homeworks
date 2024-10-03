public abstract class Car {
    private static int carCount = 0;  // общее количество автомобилей
    private static int highestMaxSpeed = 250;
      int maxSpeed = 240;
    private String model;
    boolean isElectric;
    private int weight = 1200;
    int Overclocking0_100InSeconds = 5;
    int speed;



    public static void updateHighestMaxSpeed(int speed) {
        if (speed > highestMaxSpeed) {
             speed = highestMaxSpeed;
        }
    }
    public void countOverclocking(){
        if (isElectric){
            Overclocking0_100InSeconds-=2;
            System.out.println("You have a very fast car! Acceleration of your car from 0 to 100 is " + Overclocking0_100InSeconds + " seconds" );
        }
        else {
            Overclocking0_100InSeconds+=1;
            System.out.println("Acceleration of your car from 0 to 100 is " + Overclocking0_100InSeconds + " seconds" );
        }
    }
    public Car() {
        carCount++; // увеличиваем счетчик при создании нового экземпляра
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = String.valueOf(model);
    }
    public static int getCarCount() {
        return carCount; // метод для получения общего количества автомобилей
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract void cheepCar();
}