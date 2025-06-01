package static2;

public class Car {
    private String name;
    static int cnt;

    public Car(String name){
        System.out.println("차량 구입, 이름: " +name);
        this.name=name;
        cnt++;
    }
    public static void showTotalCars(){
        System.out.println("구매한 차량수 :" + cnt);
    }
}
