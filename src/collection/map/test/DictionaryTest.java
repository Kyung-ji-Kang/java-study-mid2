package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        run();
    }

    private static void inputSection(Scanner sc, Map<String,String> dictionary){

        System.out.println("==단어 입력 단계==");
        while(true){
            System.out.print("영어 단어를 입력하세요 (종료는'q'): ");
            String key = sc.nextLine();
            if(key.equals("q")){
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String value = sc.nextLine();
            dictionary.put(key,value);
        }
        System.out.println();

    }

    private  static void searchSection(Scanner sc, Map<String,String> dictionary){

        System.out.println("==단어 검색 단계==");

        while(true){
            System.out.print("찾을 영어 단어를 입력하세요 (종료는'q'): ");
            String key = sc.nextLine();
            if(key.equals("q")){
                break;
            }
            if(dictionary.containsKey(key)){
                System.out.println(key+"의 뜻: "+dictionary.get(key));
            }
            else {
                System.out.println(key+"은(는) 사전에 없는 단어입니다.");
            }

        }
    }
    private static void run(){
        Scanner sc = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();
        inputSection(sc,dictionary);
        searchSection(sc,dictionary);
    }


}
