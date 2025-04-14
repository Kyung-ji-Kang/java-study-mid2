package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ItemPriceTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);
        // 코드 작성

        Map<String, Integer> result = new HashMap<>();

        for(String key: map.keySet()){
            if(map.get(key).equals(1000)){
                result.put(key,map.get(key));
            }
        }
        System.out.println(result.keySet());

    }
}
