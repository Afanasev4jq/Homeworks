public class BMW extends Car implements IVehicle, IWashable {
    public BMW(String model, int weight, String color) {
        super(); // Вызов конструктора родительского класса
        this.speed = 0;
        this.maxSpeed = 270;
        updateHighestMaxSpeed(this.maxSpeed); // обновляем максимальную скорость
        this.isElectric = true;
        setModel(model);
        setWeight(weight);
        this.color = color; // Устанавливаем цвет через параметр
    }
    String color;

    @Override
    public void countOverclocking(){
        if (isElectric){
            Overclocking0_100InSeconds -= 2;
            System.out.println("You have " + getModel() + "! Acceleration of your car from 0 to 100 is " + Overclocking0_100InSeconds + " seconds");
        } else {
            Overclocking0_100InSeconds += 1;
            System.out.println("Acceleration of your car from 0 to 100 is " + Overclocking0_100InSeconds + " seconds");
        }
    }

    @Override
    public void cheepCar() {
        wash();
        start();
        Overclocking0_100InSeconds -= 1;
        System.out.println("Теперь разгон до 100км/ч " + getModel() + " составляет " + Overclocking0_100InSeconds + " секунд ");
        accelerate();
        brake();
    }

    @Override
    public void start() {
        System.out.println(getModel() + " запущен.");
    }

    @Override
    public void accelerate() {
        start();
        speed += 100;
        System.out.println(getModel() + " разогнался до 100 км/ч за " + Overclocking0_100InSeconds + " секунд");
    }

    @Override
    public void brake() {
        speed -= 100;
        System.out.println(getModel() + " плавно остановлен, его текущая скорость составляет " + speed);
    }

    @Override
    public void wash() {
        System.out.println(getModel() + " помыта и теперь выглядит как новая!");
    }
}