package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();


    // 코드 작성

    public void add(Product product, int quantity) {
        if(cartMap.containsKey(product)){
            cartMap.put(product,(cartMap.get(product))+quantity);
        }else{
            cartMap.put(product,quantity);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for(Product product: cartMap.keySet()){
            System.out.println("상품: "+product+"수량: "+ cartMap.get(product));
        }
    }

    public void minus(Product product, int quantity) {
        if (cartMap.get(product).equals(quantity)){
            cartMap.remove(product);
        }
        else{
            cartMap.put(product,cartMap.get(product)-quantity);
        }
    }
}
