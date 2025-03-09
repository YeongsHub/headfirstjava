package animal;

public class Cat extends Feline{

    int age;

    public Cat(int age) {
        super("mina");
        System.out.println("creating a cat");
        this.age = age;
    }


    @Override
    void makeNoise() {
        super.makeNoise();
        System.out.println("Ya - ong");
    }

    @Override
    void roam() {
        System.out.println("cat roam");
    }
}
