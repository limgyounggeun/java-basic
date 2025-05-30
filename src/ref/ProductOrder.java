package ref;

public class ProductOrder {
    String productName;
    int price;
    int quantity;

    public int totalPrice(){
        return price * quantity;
    }
    public void toString(ProductOrder order){
        System.out.println("상품명 : " + order.productName+"," + " 가격 : " + order.price+"," + " 수량 : " + order.quantity);
    }
}
