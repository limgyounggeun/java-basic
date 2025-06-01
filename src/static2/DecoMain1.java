package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "Hello Java";
        DecoUtil1 d = new DecoUtil1();
        String deco = d.deco(s);
        System.out.println("After deco = " + s);
        System.out.println("Before deco = " + deco);
    }
}
