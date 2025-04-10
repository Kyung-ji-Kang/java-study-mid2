package generic.test.ex3;

public class Shuttle <T extends  BioUnit>{

    private T unit;

    public void  in(T unit){
        this.unit = unit;
    }

    public T out(){
        return unit;
    }


    public void showInfo(){
        System.out.println("이름: "+this.unit.getName()+", HP: "+this.unit.getHp());
    }

}
