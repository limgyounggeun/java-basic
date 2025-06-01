package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C = " + Data3.count);

        //추가
        //인스턴스를 통한 접근
        //권장하지 않음 : count가 인스턴스의 변수로 오해 할 수 있기 때문이다.
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        //클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
