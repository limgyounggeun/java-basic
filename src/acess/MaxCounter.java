package acess;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        //검증 로직
        if(count >= max) {
            System.out.println("최대 값을 초과할수 없습니다.");
            return;
        }
        //실행로직
        count++;
        System.out.println("숫자를 하나 증가 했습니다. 현재 count " + count);
        System.out.println("Max count " + max);
    }
    public void getCount(){
        System.out.println("현재 count "+count);
    }

}
