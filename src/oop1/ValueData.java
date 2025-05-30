package oop1;

public class ValueData {
    int data;

    void add(){
        this.data++;
        System.out.println("숫자 증가 : "+this.data);
    }
    void down(){
        this.data--;
        System.out.println("숫자 감소 : "+this.data);
    }
}
