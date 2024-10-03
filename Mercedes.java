public class Mercedes extends Car implements IVehicle, IWashable{
public Mercedes(){
    super();
    setModel("Mercedes E60");
    this.isElectric = false;
    setWeight(2300);
    this.speed = 0;
    updateHighestMaxSpeed(this.maxSpeed); // обновляем максимальную скорость
    updateHighestMaxSpeed(this.maxSpeed);
    this.maxSpeed = 230;

}
    String color = "Black";

    @Override
    public void cheepCar() {
        wash();
        start();
        Overclocking0_100InSeconds-=1;
        System.out.println("Теперь разгон до 100км/ч " + getModel() + " составляет " + Overclocking0_100InSeconds + " секунд");
        accelerate();
        brake();
    }

    public void start() {
        System.out.println(getModel() + " запущен.");
    }

    @Override
    public void accelerate() {
        start();
        speed+= 100;
        System.out.println(getModel() + "разогался до 100 км/ч за " + Overclocking0_100InSeconds + " секунд");

    }

    @Override
    public void brake() {
        speed-=100;
        System.out.println(getModel() + " был остановлен с помощью системы ABS, текущая скорость  " + speed + "км/ч");
    }

    @Override
    public void wash() {
    System.out.println(getModel()+ " помыта");
    }


}
