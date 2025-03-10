package statics;

public class StaticTests extends StaticSuper {
    static int rand;

    static {
        rand = (int) (Math.random()*6);
        System.out.println("static block" + rand);
    }

    StaticTests() {
        System.out.println("constructor");
    }

    public static void main(String[] args){
        System.out.println("in main");
        StaticTests st = new StaticTests();
        StaticSuper staticSuper = new StaticSuper();
        System.out.println(staticSuper.getAge());
        System.out.println(StaticSuper.AGE);
    }
}
