package acess;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        if(itemCount >= items.length && item == null){
            System.out.println("쇼핑카드 개수를 초과했거나, 아이템이 담기지 않았습니다..");
        }
        items[itemCount] = item;
        itemCount++;
    }
    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i < itemCount; i++){
            Item item = items[i];
            System.out.println("상품명 : " + item.getName() + " 합계 :" + item.getTotalPrice());
        }
        System.out.println("전체 가격 합계 " + calculateTotalPrice());
    }
    private int calculateTotalPrice(){
        int totalPrice = 0;
        for(int i = 0; i < itemCount; i++){
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
