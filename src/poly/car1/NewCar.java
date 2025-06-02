package poly.car1;

public class NewCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("New Car. startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("New Car. offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("New Car. pressAccelerator");
    }
}
