package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));
        //코드 작성
        System.out.println("합집합: "+union(set1,set2));
        System.out.println("교집합: "+intersection(set1,set2));
        System.out.println("차집합: "+difference(set1,set2));

    }
    //합집합
    private  static Set<Integer> union(Set<Integer> set1, Set<Integer> set2 ){
        Set<Integer> newSet = new HashSet<>();

        for(Integer num : set1){
            newSet.add(num);
        }

//        for(Integer num : set2){
//            newSet.add(num);
//        }

        newSet.addAll(set2);
        return newSet;
    }

//    교집합

    private  static Set<Integer> intersection(Set set1, Set set2 ){
        Set<Integer> newSet = new HashSet<>();

        for(Object num1: set1){
            for(Object num2 : set2){
                if(num1.equals(num2)){
                    newSet.add((Integer) num2);
                }
            }
        }

    return  newSet;
    }

    //처집합(집합1 - 집합2)


    private  static Set<Integer> difference(Set<Integer> set1, Set<Integer> set2 ){
        Set<Integer> newSet = new HashSet<>(set1);

        for(Integer num: set2){
            newSet.remove(num);
        }


        return  newSet;

    }
}
