package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData ;
    private int size = 0;


    public MyArrayListV1(){
        elementData = new Object[DEFAULT_CAPACITY]; //정적변수로 배열 생성
    }

    public MyArrayListV1(int initialCapacity){
        elementData = new Object[initialCapacity]; //값을 받아서 배열 생성
    }

    public int size(){
        return size;  //사이즈값 반환
    }

    public void add(Object e){
        elementData[size++] = e; //배열추가와 동시에 사이즈값 증가
    }

    public Object get(int index){
        return elementData[index]; //인덱스에 있는 값 가져옴
    }

    public Object set(int index, Object element){
        Object oldValue = get(index); //원래있던 인덱스의 값을 새로운 변수에 집어넣음
        elementData[index] = element; //인덱스에있던값 새로운 인자받아서 집어넣기
        return oldValue; //원래있던 값 반환
    }

    public int indexOf(Object o){
        for(int i=0; i<size; i++){
          if(o.equals(elementData[i]))  {
              return i;  //순환을하여 인자값에맞는 인덱스 반환
          }
        }
        return -1;  //못찾으면 -1 반환
    }

    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData,size))+"size = "+ size+
                ", capacity = "+ elementData.length;
    }




}
