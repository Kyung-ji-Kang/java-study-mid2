package generic.test.ex3;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1 (Shuttle<T> unit){
        BioUnit unit1 = unit.out();
        System.out.println("이름: "+unit1.getName()+", HP: "+unit1.getHp());
    }

    public static  void printV2 (Shuttle<? extends BioUnit > unit){
        BioUnit unit1 = unit.out();
        System.out.println("이름: "+unit1.getName()+", HP: "+unit1.getHp());
    }


}
