package animal;

public abstract class Animal {
    String picture;
    String food;
    String hunger;
    String boundaries;
    String location;
    void makeNoise(){
        System.out.println("animalnoise");
    }
    void eat(){
        System.out.println("eat");
    }
    void sleep(){
        System.out.println("sleep");
    }
    void roam(){
        System.out.println("roam");
    }
}
