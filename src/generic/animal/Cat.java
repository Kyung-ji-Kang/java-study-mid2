package generic.animal;

public class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    public Cat(String name, int size) {
        super(name, size);
    }
}
