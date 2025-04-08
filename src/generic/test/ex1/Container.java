package generic.test.ex1;

public class Container <T>{

    private boolean isEmpty=true;
    private T item;


    public boolean isEmpty(){
        if(this.item != null){
            this.isEmpty = false;
        }
        else {
            this.isEmpty = true;
        }
        return isEmpty;
    }

    public T getItem(){
        return item;
    }

    public void setItem(T item){
        this.item = item;
    }

}
