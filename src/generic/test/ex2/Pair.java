package generic.test.ex2;

public class Pair<F,S>{

    private F first ;
    private S second ;

    public void setFirst(F value){
        this.first = value;
    }

    public void setSecond(S value){
        this.second = value;
    }

    public F getFirst(){
        return this.first;
    }

    public S getSecond(){
        return  this.second;
    }

    @Override
    public String toString() {
        return "{first = "+ this.first+", second = "+ this.second+" }";
    }
}
