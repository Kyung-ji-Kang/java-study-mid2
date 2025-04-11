package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private  List<Item> list ;

    public ShoppingCart() {
        list = new ArrayList<Item>();
    }

    public void add(Item item1) {
        list.add(item1);
    }

    public void displayItems() {

        for(Item tem : list){
            System.out.println("상품명:"+tem.getName()+", 합계:"+tem.getTotalPrice());

        }
        System.out.println("전체 가격 합:"+calculatSum());
    }

    private  int calculatSum(){
        int sum =0;
        for(Item tem: list){
            sum += tem.getTotalPrice();
        }
        return sum;
    }
}
