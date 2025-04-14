package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] starr = text.split(" ");

        Map<String, Integer> str_map = new HashMap<>();

        int sum = 0;
        for(String st : starr){

            if(str_map.containsKey(st)){
                str_map.put(st,str_map.get(st)+1);
            }
            else{
                str_map.put(st,1);
            }
        }

        System.out.println(str_map);


    }
}
