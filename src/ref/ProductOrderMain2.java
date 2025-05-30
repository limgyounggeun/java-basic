package ref;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요");
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] productOrders = new ProductOrder[n];
        for (int i = 0; i < productOrders.length; i++) {
            System.out.println((i+1)+"번째 주문 정보를 입력하세요");
            System.out.println("상품명 :");
            String productName = sc.nextLine();
            System.out.println("가격 :");
            int price = sc.nextInt();
            System.out.println("수량 :");
            int quantity = sc.nextInt();
            sc.nextLine(); //입력 버퍼를 비우기 위한 코드

            productOrders[i] = createProduct(productName, price, quantity);
        }
        printProduct(productOrders);
        getTotalAmount(productOrders);

    }
    static ProductOrder createProduct(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }
    static void printProduct(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명 : " + productOrder.productName+ ", 상품 가격 : " + productOrder.price + ", 수량 : " + productOrder.quantity);
        }
    }
    static void getTotalAmount(ProductOrder[] productOrders) {
        int totalAmount = 0;
        for(ProductOrder productOrder : productOrders) {
            totalAmount += productOrder.quantity * productOrder.price;
        }
        System.out.println("총 가격 : " + totalAmount);
    }
}
