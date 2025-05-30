package ref;

public class NullMain {
    public static void main(String[] args) {
        Data data = null;
        System.out.println(data);
        data = new Data();
        System.out.println(data);
        data = null;
        System.out.println(data);
        //new Data한 객체의 주소 번지를 참조하는 변수 data가 null을 가지므로 해당 객체를 참조하는 변수는 없다.
        //아무도 참조하지 않게되면 해당 참조값을 다시 구할 방법이 없다. 따라서 해당 인스턴스에 다시 접근할 방법이 없다.
        //이러한 인스턴스를 GC가 메모리에서 제거한다.
    }
}
