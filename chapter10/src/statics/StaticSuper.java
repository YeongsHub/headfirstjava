package statics;

public class StaticSuper {

    private int age = 23;

    public static final int AGE = 23;
    
    static {
        System.out.println("super static block");
    }
    StaticSuper() {
        System.out.println("super constructor");
    }

    public int getAge() {
        return age;
    }
}
