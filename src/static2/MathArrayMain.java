package static2;

import static static2.MathArrayUtils.*;

public class MathArrayMain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("sum = " + sum(arr));
        System.out.println("avg = " + average(arr));
        System.out.println("min = " + min(arr));
        System.out.println("max = " + max(arr));
    }
}
