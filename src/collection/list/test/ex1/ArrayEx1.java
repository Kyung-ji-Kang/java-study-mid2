package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEx1 {

    public static void main(String[] args) {

        ArrayList<Integer> students  = new ArrayList<>();

        int total= 0;

        students.add(90);
        students.add(80);
        students.add(70);
        students.add(60);
        students.add(50);

        for(int stuedent : students){
            total += stuedent;
        }

        double average = (double)  total/ students.size();
        System.out.println("점수 총합: "+ total);
        System.out.println("점수 평균: "+ average);

    }
}
