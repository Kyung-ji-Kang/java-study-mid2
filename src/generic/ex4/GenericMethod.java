package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj){
        System.out.println("Object print: "+obj);
        return obj;
    }

    public static <T extends Number> T genericMethod(T t){
        System.out.println("bound print: "+ t);
        return t;
    }

    public static <T> T numberMethod(T t){
        System.out.println("generic print: "+ t);
        return t;
    }




}
