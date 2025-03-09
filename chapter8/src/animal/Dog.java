package animal;

public class Dog extends Canine{
    @Override
    void makeNoise() {
        System.out.println("WffWff");
    }

    @Override
    void eat() {
        System.out.println("dog eat");
    }
}
