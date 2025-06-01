package final1;

public class MemberMain {
    public static void main(String[] args) {
        Member m = new Member("myId", "kim");
        m.print();
        m.changeData("myId2", "Lim");
        m.print();
    }
}
