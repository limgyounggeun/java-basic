package extends1;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public void print() {
        System.out.println("이름 : " + name + "가격" + price);

    }
}
