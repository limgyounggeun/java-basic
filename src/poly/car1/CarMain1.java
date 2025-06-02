package poly.car1;



public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.SetCar(k3Car);
        driver.drive();

        //차량 변경(k3 -> model3Car)
        Model3Car model3Car = new Model3Car();
        driver.SetCar(model3Car);
        driver.drive();

        //차량 변경(model3car -> newCar)
        NewCar newCar = new NewCar();
        driver.SetCar(newCar);
        driver.drive();
    }
}
