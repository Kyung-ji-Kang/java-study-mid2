package generic.test.ex3;

public class UnitUtil <T> {

    public static <T extends BioUnit> T maxHp(T target1, T targer2 ){
        return (target1.getHp()>targer2.getHp()?target1:targer2);
    }

}
