package poly.car1;

public class Driver {
    private Car car;

    public void SetCar(Car car) {
        System.out.println("자동차를 설정합니다" + car);
        this.car = car;
    }
    public void drive(){
        System.out.println("자동 차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
