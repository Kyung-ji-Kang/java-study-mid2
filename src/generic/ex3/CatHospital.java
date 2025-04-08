package generic.ex3;
import  generic.animal.Cat;
import generic.animal.Dog;


public class CatHospital {

    private Cat animal ;

    public void set(Cat anmial){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름: "+ animal.getName());
        System.out.println("동물 크키: "+ animal.getSize());
        animal.sound();
    }

    public Cat bigger(Cat target){
        return animal.getSize() > target.getSize() ? animal : target;
    }



}
