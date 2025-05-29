package class1;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductOrder order1 = new ProductOrder();
        ProductOrder order2 = new ProductOrder();
        ProductOrder order3 = new ProductOrder();

        order1.productName = "두부";
        order1.price = 2000;

        order2.productName = "김치";
        order2.price = 5000;

        order3.productName = "콜라";
        order3.price = 1500;

        ProductOrder[] orders = {order1, order2, order3};

        while (true) {
            System.out.println("주문할 상품 번호를 입력해주세요");

            int totalPrice = 0;
            int i = 1;

            for (ProductOrder order : orders) {
                System.out.println(i + "번");
                order.toString(order);
                totalPrice += order.price * order.quantity;
                i++;
            }

            System.out.println("총 금액: " + totalPrice + "원");

            String input = sc.nextLine();

            switch (input) {
                case "1":
                    order1.quantity++;
                    break;
                case "2":
                    order2.quantity++;
                    break;
                case "3":
                    order3.quantity++;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}
