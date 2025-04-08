package generic.ex1;

public class GenericBox <T> {

    private T value; // 타입 매개변수
    public void set(T value){
        this.value = value;
    }

    public T get(){
        return this.value;
    }


}
