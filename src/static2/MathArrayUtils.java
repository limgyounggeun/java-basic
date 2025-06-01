package static2;

public class MathArrayUtils {
    private MathArrayUtils() {

    }
    public static int sum(int[] arr){
        int sum = 0;
//        for(int i=0; i<arr.length; i++){
//            sum += arr[i];
//        }
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
    public static double average(int[] arr){
        return sum(arr)/(double)arr.length;
    }
//    public static int min(int[] arr){
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]<arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        return arr[arr.length-1];
//    }
    public static int min(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
//    public static int max(int[] arr){
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]<arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        return arr[0];
//    }
    public static int max(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
