package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while(true){

            int num = sc.nextInt();
            if(num==0){
                break;

            }
            list.add(num);

        }
        System.out.println(getSum(list));
        System.out.println(getAverage(list));

    }

    private static double getAverage(ArrayList<Integer> list) {
        return (double)getSum(list)/list.size();
    }

    private static Integer getSum(ArrayList<Integer> list) {
        int sum = 0;
        for(int num: list){
            sum += num;
        }
        return  sum;
    }


}
