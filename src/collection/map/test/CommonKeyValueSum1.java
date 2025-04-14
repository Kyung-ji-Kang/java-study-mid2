package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);


        // 코드 작성
        Map<String, Integer> map3 = new HashMap<>();


        for(String st: map1.keySet()){
            if(map2.containsKey(st)){
                int sum = map1.get(st)+map2.get(st);
               map3.put(st,sum);
            }
        }

        System.out.println(map3);




    }
}
