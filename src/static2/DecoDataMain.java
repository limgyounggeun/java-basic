package static2;
import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1.정적 호출");
        staticCall(); //import static - 메서드 자체를 선언, 클래스명 생략 가능
        DecoData.staticCall();
        DecoData.staticCall();


        System.out.println("2.인스턴스 호출 호출 1");
        DecoData d = new DecoData();
        d.instanceCall();

        System.out.println("2.인스턴스 호출 2");
        DecoData d1 = new DecoData();
        d1.instanceCall();


        //추가
        //인스턴스를 통한 접근
        DecoData d3 = new DecoData();
        d3.staticCall();

        //클래스를 통한 접근
        DecoData.staticCall();
    }
}
